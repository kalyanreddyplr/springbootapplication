package com.sap.controller;

import com.sap.dto.SecondaryPackingDTO;
import com.sap.service.KafkaProducerService;
import com.sap.service.SecondarypackingrService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class SecondarypackingController {

    @Autowired
    private SecondarypackingrService kafkaProducerService;

    @PostMapping("/secondary")
    public String sendMessage(@RequestBody SecondaryPackingDTO mainRequestDTO) {
        kafkaProducerService.sendMessage(mainRequestDTO);  // Send message to Kafka topic
        return "Message sent successfully!";
    }
}
