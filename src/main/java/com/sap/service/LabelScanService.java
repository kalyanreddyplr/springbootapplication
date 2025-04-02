package com.sap.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sap.dto.LabelScanResponce;
import com.sap.repository.BpclCaseRepo;
import com.sap.repository.BpclLabelRegisterRepo;

@Service
public class LabelScanService {

    @Autowired
    BpclLabelRegisterRepo labelregisterrepo;

    @Autowired
    BpclCaseRepo caserepo;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public List<Map<String, Object>> AddLabelscan(List<LabelScanResponce> request) {
        System.out.println("Service called");

        List<Map<String, Object>> responseList = new ArrayList<>();

        for (LabelScanResponce details : request) {
            Map<String, Object> response = new HashMap<>();
            response.put("qrBottleCode", details.getQrBottleCode());

            // Null check for RedemptionStatus
            if (details.getRedemptionStatus() != null && details.getRedemptionStatus().equals("YES")) {
                boolean labelExists = labelregisterrepo.existsById(details.getQrBottleCode());
                System.out.println("labelExists: " + labelExists);

                if (labelExists) {
                    String expectedDistributorCode = caserepo.getVenLocCodeByLabel(details.getQrBottleCode());
                    System.out.println("distributorCode from case: " + expectedDistributorCode);
                    System.out.println("distributorCode from payload: " + details.getDistributorCode());

                    if (labelregisterrepo.getforumid(details.getQrBottleCode()) != null) {
                        response.put("message", "Already Redeemed");
                        response.put("status", 201);
                    } else if (expectedDistributorCode != null 
                            && expectedDistributorCode.equals(details.getDistributorCode()) 
                            && !"11".equals(labelregisterrepo.StatusLabelstatus(details.getQrBottleCode())) 
                            && !"10".equals(labelregisterrepo.StatusLabelstatus(details.getQrBottleCode()))) 
                   
                    		{
                        LocalDateTime scanTime = null;
                        if (details.getScanTime() != null && !details.getScanTime().isEmpty()) {
                            scanTime = LocalDateTime.parse(details.getScanTime(), FORMATTER);
                        }

                        labelregisterrepo.updateLabelScanDetails(details.getForumId(), details.getQrBottleCode(),
                                details.getMobile(), details.getLatitude(), details.getLongitude(),
                                details.getPersonaName(), scanTime);
                        System.out.println("Data saved");

                        response.put("message", "Success");
                        response.put("status", 200);
                    } else {
                        response.put("message", "Failed: Invalid distributorCode");
                        response.put("status", 412);
                    }
                } else {
                    response.put("message", "Failed: Invalid label data");
                    response.put("status", 412);
                }
            } else {
                response.put("message", "getRedemptionStatus is not YES");
                response.put("status", 412);
                System.out.println("First Push");
            }

            responseList.add(response);
        }

        return responseList; 
    }
}
