package com.shop.Connection;

import com.shop.Connection.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	public static void main(String[] args) {
		Connect c=new Connect();
		System.out.println(c.conn("shopmannagedb"));
	}
	public Connection conn(String table){
		
		String User="root";//�û���
		String Pass="root";//����
		String url="jdbc:mysql://localhost:3306/"+table+"?useSSL=false&serverTimezone=UTC";//���ӵ����ݿ��ַ�����¼��ݺ�ʱ����Ϣ
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//ͨ�������ȡ����������
			conn=DriverManager.getConnection(url,User,Pass);//ͨ����������õ����Ӷ���
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
