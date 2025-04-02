package com.sap.dto;


	
	public class BpclNoQrStockDto {
	    private String locCode;
	    private String prodCode;
	    private int grQty;
	    private int grRev;
	    private String recvsLoc;
	    private String mrpBatch;
		public String getLocCode() {
			return locCode;
		}
		public void setLocCode(String locCode) {
			this.locCode = locCode;
		}
		public String getProdCode() {
			return prodCode;
		}
		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}
		public int getGrQty() {
			return grQty;
		}
		public void setGrQty(int grQty) {
			this.grQty = grQty;
		}
		public int getGrRev() {
			return grRev;
		}
		public void setGrRev(int grRev) {
			this.grRev = grRev;
		}
		public String getRecvsLoc() {
			return recvsLoc;
		}
		public void setRecvsLoc(String recvsLoc) {
			this.recvsLoc = recvsLoc;
		}
		public String getMrpBatch() {
			return mrpBatch;
		}
		public void setMrpBatch(String mrpBatch) {
			this.mrpBatch = mrpBatch;
		}
		@Override
		public String toString() {
			return "BpclNoQrStockDto [locCode=" + locCode + ", prodCode=" + prodCode + ", grQty=" + grQty + ", grRev="
					+ grRev + ", recvsLoc=" + recvsLoc + ", mrpBatch=" + mrpBatch + "]";
		}
	    
	    
	}



