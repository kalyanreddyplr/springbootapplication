package com.sap.dto;

import java.util.List;

import com.sap.entity.DeliveryNoteDetailEntity;

public class DeliverynoteResponce {

	private String delvOrdNo;
    private String  supLocCode;
    private String recLocCode;
    private String delvDate;
    private List < DeliveryNoteDetailEntity > itemInfo;
	public String getDelvOrdNo() {
		return delvOrdNo;
	}
	public void setDelvOrdNo(String delvOrdNo) {
		this.delvOrdNo = delvOrdNo;
	}

	
	public String getSupLocCode() {
		return supLocCode;
	}
	public void setSupLocCode(String supLocCode) {
		this.supLocCode = supLocCode;
	}
	public String getRecLocCode() {
		return recLocCode;
	}
	public void setRecLocCode(String recLocCode) {
		this.recLocCode = recLocCode;
	}
	public String getDelvDate() {
		return delvDate;
	}
	public void setDelvDate(String delvDate) {
		this.delvDate = delvDate;
	}
	public List<DeliveryNoteDetailEntity> getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(List<DeliveryNoteDetailEntity> itemInfo) {
		this.itemInfo = itemInfo;
	}
	@Override
	public String toString() {
		
		
		return "DeliverynoteResponce [delvOrdNo=" + delvOrdNo + ", supLocCode=" + supLocCode + ", recLocCode="
				+ recLocCode + ", delvDate=" + delvDate + ", itemInfo=" + itemInfo + "]";
	}
    
    
	
}
