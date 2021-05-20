package com.samaspace.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class DbInteraction {
	
	public static String url="";
	public static Statement state;
	public static Connection conn;
	
	
	
	public static void Connecter() throws ClassNotFoundException {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			url= "jdbc:mysql://localhost:3306/tp3_j2ee?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String username = "root";
			String pass = "";
			
			try {
				
				conn = DriverManager.getConnection(url, username, pass);
				state = conn.createStatement();
				
				System.out.println("You are connected to your database correctlly...");
				
			} catch (Exception e) {
				System.out.println("Oops something went wrong on your database !");
			}
		
		
	}
	
	
	
	public static void Disconnect() throws SQLException {
		
		conn.close();
		System.out.println("Disconnected...");
	}

}
