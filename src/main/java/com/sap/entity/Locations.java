package com.sap.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "bpcl_location")
public class Locations {
	
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented primary key
	    private Long id;

	    @Column(name = "loc_type_id")
	    private Long locTypeId; // int8 → Long

	    @Column(name = "loc_name", length = 200)
	    private String locName;

	    @Column(name = "add1", length = 500)
	    private String add1;

	    @Column(name = "add2", length = 500)
	    private String add2;

	    @Column(name = "city", length = 100)
	    private String city;

	    @Column(name = "pin_code", length = 6)
	    private String pinCode;

	    @Column(name = "dist_id")
	    private Long distId; // int8 → Long

	    @Column(name = "state_id")
	    private Long stateId; // int8 → Long

	    @Column(name = "loc_code", length = 15, unique = true)
	    private String locCode;

	    @Column(name = "cin_no", length = 20)
	    private String cinNo;

	    @Column(name = "tan_no", length = 20)
	    private String tanNo;

	    @Column(name = "gst_no", length = 200)
	    private String gstNo;

	    @Column(name = "tin_no", length = 20)
	    private String tinNo;

	    @Column(name = "pan_no", length = 200)
	    private String panNo;

	    @Column(name = "phone_no", length = 25)
	    private String phoneNo;

	    @Column(name = "status", length = 3)
	    private String status;

	    @Column(name = "created_by")
	    private Integer createdBy; // int4 → Integer

	    @Column(name = "created_on", updatable = false)
	    private LocalDateTime createdOn; // timestamp → LocalDateTime

	    @Column(name = "latitude", length = 50)
	    private String latitude; // varchar(50) → String (not Double)

	    @Column(name = "longitude", length = 50)
	    private String longitude; // varchar(50) → String (not Double)

	    @Column(name = "short_code", length = 10)
	    private String shortCode;

	    @Column(name = "region", length = 10)
	    private String region;

	    @Column(name = "valid_upto")
	    private LocalDateTime validUpto; // timestamp → LocalDateTime

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getLocTypeId() {
			return locTypeId;
		}

		public void setLocTypeId(Long locTypeId) {
			this.locTypeId = locTypeId;
		}

		public String getLocName() {
			return locName;
		}

		public void setLocName(String locName) {
			this.locName = locName;
		}

		public String getAdd1() {
			return add1;
		}

		public void setAdd1(String add1) {
			this.add1 = add1;
		}

		public String getAdd2() {
			return add2;
		}

		public void setAdd2(String add2) {
			this.add2 = add2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPinCode() {
			return pinCode;
		}

		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}

		public Long getDistId() {
			return distId;
		}

		public void setDistId(Long distId) {
			this.distId = distId;
		}

		public Long getStateId() {
			return stateId;
		}

		public void setStateId(Long stateId) {
			this.stateId = stateId;
		}

		public String getLocCode() {
			return locCode;
		}

		public void setLocCode(String locCode) {
			this.locCode = locCode;
		}

		public String getCinNo() {
			return cinNo;
		}

		public void setCinNo(String cinNo) {
			this.cinNo = cinNo;
		}

		public String getTanNo() {
			return tanNo;
		}

		public void setTanNo(String tanNo) {
			this.tanNo = tanNo;
		}

		public String getGstNo() {
			return gstNo;
		}

		public void setGstNo(String gstNo) {
			this.gstNo = gstNo;
		}

		public String getTinNo() {
			return tinNo;
		}

		public void setTinNo(String tinNo) {
			this.tinNo = tinNo;
		}

		public String getPanNo() {
			return panNo;
		}

		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(Integer createdBy) {
			this.createdBy = createdBy;
		}

		public LocalDateTime getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(LocalDateTime createdOn) {
			this.createdOn = createdOn;
		}

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getShortCode() {
			return shortCode;
		}

		public void setShortCode(String shortCode) {
			this.shortCode = shortCode;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public LocalDateTime getValidUpto() {
			return validUpto;
		}

		public void setValidUpto(LocalDateTime validUpto) {
			this.validUpto = validUpto;
		}

	    
	    
	    
	}