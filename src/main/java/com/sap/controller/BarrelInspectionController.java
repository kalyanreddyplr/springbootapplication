package com.sap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.dto.BarrelInspectionDto;
import com.sap.service.CouponInspectionService;

@RestController
@RequestMapping("/api/kafka")
public class BarrelInspectionController {

    @Autowired
    private CouponInspectionService kafkaProducerService;

    @PostMapping("/Barrelinspection")
    public String sendMessage(@RequestBody BarrelInspectionDto mainRequestDTO) {
        // Send the MainRequestDTO data to Kafka
        kafkaProducerService.sendMessage(mainRequestDTO);
        return "Message sent successfully!";
    }
}