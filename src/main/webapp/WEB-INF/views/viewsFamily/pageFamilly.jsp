<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<html>
<head>


<script type="text/javascript" src="../resources/javascript/media.js"></script>

<link href="../resources/css/media.css" rel="stylesheet" media="all"
	type="text/css">


<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="jumbotron text-center">
		<h1>My First Woezon loooooo</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>

	<div class="container">
		<div class="row">
			<!-- +++++++++++++++++++++++++++++ COL 1 ++++++++++++++++++++++++++++++++++++++++ -->
			<div class="col-sm-4">
				<h3>Column 1</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
					laboris...</p>
<img src="/familly/save.do${f_Image}" />

				<%-- 				<h2>Large Modal</h2>
				<!-- Trigger the modal with a button -->
				<button type="button" class="btn btn-info btn-lg"
					data-toggle="modal" data-target="#myModal">Open Large
					Modal</button>

				<!-- Modal -->
				<div class="modal fade" id="myModal" role="dialog">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Modal Header</h4>
							</div>
							<div class="modal-body">
								<p>This is a large modal.</p>
								<!-- Media photo vidéo -->
								
								
								
								
								<video id="video" width="640" height="480" autoplay></video>
								<img src="">
								<button id="snap">Snap Photo</button>
								<canvas id="canvas" width="640" height="480" style="display:none;"></canvas>
								
								
								
								
								<!-- End Media photo vidéo -->
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
							</div>
						</div>
					</div>
				</div> --%>
				<!-- End large modal -->
			</div>

			<!-- +++++++++++++++++++++++++++++ COL 2 ++++++++++++++++++++++++++++++++++++++++ -->
			<div class="col-sm-8 alert alert-success" role="alert">
				<h3 class="alert-heading">${family.firstName}${family.name}</h3>

				<!-- Media top -->
				<div class="media">
					<%-- <img src="data:image/*;base64,${family.image_F}"
						class="align-self-start mr-3" style="width: 60px"> --%>
					<div class="media-body">
						<p>
							<label>Email :</label> ${family.email}
						</p>
						<p>
							<label>Password :</label> ${family.password}
						</p>
						<p>${family.idFamily}</p>
						<hr>
						<p>...</p>
					</div>
				</div>

			<img src="/familly/save.do"/>

				<%-- 
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Nom :</th>
							<th>Prenom :</th>
							<th>Email</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${family}" var="user">
						<tr>
							<td>${family.firstName}</td>
							<td>${family.name}</td>
							<td>${family.email}</td>
							<td hidden="idFamily">${family.idFamily}</td>
						</tr>

						</c:forEach> 
					</tbody>
				</table>--%>
			</div>

			<!-- 
				<div class="col-sm-4">
					<h3>Column 3</h3>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
					<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
						laboris...</p>
				</div> -->
		</div>
	</div>
</body>
</html>