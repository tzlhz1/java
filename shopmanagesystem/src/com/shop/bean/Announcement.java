package com.shop.bean;

public class Announcement {
	private int AnnouncementId;//公告id
	private String Content;//公告内容
	//构造方法
	public Announcement() {
		super();
	}
	//构造方法初始化
	public Announcement(int announcementId, String content) {
		super();
		AnnouncementId = announcementId;
		Content = content;
	}
	public int getAnnouncementId() {
		return AnnouncementId;
	}
	public void setAnnouncementId(int announcementId) {
		AnnouncementId = announcementId;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	

}
