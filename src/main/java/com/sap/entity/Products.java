package com.sap.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bpcl_products")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {

	@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "pack_type")
	private String packType;

	@Column(name = "prod_code", unique = true)
	private String prodCode;

	@Column(name = "prod_name")
	private String prodName;

	@Column(name = "bottle_capacity")
	private String bottleCapacity;

	@Column(name = "status")
	private String status;

	@Column(name = "upc")
	private String upc;

	@Column(name = "mrp_batch")
	private String mrpBatch;

	@Column(name = "prod_weight")
	private Double prodWeight;

	@Column(name = "prod_volume")
	private Double prodVolume;

	@Column(name = "volume_unit")
	private String volumeUnit;

	@Column(name = "weight_unit")
	private String weightUnit;

	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "brand_label_status")
	private String brandLabelStatus;

	@Column(name = "created_by")
	private int createdby;

	@Column(name = "purpose")
	private String purpose;

	@Column(name = "descr")
	private String descr;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
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

	public String getBottleCapacity() {
		return bottleCapacity;
	}

	public void setBottleCapacity(String bottleCapacity) {
		this.bottleCapacity = bottleCapacity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getMrpBatch() {
		return mrpBatch;
	}

	public void setMrpBatch(String mrpBatch) {
		this.mrpBatch = mrpBatch;
	}

	public Double getProdWeight() {
		return prodWeight;
	}

	public void setProdWeight(Double prodWeight) {
		this.prodWeight = prodWeight;
	}

	public Double getProdVolume() {
		return prodVolume;
	}

	public void setProdVolume(Double prodVolume) {
		this.prodVolume = prodVolume;
	}

	public String getVolumeUnit() {
		return volumeUnit;
	}

	public void setVolumeUnit(String volumeUnit) {
		this.volumeUnit = volumeUnit;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getBrandLabelStatus() {
		return brandLabelStatus;
	}

	public void setBrandLabelStatus(String brandLabelStatus) {
		this.brandLabelStatus = brandLabelStatus;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", packType=" + packType + ", prodCode=" + prodCode + ", prodName=" + prodName
				+ ", bottleCapacity=" + bottleCapacity + ", status=" + status + ", upc=" + upc + ", mrpBatch="
				+ mrpBatch + ", prodWeight=" + prodWeight + ", prodVolume=" + prodVolume + ", volumeUnit=" + volumeUnit
				+ ", weightUnit=" + weightUnit + ", createdOn=" + createdOn + ", brandLabelStatus=" + brandLabelStatus
				+ "]";
	}

}