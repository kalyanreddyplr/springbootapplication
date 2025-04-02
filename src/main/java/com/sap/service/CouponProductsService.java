package com.sap.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.dto.CouponResponce;
import com.sap.entity.BpclSapPayloads;
import com.sap.entity.CouponProducts;
import com.sap.repository.BpclSapPayloadsRepo;
import com.sap.repository.CouponProductsRepo;

import jakarta.transaction.Transactional;

@Service
public class CouponProductsService {

    private static final Logger logger = LoggerFactory.getLogger(CouponProductsService.class);

    @Autowired
    private CouponProductsRepo couponRepo;

    @Autowired
    private BpclSapPayloadsRepo bpclSapPayloadsRepo; // Repository for bpcl_sap_payloads table

    @Transactional
    public void addCouponProducts(List<CouponResponce> requestList) {
        logger.info("Processing {} coupon products.", requestList.size());

        BpclSapPayloads payloadEntry = new BpclSapPayloads();
        payloadEntry.setApiName("coupondata");
        payloadEntry.setApiUrl("/productCoupon");
        payloadEntry.setApiData(requestList.toString()); // Store request payload
        payloadEntry.setCreatedOn(new Date());
        payloadEntry.setCreatedBy(1);
        payloadEntry.setStatus("1"); // Initial status
        payloadEntry = bpclSapPayloadsRepo.save(payloadEntry); // Save and get the auto-generated ID

        try {
            for (CouponResponce request : requestList) {
                logger.info("Processing coupon for Product Code: {}", request.getProdCode());

                CouponProducts cp = new CouponProducts();
                cp.setProd_code(request.getProdCode());
                cp.setAlt_bom(request.getAltBom());
                cp.setBom_text(request.getBomText());
                cp.setCoupon_batch_code(request.getCouponCode());
                cp.setLoc_code(request.getLocCode());
                cp.setCreated_on(new Date());
                cp.setCreated_by(1);
                cp.setSap_date(request.getDate());
                cp.setSap_time(request.getTime());
                cp.setStatus("A");

                couponRepo.save(cp);
                logger.info("Coupon saved successfully for Product Code: {}", request.getProdCode());
            }

            // Update status to 'S' after successful processing
            payloadEntry.setStatus("S");
            payloadEntry.setUpdatedOn(new Date());
            payloadEntry.setUpdatedBy(1);
            bpclSapPayloadsRepo.save(payloadEntry);

            logger.info("All coupon products processed successfully.");
        } catch (Exception e) {
            // Update status to 'E' if error occurs
            payloadEntry.setStatus("E");
            payloadEntry.setUpdatedOn(new Date());
            payloadEntry.setUpdatedBy(1);
            payloadEntry.setErrorData(e.getMessage());
            bpclSapPayloadsRepo.save(payloadEntry);

            logger.error("Error processing coupons: {}", e.getMessage(), e);
            throw e;
        }
    }
}
