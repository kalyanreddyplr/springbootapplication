package com.sap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sap.dto.BpclCaseDto;
import com.sap.entity.BpclCase;

import jakarta.transaction.Transactional;

@Repository
public interface BpclCaseRepo extends JpaRepository<BpclCase, String> {

	@Query("Select c.vendLocCode from BpclCase c where c.caseBarcode=:case_barcode")
	String getvenloccode(@Param("case_barcode") String caseBarcode);

	@Modifying
	@Transactional
	@Query("UPDATE BpclCase c SET c.lotNo='K' WHERE c.caseBarcode=:caseBarcode")
	void updateLotStatus(@Param("caseBarcode") String caseBarcode);

	 @Query(value = "SELECT case_barcode FROM bpcl_case WHERE vend_loc_code IS NOT NULL AND status = '8' AND pack_type = 'Small Pack' and lot_no is null  LIMIT 10", nativeQuery = true)
	    List<String> findEligibleCases();

	    @Modifying
	    @Transactional
	    @Query("UPDATE BpclCase c SET c.lotNo = 'K' WHERE c.caseBarcode IN :cases")
	    void updateLotNumber(List<String> cases);

	    
		/*
		 * @Query("Select vend_loc_code  from bpcl_case   where case_barcode =:case_barcode in (select case_barcode from bpcl_label_register where label_code =:qrBottleCode"
		 * , nativeQuery = true) String
		 * getvenloccodeByLabel(@Param("qrBottleCode")String qrBottleCode);
		 */
	    @Query(value = "SELECT vend_loc_code FROM bpcl_case WHERE case_barcode IN (SELECT case_barcode FROM bpcl_label_register WHERE label_code = :qrBottleCode)", nativeQuery = true)
	    String getVenLocCodeByLabel(@Param("qrBottleCode") String qrBottleCode);

	
	
}
