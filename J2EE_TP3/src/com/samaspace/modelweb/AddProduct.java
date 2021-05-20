package com.samaspace.modelweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samaspace.metier.Catalogue_Imp;
import com.samaspace.metier.ImetierCatalogue;
import com.samaspace.metier.Product;


	
	@WebServlet (name="as",urlPatterns= {"/ajouterProd"})
	public class AddProduct extends HttpServlet{
		private ImetierCatalogue metier;
		
		 
		
		@Override
		protected void doPost(HttpServletRequest request, 
				              HttpServletResponse response) 
				           throws ServletException, IOException {
			//lire les paramètres envoyés par la page jsp par la méthode post
			
			String nomProduit = request.getParameter("nom");
			String prix = request.getParameter("prix");
			
			//créartion d'un objet Produit
			
			Product prod = new Product();
			prod.setProduct_name(nomProduit);
			prod.setProduct_price(Double.parseDouble(prix));
			
			//appel de la méthode métier d'ajout du produit
			
			metier=new Catalogue_Imp();
			metier.addProduct(prod);
					
			
	        //aller sur la page liste des produits 		
			 request.getRequestDispatcher("/AddProduit.jsp").forward(request, response);
}
		
	}

