<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<link href="../resources/css/formFamilly.css" rel="stylesheet"
	media="all" type="text/css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Familly register Woezon</title>

<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>

</head>
<body>

	<%@ include file="../template/header.jsp"%><div
		class="jumbotron text-center">
		<h1>My First Woezon loooooo</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>

	<div class="container">
		<div class="row">
			<div class="container-fluid bg-1 text-center col-md-offset-6">

				<!-- <div class="col-sm-8 text-center"> -->
				<div class="col-md-8">

					<f:form id="register-form" modelAttribute="familyRegistPage"
						method="post" action="save.do" role="form">

						<div id="contact-form" class="form-container" data-form-container>
							<div class="row">
								<div class="form-title">
									<span>Register page</span>
								</div>
							</div>

							<div class="input-container">

								<div class="row">
									<span class="req-input"> <span class="input-status"
										data-toggle="tooltip" data-placement="top"
										title="Input Your Last FirstName."><f:errors
												path="firstName" cssClass="error" /> </span> <f:input type="text"
											path="firstName" id="username" tabindex="1"
											class="form-control" data-min-length="8" name="firstName"
											placeholder="Your first name" />
									</span>
								</div>
								<!-- End First Name -->

								<div class="row">
									<span class="req-input"> <span class="input-status"
										data-toggle="tooltip" data-placement="top"
										title="Input Your Last Name."> </span> <f:input type="text"
											path="name" id="username" tabindex="1" class="form-control"
											data-min-length="8" name="nom" placeholder="Your last Name" />
									</span>
								</div>
								<!-- End Last Name -->

								<div class="row">
									<span class="req-input"> <span class="input-status"
										data-toggle="tooltip" data-placement="top"
										title="Input Your email address."> </span> <f:input
											type="email" path="email" id="UserEmail" tabindex="1"
											class="form-control" data-min-length="8" name="email"
											placeholder="Your email address" />
									</span>
								</div>
								<!-- End email -->

								<div class="row">
									<span class="req-input"> <span class="input-status"
										data-toggle="tooltip" data-placement="top"
										title="Input Your password."> </span> <f:input type="password"
											path="password" id="UserPassword" tabindex="1"
											class="form-control" data-min-length="8" name="password"
											placeholder="Your Password" />
									</span>
								</div>
								<!-- End Password -->

								<div class="row">
									<span class="req-input"> <span class="input-status"
										data-toggle="tooltip" data-placement="top"
										title="Input Your password."> </span> <f:input type="password"
											path="confirmPassword" id="UserPassword" tabindex="1"
											class="form-control" data-min-length="8"
											name="password Matches" placeholder="Your Confirm Password" />
									</span>
								</div>
								<!-- End Password matches -->

								<div class="row">
									<span class="req-input">
									
									 <f:input type="file"
											path="image_F" id="img" tabindex="1" class="form-control"
											name="image_F" placeholder="Your image" />
									</span>
								</div> <!-- End image -->

									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" name="register-submit"
												id="register-submit" tabindex="4"
												class="form-control btn btn-register" value="Register Now" />
										</div>
									</div>
									
							</div>
						</div>

					</f:form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>