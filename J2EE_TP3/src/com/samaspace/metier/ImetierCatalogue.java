package com.samaspace.metier;

import java.util.List;

public interface ImetierCatalogue {
	
	public List<Product> getProductByKey(String key);
	public void addProduct(Product P);
	

}
