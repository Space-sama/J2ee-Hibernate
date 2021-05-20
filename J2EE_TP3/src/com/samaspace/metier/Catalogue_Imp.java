package com.samaspace.metier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Catalogue_Imp implements ImetierCatalogue {

	@Override
	public List<Product> getProductByKey(String key){
		
		List<Product> Prods = new ArrayList<Product>();
		
		try {
			
			DbInteraction.Connecter();
			PreparedStatement PS = DbInteraction.conn.prepareStatement("SELECT * FROM products WHERE Product_Name LIKE ?");
			PS.setString(1, "%"+key+"%");
			
			ResultSet RS =  PS.executeQuery();
			
			while (RS.next()) {
				
				Product p = new Product();
				p.setProduct_id(RS.getLong("id"));
				p.setProduct_name(RS.getString("Product_Name"));
				p.setProduct_price(RS.getDouble("Product_Price"));
				Prods.add(p);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something wrong in your products !");
		}
		
		return Prods;
		
	}

	@Override
	public void addProduct(Product P)  {
		
		try {
			
			DbInteraction.Connecter();
			PreparedStatement PS = DbInteraction.conn.prepareStatement("INSERT INTO products(Product_Name, Product_Price) VALUES(?, ?)");
			PS.setString(1, P.getProduct_name());
			PS.setDouble(2, P.getProduct_price());
			
			PS.executeUpdate();

			System.out.println("Product added successfully :) !");
		} catch (Exception e) {
			
			System.out.println("Sorry ! problem in adding product");
		}
		
	}
	
	

}
