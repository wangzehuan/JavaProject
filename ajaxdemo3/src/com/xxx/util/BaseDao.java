package com.xxx.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ski_db?useU?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8","root","root");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

}
