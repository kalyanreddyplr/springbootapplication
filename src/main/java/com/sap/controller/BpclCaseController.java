package com.sap.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.service.BpclCaseService;

@RestController

public class BpclCaseController {

    private static final Logger logger = LoggerFactory.getLogger(BpclCaseController.class);
	  @Autowired private BpclCaseService bpclCaseService;

	/*
	 * @Autowired private BpclCaseService bpclCaseService;
	 * 
	 * @PostMapping("/addcase") public ResponseEntity<String> addCases(@RequestBody
	 * BpclCaseDto caseDetails) { //
	 * logger.info("Received request to add cases: {}", case);
	 * bpclCaseService.processCases(caseDetails); return
	 * ResponseEntity.ok("Cases processed successfully."); }post
	 */
	  
    
    @PostMapping("/updatecases")
   // @Scheduled(fixedRate = 2000)      
    public ResponseEntity<String> updateEligibleCases() {
        String result = bpclCaseService.processEligibleCases();
        return ResponseEntity.ok(result);}
}
