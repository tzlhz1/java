package com.shop.bean;

public class Announcement {
	private int AnnouncementId;//����id
	private String Content;//��������
	//���췽��
	public Announcement() {
		super();
	}
	//���췽����ʼ��
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
