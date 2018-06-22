<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<html>
<head>


<script type="text/javascript" src="./resources/javascript/media.js"></script>

<link href="./resources/css/media.css" rel="stylesheet" media="all"
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
	<div class="container">
		<%-- <video id="video" width="640" height="480" autoplay></video>
		<button id="snap">Snap Photo</button>
		<canvas id="canvas" width="640" height="480"></canvas> --%>

		<f:form id="register-form" modelAttribute="familyRegistPage"
			method="post" action="save.do" role="form">
			<!-- <input type="file" accept="video/*;capture=camcorder"> -->
			<input type="file" accept="image/*;capture=camera">

			<div class="form-group">
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3">
						<input type="submit" name="register-submit" id="register-submit"
							tabindex="4" class="form-control btn btn-register"
							value="Register Now" />
					</div>
				</div>
			</div>

		</f:form>

	</div>
</body>
</html>