package com.sap.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sap.dto.BpclCaseDto;
import com.sap.entity.BpclLabelRegister;

import jakarta.transaction.Transactional;


@Repository
public interface BpclLabelRegisterRepo extends JpaRepository<BpclLabelRegister, String> {
	
	
	
    @Modifying
    @Transactional
    @Query("UPDATE BpclLabelRegister b SET b.vendLocCode = :vendLocCode, b.status = '8' WHERE b.caseBarcode = :caseBarcode")
    void updateVendLocCode(@Param("caseBarcode") String caseBarcode, @Param("vendLocCode") String vendLocCode);

    
    

    @Modifying
    @Transactional
    @Query("UPDATE BpclLabelRegister l SET l.vendLocCode = (SELECT c.vendLocCode FROM BpclCase c WHERE c.caseBarcode = l.caseBarcode), l.status = '8' WHERE l.caseBarcode IN :cases")
    void updateLabelRegister(List<String> cases);


    @Modifying
    @Transactional
    @Query("UPDATE BpclLabelRegister l SET l.forumId = :forumId, l.mobileNo = :mobilenum ,l.loyaltyLatitude=:latitude, l.loyaltyLongitude=:longitude, l.personaName=:personaName, l.loyaltyScanTime=:scanTime  WHERE l.labelCode = :labelcode")
    void updateLabelScanDetails(@Param("forumId") String forumId, 
                                @Param("labelcode") String qrBottleCode, 
                                @Param("mobilenum") String mobile,
                                @Param("latitude") String latitude,
                                @Param("longitude") String longitude,
                                @Param("personaName") String personaName,
                                 @Param("scanTime") LocalDateTime scanTime);



  
@Query("SELECT l.forumId   FROM BpclLabelRegister l WHERE l.labelCode = :labelcode")
	String getforumid(@Param("labelcode")String qrBottleCode);



@Query("SELECT l.status   FROM BpclLabelRegister l WHERE l.labelCode = :labelcode")
String StatusLabelstatus(@Param("labelcode") String qrBottleCode);
   
   



	
}
