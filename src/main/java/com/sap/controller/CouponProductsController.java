package com.sap.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sap.dto.ApiResponse;
import com.sap.dto.CouponResponce;
import com.sap.dto.ProductPriceListDTO;
import com.sap.service.CouponProductsService;
@RestController
public class CouponProductsController {

    private static final Logger logger = LoggerFactory.getLogger(CouponProductsController.class);

    @Autowired
    private CouponProductsService service;

    @PostMapping("/productCoupon")
    public ApiResponse<String> addCouponProducts(@RequestBody List<CouponResponce> request) {
        logger.info("Coupon API is called!");
        try {
            service.addCouponProducts(request);
            return new ApiResponse<>(200, "Coupon activated");
        } catch (Exception e) {
            logger.error("Error in processing coupons: {}", e.getMessage(), e);
            return new ApiResponse<>(500, "Internal Server Error");
        }
    }
}

