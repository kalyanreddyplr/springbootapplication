package com.sap.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.dto.DeliverynoteResponce;
import com.sap.entity.DeliveryNoteDetailEntity;
import com.sap.entity.DeliveryNoteEntity;
import com.sap.repository.DeliveryNoteRepo;
import com.sap.repository.LocationsRepo;
import com.sap.repository.ProductsRepo;

import jakarta.transaction.Transactional;

@Service
public class DeliverynoteService {

    private static final Logger logger = LoggerFactory.getLogger(DeliverynoteService.class);

    @Autowired
    DeliveryNoteRepo dnrepo;

    @Autowired
    LocationsRepo LocationRepo;

    @Autowired
    ProductsRepo productsRepo;

    @Transactional
    public void createDeliveryNote(DeliverynoteResponce request) {
        logger.info("createDeliveryNote method is being called.");
        logger.debug("Request Data: {}", request);

        DeliveryNoteEntity dn = new DeliveryNoteEntity();
        dn.setDn_no(request.getDelvOrdNo());
        dn.setDest_loc_id(request.getRecLocCode());
        dn.setSrc_loc_name(request.getSupLocCode());
        dn.setCreated_by(1);
        dn.setCreated_on(new Date());
        dn.setSrc_loc_name(LocationRepo.findLocationName(request.getSupLocCode()));
        dn.setDest_loc_name(LocationRepo.findDestLocationName(request.getRecLocCode()));
        dn.setStatus(2);
        dn.setBilling_type("STO");

        List<DeliveryNoteDetailEntity> delivery_detail = new ArrayList<>();

        logger.info("Processing delivery note details...");
        for (DeliveryNoteDetailEntity item : request.getItemInfo()) {
            DeliveryNoteDetailEntity detail = new DeliveryNoteDetailEntity();
            detail.setItemNo(item.getItemNo());
            detail.setProd_name(productsRepo.getProd_name(item.getProdCode()));
            detail.setProd_size(productsRepo.getProdCapacity(item.getProdCode()));
            detail.setPack_type(productsRepo.getProdPackType(item.getProdCode()));
            detail.setCreated_by(1);
            detail.setStatus("2");
            detail.setPlanQty(item.getPlanQty());
            detail.setProdCode(item.getProdCode());
            detail.setDeliverynote(dn);
            delivery_detail.add(detail);
            logger.debug("Added product details: {}", detail);
        }

        dn.setItemInfo(delivery_detail);
        dnrepo.save(dn);
        logger.info("Delivery note saved successfully with DN No: {}", request.getDelvOrdNo());
    }

    public boolean CheckDeliveryExits(String delvOrdNo) {
        boolean exists = dnrepo.existsByDnNo(delvOrdNo);
        logger.info("Checking if Delivery Order No {} exists: {}", delvOrdNo, exists);
        return exists;
    }

    public boolean CheckProductCode(DeliverynoteResponce request) {
        for (DeliveryNoteDetailEntity item : request.getItemInfo()) {
            if (productsRepo.checkPrudctcode(item.getProdCode())) {
                logger.warn("Invalid Product Code Found: {}", item.getProdCode());
                return true;
            }
        }
        return false;
    }
}
