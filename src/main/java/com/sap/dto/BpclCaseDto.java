package com.sap.dto;

public class BpclCaseDto {
    private String caseBarcode;

    public String getCaseBarcode() {
        return caseBarcode;
    }

    public void setCaseBarcode(String caseBarcode) {
        this.caseBarcode = caseBarcode;
    }

    @Override
    public String toString() {
        return "BpclCaseDto{" +
                "caseBarcode='" + caseBarcode + '\'' +
                '}';
    }
}
