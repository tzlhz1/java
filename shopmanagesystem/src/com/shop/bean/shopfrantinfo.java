package com.shop.bean;

public class shopfrantinfo {
	private String ShopFrantId;//����id
	private String ShopFrantType;//��������
	private String Conditions;//����״̬
	
	//���췽��
	public shopfrantinfo() {
		super();
	}
	//���췽����ʼ��
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
