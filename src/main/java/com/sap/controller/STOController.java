package com.sap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sap.dto.DeliverynoteResponce;
import com.sap.service.DeliverynoteService;

@Controller
public class STOController {

    private static final Logger logger = LoggerFactory.getLogger(STOController.class);

    @Autowired
    DeliverynoteService deliveryservice;

    @PostMapping("/detailsSTO")
    public ResponseEntity<String> DeliveryNote(@RequestBody DeliverynoteResponce request) {
        logger.info("DeliveryNote API called with request: {}", request);

        if (request.getDelvOrdNo().length() != 10) {
            logger.warn("Invalid Delivery Order Number: {}", request.getDelvOrdNo());
            return new ResponseEntity<>("Delivery length should be 10", HttpStatus.FAILED_DEPENDENCY);
        }

        if (deliveryservice.CheckDeliveryExits(request.getDelvOrdNo())) {
            logger.warn("Delivery already exists: {}", request.getDelvOrdNo());
            return new ResponseEntity<>("Delivery already available", HttpStatus.ACCEPTED);
        }

        if (deliveryservice.CheckProductCode(request)) {
            logger.warn("Product code not available for delivery order: {}", request.getDelvOrdNo());
            return new ResponseEntity<>("Product code not available", HttpStatus.BAD_REQUEST);
        }

        deliveryservice.createDeliveryNote(request);
        logger.info("Delivery Created Successfully for Order Number: {}", request.getDelvOrdNo());

        return new ResponseEntity<>("Delivery Created", HttpStatus.CREATED);
    }
}
