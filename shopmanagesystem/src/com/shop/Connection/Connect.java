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
		
		String User="root";//用户名
		String Pass="root";//密码
		String url="jdbc:mysql://localhost:3306/"+table+"?useSSL=false&serverTimezone=UTC";//连接的数据库地址与向下兼容和时区信息
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//通过反射获取到驱动名称
			conn=DriverManager.getConnection(url,User,Pass);//通过驱动管理得到连接对象
			
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
