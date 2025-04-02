package com.sap.service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.controller.NoQrStockRegisterController;
import com.sap.dto.BpclNoQrStockDto;
import com.sap.entity.NoQrStockRegister;
import com.sap.repository.LocationsRepo;
import com.sap.repository.NoQrStockRegisterRepo;
import com.sap.repository.ProductsRepo;

import java.time.LocalDateTime;
@Service
public class NoQrStockRegisterService {

	
	@Autowired
	NoQrStockRegisterRepo noqrstockregisterrepo;
	   @Autowired
	    LocationsRepo LocationRepo;

	    @Autowired
	    ProductsRepo productsRepo;
    private static final Logger logger = LoggerFactory.getLogger(NoQrStockRegisterService.class);

	public void addStock(List<BpclNoQrStockDto> Request2) {

		
		for(BpclNoQrStockDto  request :Request2)
		{
			
		
		NoQrStockRegister noqrstockregister= new NoQrStockRegister();
		
		
		logger.info("NoQrStockRegisterService is called ------>");
		
	
		/*
		 * boolean
		 * b=noqrstockregisterrepo.exists(noqrstockregisterrepo.getopeningStock(request.
		 * getProdCode(),request.getRecvsLoc(),request.getLocCode(),request.getMrpBatch(
		 * )));
		 * 
		 * if(b) {
		 * 
		 * noqrstockregister.setStockIn(request.getGrQty()); int
		 * opstock=noqrstockregisterrepo.getopeningStock(request.getProdCode(),request.
		 * getRecvsLoc(),request.getLocCode(),request.getMrpBatch());
		 * noqrstockregister.setClosingStock(opstock+request.getGrQty());
		 * 
		 * logger.info("updated stock ");
		 * 
		 * 
		 * }
		 * 
		 * else
		 */
			
		noqrstockregister.setLocCode(request.getLocCode());
		
		noqrstockregister.setProdCode(request.getProdCode());
		noqrstockregister.setMrpBatch(request.getMrpBatch());
		
		noqrstockregister.setRecordedOn(LocalDateTime.now());
		noqrstockregister.setCreatedOn(LocalDateTime.now());

		noqrstockregister.setProdName(productsRepo.getProd_name(request.getProdCode()));
		noqrstockregister.setProdSize(productsRepo.getProdCapacity(request.getProdCode()));

		noqrstockregister.setPackType(productsRepo.getProdPackType(request.getProdCode()));
		
		int upc=Integer.parseInt(productsRepo.getUpc(request.getProdCode()));
		
		noqrstockregister.setUpc(upc);

		
		noqrstockregister.setSloc(request.getRecvsLoc());
		noqrstockregister.setStockIn(request.getGrQty());
		
		//noqrstockregisterrepo.getCloseingStock();
	//	int opstock=noqrstockregisterrepo.getopeningStock(request.getProdCode(),request.getRecvsLoc(),request.getLocCode(),request.getMrpBatch());
		noqrstockregister.setClosingStock(request.getGrQty());

		noqrstockregisterrepo.save(noqrstockregister);
		
		logger.info("data saved  ----->");

	}
	}

}
