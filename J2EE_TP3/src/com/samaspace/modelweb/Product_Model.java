package com.samaspace.modelweb;

import java.util.ArrayList;
import java.util.List;

import com.samaspace.metier.Product;



public class Product_Model {

	
	private String key;
	List<Product> produits = new ArrayList<>();
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Product> getProduits() {
		return produits;
	}
	public void setProduits(List<Product> produits) {
		this.produits = produits;
	}
	
	
	
	
}
