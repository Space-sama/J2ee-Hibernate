package com.samaspace.modelweb;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.samaspace.metier.Catalogue_Imp;
import com.samaspace.metier.ImetierCatalogue;
import com.samaspace.metier.Product;


@WebServlet(name="cs", urlPatterns= {"/gestion_des_produits"})
public class ControllerServlet extends HttpServlet{
	
	private ImetierCatalogue metier;
	
	@Override
	public void init() throws ServletException{
		
		metier = new Catalogue_Imp();
	}
	
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String key = request.getParameter("key");
		Product_Model Pm = new Product_Model();
		Pm.setKey(key);
		
		
			
			List<Product> prods = metier.getProductByKey(key);
			Pm.setProduits(prods);
			
			request.setAttribute("modele", Pm);
			request.getRequestDispatcher("/viewProducts.jsp").forward(request, response);
			
		
		
		
		
	}
	
}
