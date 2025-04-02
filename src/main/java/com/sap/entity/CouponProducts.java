package com.sap.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="bpcl_coupon_products")
public class CouponProducts {
	
		
		 @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String prod_code;
		
		private String loc_code;
		private Date created_on;
		
		private int created_by;
		
		private String coupon_batch_code;
		private String alt_bom;
		
		private String bom_text;
		private String sap_date;
		private String sap_time;
		
		
		private String status;
		
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProd_code() {
			return prod_code;
		}
		public void setProd_code(String prod_code) {
			this.prod_code = prod_code;
		}
		public String getLoc_code() {
			return loc_code;
		}
		public void setLoc_code(String loc_code) {
			this.loc_code = loc_code;
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
		public String getCoupon_batch_code() {
			return coupon_batch_code;
		}
		public void setCoupon_batch_code(String coupon_batch_code) {
			this.coupon_batch_code = coupon_batch_code;
		}
		public String getAlt_bom() {
			return alt_bom;
		}
		public void setAlt_bom(String alt_bom) {
			this.alt_bom = alt_bom;
		}
		public String getBom_text() {
			return bom_text;
		}
		public void setBom_text(String bom_text) {
			this.bom_text = bom_text;
		}
		public String getSap_date() {
			return sap_date;
		}
		public void setSap_date(String sap_date) {
			this.sap_date = sap_date;
		}
		public String getSap_time() {
			return sap_time;
		}
		public void setSap_time(String sap_time) {
			this.sap_time = sap_time;
		}
		@Override
		public String toString() {
			return "CouponProducts [id=" + id + ", prod_code=" + prod_code + ", loc_code=" + loc_code + ", created_on="
					+ created_on + ", created_by=" + created_by + ", coupon_batch_code=" + coupon_batch_code + ", alt_bom="
					+ alt_bom + ", bom_text=" + bom_text + ", sap_date=" + sap_date + ", sap_time=" + sap_time + "]";
		}
		
		
		

	


}
