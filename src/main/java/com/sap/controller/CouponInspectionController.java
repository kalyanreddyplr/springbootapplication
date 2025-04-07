package com.sap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.dto.CouponInspectionDTO;
import com.sap.service.CouponInspectionService;


@RestController
@RequestMapping("/api/kafka")
public class CouponInspectionController {
	
	

	  @Autowired
	    private CouponInspectionService kafkaProducerService;

	    @PostMapping("/CouponData")
	    public String sendMessage(@RequestBody CouponInspectionDTO mainRequestDTO) {
	        kafkaProducerService.sendMessage(mainRequestDTO);  // Send new data to Kafka
	        return "Message sent successfully!";
	    }
	}