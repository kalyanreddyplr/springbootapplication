package com.sap.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.dto.LabelScanResponce;
import com.sap.service.LabelScanService;

@RestController
public class LabelScanController {
	
	
	@Autowired
	LabelScanService labelscanservice;
	
	
	
	@RequestMapping("/label/scan")
	public ResponseEntity<Map<String, Object>> addLabelScanData(@RequestBody List<LabelScanResponce> request) {
        System.out.println("Controller called: " + request);

        List<Map<String, Object>> responsePayload = labelscanservice.AddLabelscan(request);

        Map<String, Object> response = new HashMap<>();
        response.put("status", 200);
        response.put("message", "Data processed successfully");
        response.put("timeStamp", LocalDateTime.now());
        response.put("payload", responsePayload);

        return ResponseEntity.ok(response);
    }}