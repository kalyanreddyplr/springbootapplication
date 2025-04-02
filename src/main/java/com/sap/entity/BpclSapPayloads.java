package com.sap.entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bpcl_sap_payloads")
public class BpclSapPayloads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "api_name")
    private String apiName;

    @Column(name = "api_url")
    private String apiUrl;

    @Column(name = "api_data", columnDefinition = "TEXT")
    private String apiData;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "status")
    private String status;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Column(name = "updated_by")
    private Integer updatedBy;


    @Column(name = "error_data", columnDefinition = "TEXT")
    private  String errorData;
    
    

	public String getErrorData() {
		return errorData;
	}

	public void setErrorData(String errorData2) {
		this.errorData = errorData2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getApiData() {
		return apiData;
	}

	public void setApiData(String apiData) {
		this.apiData = apiData;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
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

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}


	
    // Getters and Setters
}