package com.sap.dto;

import java.util.List;

public class SecondaryPackingDTO {
    private int planId;
    private String locCode;
    private String lineNo;
    private String caseBarcode;
    private String batchNo;
    private String prodCode;
    private String prodName;
    private String prodSize;
    private String packType;
    private String mrpBatchNo;
    private String applyCoupon;
    private String couponSize;
    private String mrp;
    private String purpose;
    private String mfgDate;
    private int upc;
    private String locName;
    private List<SecondaryPackDetailDTO> packDetails;

    // Getters and Setters
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public String getCaseBarcode() {
        return caseBarcode;
    }

    public void setCaseBarcode(String caseBarcode) {
        this.caseBarcode = caseBarcode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdSize() {
        return prodSize;
    }

    public void setProdSize(String prodSize) {
        this.prodSize = prodSize;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public String getMrpBatchNo() {
        return mrpBatchNo;
    }

    public void setMrpBatchNo(String mrpBatchNo) {
        this.mrpBatchNo = mrpBatchNo;
    }

    public String getApplyCoupon() {
        return applyCoupon;
    }

    public void setApplyCoupon(String applyCoupon) {
        this.applyCoupon = applyCoupon;
    }

    public String getCouponSize() {
        return couponSize;
    }

    public void setCouponSize(String couponSize) {
        this.couponSize = couponSize;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(String mfgDate) {
        this.mfgDate = mfgDate;
    }

    public int getUpc() {
        return upc;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public List<SecondaryPackDetailDTO> getPackDetails() {
        return packDetails;
    }

    public void setPackDetails(List<SecondaryPackDetailDTO> packDetails) {
        this.packDetails = packDetails;
    }

    // Constructor
    public SecondaryPackingDTO(int planId, String locCode, String lineNo, String caseBarcode, String batchNo, 
                          String prodCode, String prodName, String prodSize, String packType, String mrpBatchNo, 
                          String applyCoupon, String couponSize, String mrp, String purpose, String mfgDate, 
                          int upc, String locName, List<SecondaryPackDetailDTO> packDetails) {
        this.planId = planId;
        this.locCode = locCode;
        this.lineNo = lineNo;
        this.caseBarcode = caseBarcode;
        this.batchNo = batchNo;
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.prodSize = prodSize;
        this.packType = packType;
        this.mrpBatchNo = mrpBatchNo;
        this.applyCoupon = applyCoupon;
        this.couponSize = couponSize;
        this.mrp = mrp;
        this.purpose = purpose;
        this.mfgDate = mfgDate;
        this.upc = upc;
        this.locName = locName;
        this.packDetails = packDetails;
    }

    // Default constructor (for deserialization)
    public SecondaryPackingDTO() {}
}
