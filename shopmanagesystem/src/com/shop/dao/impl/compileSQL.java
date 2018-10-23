package com.shop.dao.impl;

import com.shop.Connection.Connect;
import com.shop.bean.shopfrantinfo;
import com.shop.dao.Util;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




//给数据库添加一条数据
public class compileSQL implements Util{
	/*public static void main(String[] args) {
		compileSQL u=new compileSQL();
		shopfrantinfo bt=new shopfrantinfo();
		bt.setShopFrantId("001");
		bt.setShopFrantType("A");
		bt.setConditions("BB");
		u.add(bt);
	}*/
	//传递一组对象对其对应的数据库插入一条语句
	@Override
	public void add(Object bt) {
		// TODO Auto-generated method stub
		String sql="insert into";
		StringBuffer sb=new StringBuffer(sql);
		
		Class<? extends Object> cbt = bt.getClass();
		//获取类名
		String table=cbt.getSimpleName();
		sb.append(" "+table);
		sb.append("(");
		Field[] filed = cbt.getDeclaredFields();
		for(Field f:filed){
			sb.append(f.getName()+",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append(") values (");
		for(Field f:filed){
			try {
				f.setAccessible(true);
				 String genericType = f.getGenericType().toString();
				 //System.out.println(genericType);
				if(!genericType.equals("class java.lang.String")){
					sb.append(f.get(bt)+",");
				}else{
					sb.append("'"+f.get(bt)+"',");
				}
				//System.out.println(f.get(bt));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append(")");
		
		Connect con=new Connect();
		
		Connection co=con.conn("shopmannagedb");
		try {
			PreparedStatement prepareStatement = co.prepareStatement(sb.toString());
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
