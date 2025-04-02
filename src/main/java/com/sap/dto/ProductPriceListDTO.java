package com.sap.dto;

public class ProductPriceListDTO {

	private String prodCode;
	private String prodName;
	private String packType;
	private String upc;
	private String purpose;
	private int mrp;
	private String mrpBatch;
	private String prodSize;
	

	public ProductPriceListDTO(String prodCode, String prodName, String packType, String upc, String purpose,  String prodSize,int mrp,
			String mrpBatch) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.packType = packType;
		this.upc = upc;
		this.purpose = purpose;
		this.mrp = mrp;
		this.mrpBatch = mrpBatch;
		this.prodSize = prodSize;
	}

	

	public String getProdCode() {
		return prodCode;
	}

	public String getProdSize() {
		return prodSize;
	}



	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
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

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
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

	public int getMrp() {
		return mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	public String getMrpBatch() {
		return mrpBatch;
	}

	public void setMrpBatch(String mrpBatch) {
		this.mrpBatch = mrpBatch;
	}
}
