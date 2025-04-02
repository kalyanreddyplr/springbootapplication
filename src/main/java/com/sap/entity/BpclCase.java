package com.sap.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bpcl_case", schema = "public")

public class BpclCase {

    @Id
    @Column(name = "case_barcode", length = 100, nullable = false)
    private String caseBarcode;

    @Column(name = "coupon_no", length = 100)
    private String couponNo;

    @Column(name = "batch_no", length = 100)
    private String batchNo;

    @Column(name = "prod_code", length = 100)
    private String prodCode;

    @Column(name = "prod_name", length = 300)
    private String prodName;

    @Column(name = "bottle_capacity", length = 100)
    private String bottleCapacity;

    @Column(name = "pack_type", length = 50)
    private String packType;

    @Column(name = "upc")
    private Long upc;

    @Column(name = "curr_loc_code", length = 8)
    private String currLocCode;

    @Column(name = "depot_loc_code", length = 8)
    private String depotLocCode;

    @Column(name = "depot_name", length = 200)
    private String depotName;

    @Column(name = "expiry_date")
    private LocalDateTime expiryDate;

    @Column(name = "lot_no", length = 200)
    private String lotNo;

    @Column(name = "mfg_date")
    private LocalDateTime mfgDate;

    @Column(name = "disposal_date")
    private LocalDateTime disposalDate;

    @Column(name = "mfg_name", length = 200)
    private String mfgName;

    @Column(name = "mfg_loc_code", length = 8)
    private String mfgLocCode;

    @Column(name = "mrp", length = 200)
    private String mrp;

    @Column(name = "vend_loc_code", length = 8)
    private String vendLocCode;

    @Column(name = "vend_loc_name", length = 200)
    private String vendLocName;

    public String getCaseBarcode() {
		return caseBarcode;
	}

	public void setCaseBarcode(String caseBarcode) {
		this.caseBarcode = caseBarcode;
	}

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
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

	public String getBottleCapacity() {
		return bottleCapacity;
	}

	public void setBottleCapacity(String bottleCapacity) {
		this.bottleCapacity = bottleCapacity;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public Long getUpc() {
		return upc;
	}

	public void setUpc(Long upc) {
		this.upc = upc;
	}

	public String getCurrLocCode() {
		return currLocCode;
	}

	public void setCurrLocCode(String currLocCode) {
		this.currLocCode = currLocCode;
	}

	public String getDepotLocCode() {
		return depotLocCode;
	}

	public void setDepotLocCode(String depotLocCode) {
		this.depotLocCode = depotLocCode;
	}

	public String getDepotName() {
		return depotName;
	}

	public void setDepotName(String depotName) {
		this.depotName = depotName;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getLotNo() {
		return lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	public LocalDateTime getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDateTime mfgDate) {
		this.mfgDate = mfgDate;
	}

	public LocalDateTime getDisposalDate() {
		return disposalDate;
	}

	public void setDisposalDate(LocalDateTime disposalDate) {
		this.disposalDate = disposalDate;
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}

	public String getMfgLocCode() {
		return mfgLocCode;
	}

	public void setMfgLocCode(String mfgLocCode) {
		this.mfgLocCode = mfgLocCode;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getVendLocCode() {
		return vendLocCode;
	}

	public void setVendLocCode(String vendLocCode) {
		this.vendLocCode = vendLocCode;
	}

	public String getVendLocName() {
		return vendLocName;
	}

	public void setVendLocName(String vendLocName) {
		this.vendLocName = vendLocName;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public LocalDateTime getCaseCreatedOn() {
		return caseCreatedOn;
	}

	public void setCaseCreatedOn(LocalDateTime caseCreatedOn) {
		this.caseCreatedOn = caseCreatedOn;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getMrpBatchNo() {
		return mrpBatchNo;
	}

	public void setMrpBatchNo(String mrpBatchNo) {
		this.mrpBatchNo = mrpBatchNo;
	}

	public String getCouponStatus() {
		return couponStatus;
	}

	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	@Column(name = "purpose", length = 100)
    private String purpose;

    @Column(name = "case_created_on")
    private LocalDateTime caseCreatedOn;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "status", length = 3)
    private String status;

    @Column(name = "plan_id")
    private Long planId;

    @Column(name = "mrp_batch_no", length = 50)
    private String mrpBatchNo;

    @Column(name = "coupon_status", length = 10)
    private String couponStatus;
}
