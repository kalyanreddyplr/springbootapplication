package com.sap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.dto.BpclCaseDto;
import com.sap.repository.BpclCaseRepo;
import com.sap.repository.BpclLabelRegisterRepo;

import jakarta.transaction.Transactional;

@Service
public class BpclCaseService {

	@Autowired
	BpclLabelRegisterRepo labelRegisterRepo;
	@Autowired
	BpclCaseRepo caseRepo;

 /*   @Transactional
	public void processCases(BpclCaseDto caseDetails) {

		String vendloc_code = CaseRepo.getvenloccode(caseDetails.getCaseBarcode());

		System.out.println("Case_barcode   -->" + caseDetails);
		System.out.println("vendloc_code----" + vendloc_code);

		labelregisterrepo.updateVendLocCode(caseDetails.getCaseBarcode(), vendloc_code);
		CaseRepo.updateLotStatus(caseDetails.getCaseBarcode());
		
		System.out.println("data saved");}*/
	
	 @Transactional
	    public String processEligibleCases() {
	        List<String> eligibleCases = caseRepo.findEligibleCases();

	        if (eligibleCases.isEmpty()) {
	            return "No eligible cases found for processing.";
	        }

	        // Logging the case QRs before update
	        System.out.println("Processing cases: " + eligibleCases);

	        labelRegisterRepo.updateLabelRegister(eligibleCases);
	        caseRepo.updateLotNumber(eligibleCases);

	        return "Updated " + eligibleCases.size() + " cases successfully. Case QRs: " + eligibleCases;
	    }
	}
	


