package com.sap.dto;

import java.time.LocalDateTime;

public class LabelScanResponce {
    private String qrBottleCode;
    private String redemptionStatus;
    private String personaName;
    private String mobile;
    private String latitude;
    private String longitude;
    private String  scanTime;
    private String distributorCode;
    private String forumId;

    // Getters and Setters
    public String getQrBottleCode() {
        return qrBottleCode;
    }

    public void setQrBottleCode(String qrBottleCode) {
        this.qrBottleCode = qrBottleCode;
    }

    public String getRedemptionStatus() {
        return redemptionStatus;
    }

    public void setRedemptionStatus(String redemptionStatus) {
        this.redemptionStatus = redemptionStatus;
    }

    public String getPersonaName() {
        return personaName;
    }

    public void setPersonaName(String personaName) {
        this.personaName = personaName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getScanTime() {
        return scanTime;
    }

    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    public String getDistributorCode() {
        return distributorCode;
    }

    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    public String getForumId() {
        return forumId;
    }

    public void setForumId(String forumId) {
        this.forumId = forumId;
    }
}