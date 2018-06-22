<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<link href="./resources/css/style.css" rel="stylesheet" media="all"
	type="text/css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title><spring:message code="label.Home" /></title>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Woezon</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#"><spring:message
							code="label.Home" /></a></li>

				<%-- <li><a href="#"><spring:message  code="label.Home" /></a></li> --%>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"><spring:message
							code="label.lang" /> <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="?language=en">English</a></li>
						<li><a href="?language=fr">France</a></li>
						<li><a href="?language=germany">Germany</a></li>
					</ul></li>
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						<spring:message code="label.SigneUp" /></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						<spring:message code="label.Login" /></a></li>
			</ul>
		</div>
	</nav>

	 <div class="container-fluid bg-1 text-center">

		<h1>Hello world!</h1>

		<P>The time on the server is ${serverTime}.</P>

		Language: <a href="?language=en">English</a> | <a href="?language=fr">Français</a>

	</div>
</body>
</html>
