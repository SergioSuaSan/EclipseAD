<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
<title>AllTricks</title>
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
</head>

<body>
	<div class="container shadow p-0">
		<header class="bg-primary p-4 ">
			<!-- place navbar here -->
			<img src="img/logo-white.png" alt="logo-white" width="300">
		</header>
		<main>
			<section class="container px-5">
				<div class="row justify-content-center align-items-center pt-3">
					<div class="col-md-4 text-end mb-3">
						<form action="Controller?op=vamarca" method="post">
							<select class="form-select" name="marca"
								onchange="this.form.submit()">
								<option value = "%">Todas</option>
								<c:forEach items="${marcas}" var="marca">
									<option value="${marca.id}">${marca.nombre}</option>
								</c:forEach>

							</select>
						</form>


					</div>
					<div class="col-md-4 text-center mb-3">
						<form action="Controller?op=vaorder" method="post">
							<select class="form-select " name="order"
								onchange="this.form.submit()">
								<option selected>Ordenar por</option>
								<option value="null">Nada</option>
								<option value="precio asc">Precio Ascendente</option>
								<option value="precio desc">Precio Descendente</option>
								<option value="marca">Marca</option>
							</select>
						</form>


					</div>
					<div class="col-md-4 mb-3 text-end text-md-center">
						<div class="">
							<a href="controller?op=fav"
								class="text-decoration-none text-secondary"> <span
								class="display-3">&#9733</span>
							</a>
						</div>
					</div>
				</div>
			</section>

			<section>
				<div class="row justify-content-center p-3">
					<c:forEach items="${bicis}" var="bici">
						<div class="col-md-6 col-lg-4 d-flex mb-3">
							<div class="card flex-fill">
								<img class="card-img-top" src="${bici.foto}" alt="biciiiiiii" />
								<div class="card-body">
									<h4 class="card-title">${bici.nombreMarca}</h4>
									<p class="card-text">${bici.descripcion}</p>
									<p class="card-text">${bici.precio}</p>
									<c:choose>
										<c:when test="${bici.fav == '1'}">
										<a href="Controller?op=fav"
												class="text-decoration-none text-warning"> 
												<span class="display-3">&#9733</span>
											</a>
										</c:when>
										
										<c:otherwise>
										<div class="">
										${bici.fav} = % </div>
											<a href="controller?op=fav"
												class="text-decoration-none text-secondary"> 
												<span class="display-3">&#9733</span>
											</a>
										</c:otherwise>
									</c:choose>


								</div>
							</div>

						</div>
					</c:forEach>
				</div>
			</section>
		</main>
		<footer>
			<!-- place footer here -->
			<div>
				<h1 class="bg-primary text-white text-center m-0 p-4">&copy;
					Sergio</h1>
			</div>
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