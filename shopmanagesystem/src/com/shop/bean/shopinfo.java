package com.shop.bean;

public class shopinfo {
	private String ShopId;//�̻�id
	private String ShopName;//�̻�����
	private String ShopFrantId;//�̻�λ��
	private String ShopType;//�̻�����
	private String ShopKeeper;//�̻�����
	private String Tel;//��ϵ��ʽ
	
	//���췽��
	public shopinfo() {
		super();
	}
	//���췽����ʼ��
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
