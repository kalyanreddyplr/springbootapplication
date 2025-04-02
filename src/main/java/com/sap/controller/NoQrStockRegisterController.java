package com.sap.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sap.dto.BpclNoQrStockDto;
import com.sap.service.NoQrStockRegisterService;


@RestController
public class NoQrStockRegisterController {
	
	 @Autowired
	NoQrStockRegisterService NoqrStockRegisterservice;
	    private static final Logger logger = LoggerFactory.getLogger(NoQrStockRegisterController.class);

	
	 @PostMapping("/StockUpdate")
	 public void AddNoQrStockRegister(@RequestBody List<BpclNoQrStockDto> Request2)
	 {
		 
		 logger.info("NoQrStockRegisterController is called----->");
		 
		 NoqrStockRegisterservice.addStock(Request2);
		 
	 }

}
