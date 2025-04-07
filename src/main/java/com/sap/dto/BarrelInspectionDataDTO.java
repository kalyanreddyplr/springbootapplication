package com.sap.dto;

import java.util.List;

public class BarrelInspectionDataDTO {

	 private int locCode;
	    private String prodCode;
	    private String prodName;
	    private String prodSize;
	    private String packType;
	    private List<String> qrCode;

	    // Getters and Setters
	    public int getLocCode() {
	        return locCode;
	    }

	    public void setLocCode(int locCode) {
	        this.locCode = locCode;
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

	    public List<String> getQrCode() {
	        return qrCode;
	    }

	    public void setQrCode(List<String> qrCode) {
	        this.qrCode = qrCode;
	    }

	    // Constructor
	    public BarrelInspectionDataDTO(int locCode, String prodCode, String prodName, String prodSize, String packType, List<String> qrCode) {
	        this.locCode = locCode;
	        this.prodCode = prodCode;
	        this.prodName = prodName;
	        this.prodSize = prodSize;
	        this.packType = packType;
	        this.qrCode = qrCode;
	    }

	    // Default constructor (for deserialization)
	    public BarrelInspectionDataDTO() {}
	}
