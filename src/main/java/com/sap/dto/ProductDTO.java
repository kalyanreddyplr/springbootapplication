package com.sap.dto;

public class ProductDTO {

    private String prodCode;
    private String prodName;
    private String upc;
    private String purpose;


    public ProductDTO(String prodCode, String prodName, String upc, String purpose) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.upc = upc;
		this.purpose = purpose;
	}

	// Getters and Setters

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

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
