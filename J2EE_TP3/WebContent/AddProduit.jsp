<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>ADD A PRODUCT</title>
</head>
<body>
  <form action="ajouterProd" method="post">
    <label>Product name :</label>
    <input type="text"  name="nom" required="required">
    </br>
    <label>Product price :</label>
    <input type="text"  name="prix" required="required">
     </br>
    <input type="submit" value="Add product">
  </for> <br />
  
  <a href='<c:url value="http://localhost:8080/J2EE_TP3/viewProducts.jsp" />'>Search a product</a>
  
  
  
  
  
</body>