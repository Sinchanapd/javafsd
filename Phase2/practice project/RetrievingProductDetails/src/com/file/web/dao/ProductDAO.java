package com.file.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.file.web.model.Product;

public class ProductDAO {
	
	public Product getProduct(int pid) {
		Product product = new Product();

		try {
			//1-Connect to the database 
			Class.forName("com.mysql.jdbc.Driver");
			Connection connectionToDB = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ecomm?createDatabaseIfNotExist=true", "root", "root");
			Statement st = connectionToDB.createStatement();
			//2-Execute a query to get data from the database
			ResultSet resultData = st.executeQuery("select * from eproduct where id=" + pid + ";");

			if (resultData.next()) {
				//3-Save the data in a new product object.
				product.setId(resultData.getInt("id"));
				product.setName(resultData.getString("name"));
				product.setCompany(resultData.getString("company"));
			}

		} catch (SQLException e) {
			System.out.println("sql problem:" + e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//4-Return the product to be used in the (Product Controller)
		return product;

	}
		
	
}
