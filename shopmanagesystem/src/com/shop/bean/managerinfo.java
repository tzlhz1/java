package com.shop.bean;

public class managerinfo {
	private String AdmId;//����Աid
	private String AdmPwd;//����Ա����
	private String AdmName;//����Ա����
	private String MTel;//����Ա�绰
	//���췽��
	public managerinfo() {
		super();
	}
	//���췽����ʼ��
	public managerinfo(String admId, String admPwd, String admName, String mTel) {
		super();
		AdmId = admId;
		AdmPwd = admPwd;
		AdmName = admName;
		MTel = mTel;
	}
	public String getAdmId() {
		return AdmId;
	}
	public void setAdmId(String admId) {
		AdmId = admId;
	}
	public String getAdmPwd() {
		return AdmPwd;
	}
	public void setAdmPwd(String admPwd) {
		AdmPwd = admPwd;
	}
	public String getAdmName() {
		return AdmName;
	}
	public void setAdmName(String admName) {
		AdmName = admName;
	}
	public String getMTel() {
		return MTel;
	}
	public void setMTel(String mTel) {
		MTel = mTel;
	}
	
}
