package com.sap.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class CouponInspectionService {

	private static final String TOPIC = "couponInspection";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private ObjectMapper objectMapper;

public void sendMessage(Object data) {
		try {
			// Convert Java object (MainRequestDTO) to JSON string
			String jsonMessage = objectMapper.writeValueAsString(data);

			// Send message to Kafka topic
			kafkaTemplate.send(TOPIC, jsonMessage);

			System.out.println("Produced Message: " + jsonMessage);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
