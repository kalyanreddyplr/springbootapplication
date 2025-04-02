package com.sap.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.entity.NoQrStockRegister;


@Repository
public interface NoQrStockRegisterRepo extends JpaRepository<NoQrStockRegister, Integer> {

	/*
	 * int getopeningStock();
	 * 
	 * 
	 * 
	 * int getopeningStock(String prodCode, String recvsLoc, String locCode, String
	 * mrpBatch);
	 * 
	 * 
	 * 
	 * Optional<NoQrStockRegister>
	 * findByProdCodeAndLocCodeAndMrpBatchAndRecordedOn(String prodCode, String
	 * locCode, String mrpBatch, LocalDateTime today);
	 */
}
