<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<title>Marvel</title>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body class="bg-dark-subtle">
	<a name="up"></a>
	<a href="#up"> <i
		class="fa fa-arrow-up btn btn-danger position-fixed end-0 bottom-0 m-4"
		aria-hidden="true"></i>
	</a>
	<div class="container bg-black shadow p-0">


		<header class="bg-danger p-4">
			<!-- place navbar here -->
			<div class="row align-items-center">
				<div class="col">
					<img src="img/Marvel_Logo.svg.png" alt="" width="200">

				</div>
				<div class="col">
					<h1 class="text-center text-white text-">Marvel Heroes</h1>

				</div>
				<div class="col text-end">
					<img src="img/Marvel_Logo.svg.png" alt="" width="200">
				</div>

			</div>
		</header>
		<main>
			<div class="table-dark">
				<div class="row justify-content-center mx-3">

					<c:forEach var="personaje" items="${personajes}">

						<div class="col-md-6 	 d-flex my-3">
							<div class="card flex-fill bg-dark-subtle">
								<div class="row d-flex bg-dark-subtle m-0 rounded">

									<div class="col-4 m-0 p-0">
										<img class="card-img-top m-0 rounded"
											src="${personaje.icono.ruta}.${personaje.icono.extension}"
											alt="Title" width="250" height="250" />
									</div>
									<div class="col-8 rounded p-0">
										<div class="card w-100 p-0 m-0">
											<img class="card-img opacity-25" src="${personaje.icono.ruta}.${personaje.icono.extension}"
												alt="Title" width="250" height="250" />
											<div class="card-img-overlay ">
												<h4 class="card-title">${personaje.name}</h4>
												<p class="card-text">${personaje.description}</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</main>
		<footer>
			<!-- place footer here -->
			<h2 class="text-white bg-danger text-center p-3 m-0">&copy;
				Sergio</h2>
		</footer>
	</div>
	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
		integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
		crossorigin="anonymous"></script>
</body>
</html>
