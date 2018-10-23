package com.shop.bean;

public class shopinfo {
	private String ShopId;//商户id
	private String ShopName;//商户名称
	private String ShopFrantId;//商户位置
	private String ShopType;//商户类型
	private String ShopKeeper;//商户户主
	private String Tel;//联系方式
	
	//构造方法
	public shopinfo() {
		super();
	}
	//构造方法初始化
	public shopinfo(String shopId, String shopName, String shopFrantId, String shopType, String shopKeeper,
			String tel) {
		super();
		ShopId = shopId;
		ShopName = shopName;
		ShopFrantId = shopFrantId;
		ShopType = shopType;
		ShopKeeper = shopKeeper;
		Tel = tel;
	}
	public String getShopId() {
		return ShopId;
	}
	public void setShopId(String shopId) {
		ShopId = shopId;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public String getShopFrantId() {
		return ShopFrantId;
	}
	public void setShopFrantId(String shopFrantId) {
		ShopFrantId = shopFrantId;
	}
	public String getShopType() {
		return ShopType;
	}
	public void setShopType(String shopType) {
		ShopType = shopType;
	}
	public String getShopKeeper() {
		return ShopKeeper;
	}
	public void setShopKeeper(String shopKeeper) {
		ShopKeeper = shopKeeper;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	
	
}
