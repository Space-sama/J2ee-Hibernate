package com.samaspace.test;

import java.sql.SQLException;
import java.util.List;

import com.samaspace.metier.Catalogue_Imp;
import com.samaspace.metier.DbInteraction;
import com.samaspace.metier.Product;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Catalogue_Imp Catalogue = new Catalogue_Imp();
		List<Product> Mes_Produits = Catalogue.getProductByKey("E");
		
		for (Product p: Mes_Produits) {
			
			System.out.println("ID " + " " + p.getProduct_id());
			System.out.println("NAME " + " " + p.getProduct_name());
			System.out.println("PRICE " + " " + p.getProduct_price());
			System.out.println("###################################");
		}
		
		DbInteraction.Disconnect();

	}

}
