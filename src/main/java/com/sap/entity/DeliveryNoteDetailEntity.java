package com.sap.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bpcl_delivery_note_detail")
public class DeliveryNoteDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Changed from int to long for consistency

    
    @Column(name="prod_name")
    private String prod_name;
    
    @Column(name="prod_code")
    private String prodCode;
    
    @Column(name="item_no")
    private String itemNo;
    
    @Column(name="prod_size")
    
    private String prod_size;
    @Column(name="pack_type")
 private String pack_type;
    
    @Column(name="dn_qty")
    private int planQty;
    private Date created_on;
    private int created_by;
    private String status;

    @ManyToOne
    @JoinColumn(name = "dn_id", nullable = false) // Creates the foreign key reference in the child table
    private DeliveryNoteEntity deliverynote;

    
    
    
    
    
    
    
    public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public int getPlanQty() {
		return planQty;
	}

	public void setPlanQty(int planQty) {
		this.planQty = planQty;
	}

	// Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    

    public String getProd_size() {
        return prod_size;
    }

    public void setProd_size(String prod_size) {
        this.prod_size = prod_size;
    }

    public String getPack_type() {
        return pack_type;
    }

    public void setPack_type(String pack_type) {
        this.pack_type = pack_type;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeliveryNoteEntity getDeliverynote() {
        return deliverynote;
    }

    public void setDeliverynote(DeliveryNoteEntity deliverynote) {
        this.deliverynote = deliverynote;
        
        
        
        
        
        
        
    }

	@Override
	public String toString() {
		return "DeliveryNoteDetailEntity [id=" + id + ", prod_name=" + prod_name + ", prodCode=" + prodCode
				+ ", itemNo=" + itemNo + ", prod_size=" + prod_size + ", pack_type=" + pack_type + ", planQty="
				+ planQty + ", created_on=" + created_on + ", created_by=" + created_by + ", status=" + status
				+ ", deliverynote=" + deliverynote + "]";
	}


	
}
