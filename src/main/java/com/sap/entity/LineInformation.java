package com.sap.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "bpcl_lineinformation")
public class LineInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "loc_name")
    private String locName;

    @Column(name = "loc_code")
    private int locCode;

    @Column(name = "line_name")
    private String lineName;

    @Column(name = "short_code")
    private String shortCode;

    @Column(name = "system_type")
    private String systemType;

    @Column(name = "mac_id")
    private String macId;

    @Column(name = "system_ip_add")
    private String systemIpAdd;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLocName() { return locName; }
    public void setLocName(String locName) { this.locName = locName; }

    public int getLocCode() { return locCode; }
    public void setLocCode(int locCode) { this.locCode = locCode; }

    public String getLineName() { return lineName; }
    public void setLineName(String lineName) { this.lineName = lineName; }

    public String getShortCode() { return shortCode; }
    public void setShortCode(String shortCode) { this.shortCode = shortCode; }

    public String getSystemType() { return systemType; }
    public void setSystemType(String systemType) { this.systemType = systemType; }

    public String getMacId() { return macId; }
    public void setMacId(String macId) { this.macId = macId; }

    public String getSystemIpAdd() { return systemIpAdd; }
    public void setSystemIpAdd(String systemIpAdd) { this.systemIpAdd = systemIpAdd; }
}
