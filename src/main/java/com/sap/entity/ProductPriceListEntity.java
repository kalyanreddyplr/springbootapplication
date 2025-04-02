package com.sap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bpcl_products_price_list")
public class ProductPriceListEntity {
	
	@Id
    private Integer id;

    @Column(name = "prod_code")
    private String prodCode;

    @Column(name = "mrp")
    private int mrp;

    @Column(name = "mrp_batch")
    private String mrpBatch;

    @Column(name = "status")
    private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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