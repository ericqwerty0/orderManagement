package com.orderManagement.entity;

public class Product {
	private String desc;
	private String desc_chi;
	private int product_type_id;
	private int company_id;
	private String price;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc_chi() {
		return desc_chi;
	}
	public void setDesc_chi(String desc_chi) {
		this.desc_chi = desc_chi;
	}
	public int getProduct_type_id() {
		return product_type_id;
	}
	public void setProduct_type_id(int product_type_id) {
		this.product_type_id = product_type_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
