package com.sap.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="bpcl_delivery_note")
public class DeliveryNoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Changed from int to long for consistency

    @Column(name="dn_no", unique = true, nullable = false)
    private String dnNo;

    @Column(name="src_loc_id")
    private String src_loc_id;

    private String src_loc_name;
    private String dest_loc_id;
    private String des_loc_name;
    private Date created_on;
    private int created_by;
    private int status;

    private String billing_type;

    // OneToMany Relationship with DeliverynoteDetails
    @OneToMany(mappedBy = "deliverynote", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DeliveryNoteDetailEntity> itemInfo = new ArrayList<>();

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDn_no() {
        return dnNo;
    }

    public void setDn_no(String dn_no) {
        this.dnNo = dn_no;
    }

    public String getSrc_loc_id() {
        return src_loc_id;
    }

    public void setSrc_loc_id(String src_loc_id) {
        this.src_loc_id = src_loc_id;
    }

    public String getSrc_loc_name() {
        return src_loc_name;
    }

    public void setSrc_loc_name(String src_loc_name) {
        this.src_loc_name = src_loc_name;
    }

    public String getDest_loc_id() {
        return dest_loc_id;
    }

    public void setDest_loc_id(String dest_loc_id) {
        this.dest_loc_id = dest_loc_id;
    }

    public String getDest_loc_name() {
        return des_loc_name;
    }

    public void setDest_loc_name(String dest_loc_name) {
        this.des_loc_name = dest_loc_name;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBilling_type() {
        return billing_type;
    }

    public void setBilling_type(String billing_type) {
        this.billing_type = billing_type;
    }

    public List<DeliveryNoteDetailEntity> getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(List<DeliveryNoteDetailEntity> itemInfo) {
        this.itemInfo = itemInfo;
        
        
    }

	@Override
	public String toString() {
		return "DeliveryNoteEntity [id=" + id + ", dn_no=" + dnNo + ", src_loc_id=" + src_loc_id + ", src_loc_name="
				+ src_loc_name + ", dest_loc_id=" + dest_loc_id + ", des_loc_name=" + des_loc_name + ", created_on="
				+ created_on + ", created_by=" + created_by + ", status=" + status + ", billing_type=" + billing_type
				+ ", itemInfo=" + itemInfo + "]";
	}
}
