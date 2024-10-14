<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<title>Detalles</title>
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
	<header>
		<div class="row align-items-md-stretch">
			<div class="col">
				<div class="h-100 p-5 text-white bg-primary border rounded-3">
					<h2>${lugar.titre}</h2>
					<p>${lugar.description_es}</p>

				</div>
			</div>

		</div>
	
	</header>
	<main>
		<!-- place navbar here -->
		<div id="carouselId" class="carousel slide" data-bs-ride="carousel">

			<div class="carousel-inner" role="listbox">
				<c:set var="c" value="0" />
				<c:forEach items="${lugar.photos}" var="foto">

					<c:choose>
						<c:when test="${c==0}">
							<div class="carousel-item active">
								<img src="${foto.link_large}" class="w-100 d-block"
									alt="First slide" />
							</div>
							<c:set var="c" value="${c+1}" />
						</c:when>
						<c:otherwise>
							<div class="carousel-item">
								<img src="${foto.link_large}" class="w-100 d-block" alt="Slide" />
							</div>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselId" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselId" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>


	</main>
	<footer>
		<!-- place footer here -->
	</footer>
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
