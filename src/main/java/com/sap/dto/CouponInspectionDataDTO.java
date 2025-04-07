package com.sap.dto;

import java.util.List;

public class CouponInspectionDataDTO {

	    private int locCode;
	    private List<String> couponCode;
	    private String couponSize;
	    private String lotId;
	    private String createTime;

	    // Getters and Setters
	    public int getLocCode() {
	        return locCode;
	    }

	    public void setLocCode(int locCode) {
	        this.locCode = locCode;
	    }

	    public List<String> getCouponCode() {
	        return couponCode;
	    }

	    public void setCouponCode(List<String> couponCode) {
	        this.couponCode = couponCode;
	    }

	    public String getCouponSize() {
	        return couponSize;
	    }

	    public void setCouponSize(String couponSize) {
	        this.couponSize = couponSize;
	    }

	    public String getLotId() {
	        return lotId;
	    }

	    public void setLotId(String lotId) {
	        this.lotId = lotId;
	    }

	    public String getCreateTime() {
	        return createTime;
	    }

	    public void setCreateTime(String createTime) {
	        this.createTime = createTime;
	    }

	    // Constructor
	    public CouponInspectionDataDTO(int locCode, List<String> couponCode, String couponSize, 
	                         String lotId, String createTime) {
	        this.locCode = locCode;
	        this.couponCode = couponCode;
	        this.couponSize = couponSize;
	        this.lotId = lotId;
	        this.createTime = createTime;
	    }

	    // Default constructor (for deserialization)
	    public CouponInspectionDataDTO() {}
	}
