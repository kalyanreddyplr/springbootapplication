package com.sap.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.entity.LineInformation;
import com.sap.repository.LineInformationRepo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    private LineInformationRepo locationDataRepository;

    @Autowired
    private ObjectMapper objectMapper; // JSON parser

    @KafkaListener(topics = "hwEquipments", groupId = "c")
    public void listen(ConsumerRecord<String, String> record) {
        try {
            // Convert JSON string to JSON Node
            JsonNode jsonNode = objectMapper.readTree(record.value());

            // Extract only required fields
            LineInformation locationData = new LineInformation();
            locationData.setLocName(jsonNode.get("locName").asText());
            locationData.setLocCode(jsonNode.get("locCode").asInt());
            locationData.setLineName(jsonNode.get("lineName").asText());
            locationData.setShortCode(jsonNode.get("shortCode").asText());
            locationData.setSystemType(jsonNode.get("systemType").asText());
            locationData.setMacId(jsonNode.get("macId").asText());
            locationData.setSystemIpAdd(jsonNode.get("systemIpAdd").asText());

            // Save to database
            locationDataRepository.save(locationData);

            System.out.println("Data saved successfully: " + locationData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
