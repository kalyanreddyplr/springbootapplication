package com.sap.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bpcl_no_qr_stock_register", schema = "public")
@JsonIgnoreProperties(ignoreUnknown = true)

public class NoQrStockRegister {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "loc_code")
    private String locCode;

    @Column(name = "prod_code")
    private String prodCode;

    @Column(name = "prod_name")
    private String prodName;

    @Column(name = "prod_size")
    private String prodSize;

    @Column(name = "pack_type")
    private String packType;

    @Column(name = "upc")
    private int upc;

    @Column(name = "opening_stock")
    private int openingStock;

    @Column(name = "opening_stock_prt")
    private int openingStockPrt;

    @Column(name = "stock_in")
    private int stockIn;

    @Column(name = "stock_in_prt")
    private int stockInPrt;

    @Column(name = "stock_out")
    private int stockOut;

    @Column(name = "stock_out_prt")
    private int stockOutPrt;

    @Column(name = "damage_qty")
    private int damageQty;

    @Column(name = "shortage_qty")
    private int shortageQty;

    @Column(name = "closing_stock")
    private int closingStock;

    @Column(name = "closing_stock_prt")
    private int closingStockPrt;

    @Column(name = "recorded_on")
    private LocalDateTime recordedOn;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "damage_qty_prt")
    private int damageQtyPrt;

    @Column(name = "shortage_qty_prt")
    private int shortageQtyPrt;

    @Column(name = "avb_qty_ltrs")
    private String avbQtyLtrs;

    @Column(name = "lkg_qty_ltrs")
    private String lkgQtyLtrs;

    @Column(name = "sap_qty")
    private String sapQty;

    @Column(name = "repack_qty")
    private String repackQty;

    @Column(name = "prod_qty")
    private String prodQty;

    @Column(name = "sloc")
    private String sloc;

    @Column(name = "mrp_batch")
    private String mrpBatch;

    @Column(name = "qm_stock")
    private String qmStock;

    @Column(name = "block_stock")
    private String blockStock;

    @Column(name = "rev_qty")
    private String revQty;

    @Column(name = "rev_qty_prt")
    private String revQtyPrt;

    @Column(name = "closing_stock_ltr")
    private String closingStockLtr;

    @Column(name = "opening_stock_ltr")
    private String openingStockLtr;

    @Column(name = "prod_rev_qty_cases")
    private int prodRevQtyCases;

    @Column(name = "prod_rev_qty_prts")
    private int prodRevQtyPrts;

    @Column(name = "stock_out_ltr")
    private String stockOutLtr;

    @Column(name = "rev_qty_ltr")
    private String revQtyLtr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdSize() {
		return prodSize;
	}
	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	public int getUpc() {
		return upc;
	}
	public void setUpc(int upc) {
		this.upc = upc;
	}
	public int getOpeningStock() {
		return openingStock;
	}
	public void setOpeningStock(int openingStock) {
		this.openingStock = openingStock;
	}
	public int getOpeningStockPrt() {
		return openingStockPrt;
	}
	public void setOpeningStockPrt(int openingStockPrt) {
		this.openingStockPrt = openingStockPrt;
	}
	public int getStockIn() {
		return stockIn;
	}
	public void setStockIn(int stockIn) {
		this.stockIn = stockIn;
	}
	public int getStockInPrt() {
		return stockInPrt;
	}
	public void setStockInPrt(int stockInPrt) {
		this.stockInPrt = stockInPrt;
	}
	public int getStockOut() {
		return stockOut;
	}
	public void setStockOut(int stockOut) {
		this.stockOut = stockOut;
	}
	public int getStockOutPrt() {
		return stockOutPrt;
	}
	public void setStockOutPrt(int stockOutPrt) {
		this.stockOutPrt = stockOutPrt;
	}
	public int getDamageQty() {
		return damageQty;
	}
	public void setDamageQty(int damageQty) {
		this.damageQty = damageQty;
	}
	public int getShortageQty() {
		return shortageQty;
	}
	public void setShortageQty(int shortageQty) {
		this.shortageQty = shortageQty;
	}
	public int getClosingStock() {
		return closingStock;
	}
	public void setClosingStock(int closingStock) {
		this.closingStock = closingStock;
	}
	public int getClosingStockPrt() {
		return closingStockPrt;
	}
	public void setClosingStockPrt(int closingStockPrt) {
		this.closingStockPrt = closingStockPrt;
	}
	public LocalDateTime getRecordedOn() {
		return recordedOn;
	}
	public void setRecordedOn(LocalDateTime recordedOn) {
		this.recordedOn = recordedOn;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public int getDamageQtyPrt() {
		return damageQtyPrt;
	}
	public void setDamageQtyPrt(int damageQtyPrt) {
		this.damageQtyPrt = damageQtyPrt;
	}
	public int getShortageQtyPrt() {
		return shortageQtyPrt;
	}
	public void setShortageQtyPrt(int shortageQtyPrt) {
		this.shortageQtyPrt = shortageQtyPrt;
	}
	public String getAvbQtyLtrs() {
		return avbQtyLtrs;
	}
	public void setAvbQtyLtrs(String avbQtyLtrs) {
		this.avbQtyLtrs = avbQtyLtrs;
	}
	public String getLkgQtyLtrs() {
		return lkgQtyLtrs;
	}
	public void setLkgQtyLtrs(String lkgQtyLtrs) {
		this.lkgQtyLtrs = lkgQtyLtrs;
	}
	public String getSapQty() {
		return sapQty;
	}
	public void setSapQty(String sapQty) {
		this.sapQty = sapQty;
	}
	public String getRepackQty() {
		return repackQty;
	}
	public void setRepackQty(String repackQty) {
		this.repackQty = repackQty;
	}
	public String getProdQty() {
		return prodQty;
	}
	public void setProdQty(String prodQty) {
		this.prodQty = prodQty;
	}
	public String getSloc() {
		return sloc;
	}
	public void setSloc(String sloc) {
		this.sloc = sloc;
	}
	public String getMrpBatch() {
		return mrpBatch;
	}
	public void setMrpBatch(String mrpBatch) {
		this.mrpBatch = mrpBatch;
	}
	public String getQmStock() {
		return qmStock;
	}
	public void setQmStock(String qmStock) {
		this.qmStock = qmStock;
	}
	public String getBlockStock() {
		return blockStock;
	}
	public void setBlockStock(String blockStock) {
		this.blockStock = blockStock;
	}
	public String getRevQty() {
		return revQty;
	}
	public void setRevQty(String revQty) {
		this.revQty = revQty;
	}
	public String getRevQtyPrt() {
		return revQtyPrt;
	}
	public void setRevQtyPrt(String revQtyPrt) {
		this.revQtyPrt = revQtyPrt;
	}
	public String getClosingStockLtr() {
		return closingStockLtr;
	}
	public void setClosingStockLtr(String closingStockLtr) {
		this.closingStockLtr = closingStockLtr;
	}
	public String getOpeningStockLtr() {
		return openingStockLtr;
	}
	public void setOpeningStockLtr(String openingStockLtr) {
		this.openingStockLtr = openingStockLtr;
	}
	public int getProdRevQtyCases() {
		return prodRevQtyCases;
	}
	public void setProdRevQtyCases(int prodRevQtyCases) {
		this.prodRevQtyCases = prodRevQtyCases;
	}
	public int getProdRevQtyPrts() {
		return prodRevQtyPrts;
	}
	public void setProdRevQtyPrts(int prodRevQtyPrts) {
		this.prodRevQtyPrts = prodRevQtyPrts;
	}
	public String getStockOutLtr() {
		return stockOutLtr;
	}
	public void setStockOutLtr(String stockOutLtr) {
		this.stockOutLtr = stockOutLtr;
	}
	public String getRevQtyLtr() {
		return revQtyLtr;
	}
	public void setRevQtyLtr(String revQtyLtr) {
		this.revQtyLtr = revQtyLtr;
	}
	@Override
	public String toString() {
		return "BpclNoQrStockRegister [id=" + id + ", locCode=" + locCode + ", prodCode=" + prodCode + ", prodName="
				+ prodName + ", prodSize=" + prodSize + ", packType=" + packType + ", upc=" + upc + ", openingStock="
				+ openingStock + ", openingStockPrt=" + openingStockPrt + ", stockIn=" + stockIn + ", stockInPrt="
				+ stockInPrt + ", stockOut=" + stockOut + ", stockOutPrt=" + stockOutPrt + ", damageQty=" + damageQty
				+ ", shortageQty=" + shortageQty + ", closingStock=" + closingStock + ", closingStockPrt="
				+ closingStockPrt + ", recordedOn=" + recordedOn + ", createdOn=" + createdOn + ", damageQtyPrt="
				+ damageQtyPrt + ", shortageQtyPrt=" + shortageQtyPrt + ", avbQtyLtrs=" + avbQtyLtrs + ", lkgQtyLtrs="
				+ lkgQtyLtrs + ", sapQty=" + sapQty + ", repackQty=" + repackQty + ", prodQty=" + prodQty + ", sloc="
				+ sloc + ", mrpBatch=" + mrpBatch + ", qmStock=" + qmStock + ", blockStock=" + blockStock + ", revQty="
				+ revQty + ", revQtyPrt=" + revQtyPrt + ", closingStockLtr=" + closingStockLtr + ", openingStockLtr="
				+ openingStockLtr + ", prodRevQtyCases=" + prodRevQtyCases + ", prodRevQtyPrts=" + prodRevQtyPrts
				+ ", stockOutLtr=" + stockOutLtr + ", revQtyLtr=" + revQtyLtr + "]";
	}
    
    
}
