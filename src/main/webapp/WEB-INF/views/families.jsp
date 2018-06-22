<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Woezon looo</title>
</head>
<body>

	<div id="formProducts">
		<f:form modelAttribute="familly" method="post" action="saveFamilly">
			<table>
				<tr>
					<th>Référence:</th>
					<td><f:input path="reference" /></td>
				</tr>
				<tr>
					<th>Désignation:</th>
					<td><f:input path="designation" /></td>
				</tr>
				<tr>
					<th>Prix:</th>
					<td><f:input path="price" /></td>
				</tr>
				<tr>
					<th>Quantité:</th>
					<td><f:input path="amount" /></td>
				</tr>
				<f:hidden path="id" />
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</f:form>
	</div>
	<div id="listProducts">
		<table class="table1">
			<tr>
				<th>REF</th>
				<th>DESIGNATION</th>
				<th>PRIX</th>
				<th>QUANTITE</th>
			</tr>
			<c:forEach items="${families}" var="p">
				<tr>
					<td>${p.nom}</td>
					<%-- <td>${p.designation}</td>
					<td>${p.price}</td>
					<td>${p.amount}</td>
					<td><a href="deleteProduct?id=${p.id}">Supprimer</a></td>
					<td><a href="editProduct?id=${p.id}">Modifier</a></td> --%>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>