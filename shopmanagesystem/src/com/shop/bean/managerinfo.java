package com.shop.bean;

public class managerinfo {
	private String AdmId;//管理员id
	private String AdmPwd;//管理员密码
	private String AdmName;//管理员姓名
	private String MTel;//管理员电话
	//构造方法
	public managerinfo() {
		super();
	}
	//构造方法初始化
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
