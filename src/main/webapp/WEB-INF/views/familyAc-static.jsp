<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Woezon looo</title>
</head>
<body>
		<div id="formFamily">
		<form method="post" action="saveFamilly">
		<table   class="table1">
			<tr><th>Référence:</th><td></td><td><input value ="ABC"/></td></tr>
			<tr><th>Désignation:</th><td></td><td><input value ="Livre Spring"/></td></tr>
			<tr><th>Prix:</th><td></td><td><input value ="25"/></td></tr>
			<tr><th>Quantité:</th><td></td><td><input value ="10"/></td></tr>
			<tr><td><input type="submit" value="Save"></td></tr>
		</table>
		</form>
	</div>
	<div id="listProducts">
		<table class="table1">
			<tr><th>REF</th><th>DESIGNATION</th><th>PRIX</th><th>QUANTITE</th><th></th><th></th></tr>
			<!-- c:forEach items=""-->
				<tr><td>ABC1</td><td>Livre1 Spring par la pratique</td><td>25</td><td>10</td><td><a href="deleteProduct?ref=">Supprimer</a></td><td><a href="editProduct?ref=">Modifier</a></td></tr>
				<tr><td>ABC2</td><td>Livre2 Spring par la pratique</td><td>20</td><td>20</td><td><a href="deleteProduct?ref=">Supprimer</a></td><td><a href="editProduct?ref=">Modifier</a></td></tr>
				<tr><td>ABC3</td><td>Livre3 Spring par la pratique</td><td>30</td><td>05</td><td><a href="deleteProduct?ref=">Supprimer</a></td><td><a href="editProduct?ref=">Modifier</a></td></tr>

			<!-- /c:forEach-->
		</table>
	</div>
</body>
</html>