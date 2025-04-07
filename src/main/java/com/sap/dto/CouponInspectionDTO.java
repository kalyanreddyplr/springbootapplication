package com.sap.dto;

public class CouponInspectionDTO {

	
	
	    private String type;
	    private CouponInspectionDataDTO data;

	    // Getters and Setters
	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public CouponInspectionDataDTO getData() {
	        return data;
	    }

	    public void setData(CouponInspectionDataDTO data) {
	        this.data = data;
	    }

	    // Constructor
	    public CouponInspectionDTO(String type, CouponInspectionDataDTO data) {
	        this.type = type;
	        this.data = data;
	    }

	    // Default constructor (for deserialization)
	    public CouponInspectionDTO() {}
	}
