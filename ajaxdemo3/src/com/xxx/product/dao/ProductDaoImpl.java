package com.xxx.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xxx.util.BaseDao;

public class ProductDaoImpl<Product> {
	
	public Product findProductByName(String name){
		
		Connection conn = null;
		try {
			conn=BaseDao.getCon();
			PreparedStatement ps = conn.prepareStatement("select * from product where name = ?");
			ResultSet re = ps.executeQuery();
			Product p = null;
			while(re.next()){
				p = new Product();
				p.setId(re.getInt(1));
				p.setName(rs.getString(2));
				p.setDescription(rs.getString(3));
				p.setPrice(re.getInt(5));
				p。
			}
			return p;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
