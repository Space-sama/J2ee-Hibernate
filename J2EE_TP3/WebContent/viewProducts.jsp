<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienveunu !</title>
</head>
<body>

		<form action="gestion_des_produits" method="post">
		<input type="text" name="key" value="${modele.key}"/>
		<input type="submit" value="Envoyer" />
		</form>
		
		<table border="1" width="80%">
			<tr>
				<th>ID</th> <th>Name of the product</th> <th>Price of the product</th>
			</tr>
			
			<c:forEach items="${modele.produits}" var="p">
      <tr>
        <td>${p.product_id}</td>
        <td>${p.product_name}</td>
        <td>${p.product_price}</td>
      </tr>
   </c:forEach>
			 
 
		</table><br /><br />
		<a href='<c:url value="http://localhost:8080/J2EE_TP3/AddProduit.jsp" />'>Add a product</a>


</body>
</html>