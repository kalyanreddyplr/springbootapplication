package com.sap.dto;

public class SecondaryPackDetailDTO {
    private String couponNo;
    private String labelCode;

    // Getters and Setters
    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo;
    }

    public String getLabelCode() {
        return labelCode;
    }

    public void setLabelCode(String labelCode) {
        this.labelCode = labelCode;
    }

    // Constructor
    public SecondaryPackDetailDTO(String couponNo, String labelCode) {
        this.couponNo = couponNo;
        this.labelCode = labelCode;
    }

    // Default constructor (for deserialization)
    public SecondaryPackDetailDTO() {}
}
