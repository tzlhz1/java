package com.shop.bean;

public class shopfrantinfo {
	private String ShopFrantId;//门面id
	private String ShopFrantType;//门面类型
	private String Conditions;//门面状态
	
	//构造方法
	public shopfrantinfo() {
		super();
	}
	//构造方法初始化
	public shopfrantinfo(String shopFrantId, String shopFrantType, String conditions) {
		super();
		ShopFrantId = shopFrantId;
		ShopFrantType = shopFrantType;
		Conditions = conditions;
	}
	public String getShopFrantId() {
		return ShopFrantId;
	}
	public void setShopFrantId(String shopFrantId) {
		ShopFrantId = shopFrantId;
	}
	public String getShopFrantType() {
		return ShopFrantType;
	}
	public void setShopFrantType(String shopFrantType) {
		ShopFrantType = shopFrantType;
	}
	public String getConditions() {
		return Conditions;
	}
	public void setConditions(String conditions) {
		Conditions = conditions;
	}

}
