<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<link href="./resources/css/formFamilly.css" rel="stylesheet"
	media="all" type="text/css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Woezon looo</title>
</head>
<body>

	<%@ include file="./template/header.jsp"%>

	<div class="container-fluid bg-1 text-center col-md-offset-4">

		<div class="col-sm-4 text-center">

			<h3>Coucou page Login</h3>

			<%-- <video id="video" width="640" height="480" autoplay></video>
	<button id="snap">Snap Photo</button>
	<canvas id="canvas" width="640" height="480"></canvas> --%>





			<!-- ******************************************************************* -->
			<div id="contact-form" class="form-container" data-form-container>
				<div class="row">
					<div class="form-title">
						<span>Inscription Accueil</span>
					</div>
				</div>

				<f:form id="loginForm" modelAttribute="Familly" action="saveFamilly"
					method="post">
					<div class="input-container">
						<div class="row">
							<span class="req-input"> <span class="input-status"
								data-toggle="tooltip" data-placement="top"
								title="Input Your Last Name."> </span> <input type="text"
								data-min-length="8" name="nom" placeholder="Votre nom">
							</span>
						</div>

						<div class="row">
							<span class="req-input"> <span class="input-status"
								data-toggle="tooltip" data-placement="top"
								title="Input Your First"> </span> <input type="text"
								data-min-length="8" name="prenom" placeholder="Votre prenom">
							</span>
						</div>

						<div class="row">
							<span class="req-input"> <span class="input-status"
								data-toggle="tooltip" data-placement="top"
								title="Input Your continent"> </span> <input type="text"
								data-min-length="8" name="Continent.nomContinent"
								placeholder="Le continent où vous situez..">
							</span>
						</div>

						<div class="row">
							<span class="req-input"> <span class="input-status"
								data-toggle="tooltip" data-placement="top"
								title="Input Your country"> </span> <input type="text"
								data-min-length="8" name="Pays.nomPays"
								placeholder="Pays de résidence">
							</span>
						</div>

						<div class="row">
							<span class="req-input"> <span class="input-status"
								data-toggle="tooltip" data-placement="top"
								title="Input Your capital"> </span> <input type="text"
								data-min-length="8" name="Pays.capital"
								placeholder="La capital du pays">
							</span>
						</div>

						<div class="row">
							<span class="req-input"> <span class="input-status"
								data-toggle="tooltip" data-placement="top"
								title="Input Your VilleAccueil"> </span> <input type="text"
								data-min-length="8" name="Pays.VilleAccueil"
								placeholder="Ville d'Accueil">
							</span>
						</div>

						<div class="row">
							<span class="req-input"> <span class="input-status"
								data-toggle="tooltip" data-placement="top"
								title="Input how are you in the familly"> </span> <input
								type="text" data-min-length="8" name="compositionFamily"
								placeholder="Combien etes-vous dans la famille ?">
							</span>
						</div>

						<div class="row">
							<span class="req-input message-box"> <span
								class="input-status" data-toggle="tooltip" data-placement="top"
								title="Please Include a Message."> </span> <textarea
									name="whoIam" type="textarea" data-min-length="10"
									placeholder="Dites nous en bref qui vous êtes "></textarea>
								<h5>320 characters remaining</h5>
							</span>
						</div>

						<div class="row">
							<span class="req-input message-box"> <span
								class="input-status" data-toggle="tooltip" data-placement="top"
								title="Please Include a Message."> </span> <textarea
									name="Loisirs" type="textarea" data-min-length="10"
									placeholder="Vos loisirs "></textarea>
								<h5>320 characters remaining</h5>
							</span>


							<button type="submit" class="btn btn-block submit-form">Submit</button>
						</div>


						<!-- <div class="row">
								<span class="req-input"> <span class="input-status"
									data-toggle="tooltip" data-placement="top"
									title="Please Input Your Email."> </span> <input type="email"
									placeholder="Email">
								</span>
							</div>
							<div class="row">
								<span class="req-input"> <span class="input-status"
									data-toggle="tooltip" data-placement="top"
									title="Please Input Your Phone Number."> </span> <input
									type="tel" placeholder="Phone Number">
								</span>
							<button type="submit" class="btn btn-block submit-form">Submit</button>
						</div>-->
					</div>
				</f:form>

			</div>
			<!-- *******************************END FORM************************************ -->
		</div>

	</div>


	<%-- <div id="formProducts">
			<f:form modelAttribute="familly" method="post" action="saveFamilly">

				<label>votre nom</label>
				<br>
				<input type="text" name="nom">
				<br>
				<br>

				<label>votre prénom</label>
				<br>
				<input type="text" name="FamilyAcc.prenom">
				<br>
				<br>

				<label>votre pays de résidence</label>
				<br>
				<input type="text" name="Pays.nomPays">
				<br>
				<label> Quel Continent</label>
				<br>
				<input type="text" name="Continent.continent">
				<br>
				<label> La capital de votre pays</label>
				<br>
				<input type="text" name="Pays.capital">
				<label> La ville de résidence</label>
				<br>
				<input type="text" name="Pays.VilleAccueil">
				<br>
				<br>

				<label>Dites-nous qui vous êtes en bref</label>
				<br>
				<input type="text" name="whoIam">
				<br>
				<br>

				<label>Combien êtes-vous dans le foyé ?</label>
				<br>
				<input type="text" name="compositionFamily">
				<br>
				<br>

				<label>Quels sont vos loisirs</label>
				<br>
				<input type="text" name="Loisirs">
				<br>
				<br>

				<input type="hidden" name="id">

				<input type="submit" value="Save">
				<br>
			</f:form> --%>



	<%-- <form class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-2 control-label">Votre nom</label>
						<div class="col-sm-10">
							<input class="form-control" id="focusedInput" type="text"
								name="nom" value="Click to focus...">
						</div>
					</div>
					<div class="form-group">
						<label for="disabledInput" class="col-sm-2 control-label">Disabled</label>
						<div class="col-sm-10">
							<input class="form-control" id="disabledInput" type="text"
								placeholder="Disabled input here..." disabled>
						</div>
					</div>
					<fieldset disabled>
						<div class="form-group">
							<label for="disabledTextInput" class="col-sm-2 control-label">Disabled
								input and select list (Fieldset disabled)</label>
							<div class="col-sm-10">
								<input type="text" id="disabledTextInput" class="form-control"
									placeholder="Disabled input">
							</div>
						</div>
						<div class="form-group">
							<label for="disabledSelect" class="col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<select id="disabledSelect" class="form-control">
									<option>Disabled select</option>
								</select>
							</div>
						</div>
					</fieldset>
					<div class="form-group has-success has-feedback">
						<label class="col-sm-2 control-label" for="inputSuccess">Input
							with success and glyphicon</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputSuccess">
							<span class="glyphicon glyphicon-ok form-control-feedback"></span>
						</div>
					</div>
					<div class="form-group has-warning has-feedback">
						<label class="col-sm-2 control-label" for="inputWarning">Input
							with warning and glyphicon</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputWarning">
							<span
								class="glyphicon glyphicon-warning-sign form-control-feedback"></span>
						</div>
					</div>
					<div class="form-group has-error has-feedback">
						<label class="col-sm-2 control-label" for="inputError">Input
							with error and glyphicon</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputError">
							<span class="glyphicon glyphicon-remove form-control-feedback"></span>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>
				</form>
			</div> --%>



	<%-- <f:form modelAttribute="/familly" method="post" action="saveFamilly">
				<table>
					<tr>
						<th>nom:</th>
						<td><f:input path="nom" /></td>
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
			</f:form> --%>
	<%-- </div>
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
							<td>${p.designation}</td>
					<td>${p.price}</td>
					<td>${p.amount}</td>
					<td><a href="deleteProduct?id=${p.id}">Supprimer</a></td>
					<td><a href="editProduct?id=${p.id}">Modifier</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div> --%>

	<%@ include file="./template/footer.jsp"%>>
</body>
</html>