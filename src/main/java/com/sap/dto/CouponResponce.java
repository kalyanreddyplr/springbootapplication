package com.sap.dto;

public class CouponResponce {
	
		
		
		private String prodCode;
		private String locCode;
		
		private String altBom;
		
		private String bomText;
		
		private String couponStatus;
		
		private String couponCode;
		
		private String date;
		
		private String time;

		public String getProdCode() {
			return prodCode;
		}

		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}

		public String getLocCode() {
			return locCode;
		}

		public void setLocCode(String locCode) {
			this.locCode = locCode;
		}

		public String getAltBom() {
			return altBom;
		}

		public void setAltBom(String altBom) {
			this.altBom = altBom;
		}

		public String getBomText() {
			return bomText;
		}

		public void setBomText(String bomText) {
			this.bomText = bomText;
		}

		public String getCouponStatus() {
			return couponStatus;
		}

		public void setCouponStatus(String couponStatus) {
			this.couponStatus = couponStatus;
		}

		public String getCouponCode() {
			return couponCode;
		}

		public void setCouponCode(String couponCode) {
			this.couponCode = couponCode;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "CouponResponce [prodCode=" + prodCode + ", locCode=" + locCode + ", altBom=" + altBom + ", bomText="
					+ bomText + ", couponStatus=" + couponStatus + ", couponCode=" + couponCode + ", date=" + date
					+ ", time=" + time + "]";
		}
		
		
		
}
