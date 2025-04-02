package com.sap.controller;

import com.sap.entity.ProductionData;
import com.sap.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody ProductionData productionData) {
        kafkaProducerService.sendMessage(productionData);
        return "Message sent successfully!";
    }
}
