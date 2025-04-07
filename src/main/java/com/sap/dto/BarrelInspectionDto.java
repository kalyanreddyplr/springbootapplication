package com.sap.dto;

public class BarrelInspectionDto {
	
	private String type;
    private BarrelInspectionDataDTO data;

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BarrelInspectionDataDTO getData() {
        return data;
    }

    public void setData(BarrelInspectionDataDTO data) {
        this.data = data;
    }

    // Constructor
    public BarrelInspectionDto(String type, BarrelInspectionDataDTO data) {
        this.type = type;
        this.data = data;
    }

    // Default constructor (for deserialization)
    public BarrelInspectionDto() {}
} 


