<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <title>Rutas</title>
        <!-- Required meta tags -->
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
        />

        <!-- Bootstrap CSS v5.2.1 -->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous"
        />
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <header>
            <!-- place navbar here -->
             <div class="row justify-content-between align-items-center bg-primary m-0">
                <div class="col">
                    <div class="p-3">

                        <img src="img/logo.png" alt="Logo">
                    </div>
                </div>
                <div class="col">
                    <div class="row justify-content-center align-items-center fs-2">
                        <div class="col text-sm-end">
                            <a href="Controller?op=inicio" class="text-white text-decoration-none">Ciudades</a>
                        </div>
                        <div class="col">
                            <div class="dropdown">
                                <button
                                    class="btn text-white fs-2 dropdown-toggle"
                                    type="button"
                                    id="triggerId"
                                    data-bs-toggle="dropdown"
                                    aria-haspopup="true"
                                    aria-expanded="false"
                                >
                                    Rutas
                                </button> 
                                <div class="dropdown-menu" aria-labelledby="triggerId">
                                  <c:forEach items="${ciudadesruta}" var="ciudad">
                                    <a class="dropdown-item" href="Controller?op=dameciudad&idciudad=${ciudad.id}&nombreciu=${ciudad.nombre}">${ciudad.nombre}</a>
                                  </c:forEach>
                                   
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div>

             </div>
        </header>
        <main class="bg-body-secondary">
            <div class="container">
                <div class="row justify-content-center ">       
                    <div class="text-center text-white fs-1 fw-semibold m-3 p-3 bg-primary m-0">
                        	${nombreciu}
                    </div>
                 		<c:forEach items="${rutas}" var="ruta">
                    <div class="col-lg-6 d-flex p-3">
                        <div class="card flex-fill shadow">
                            <a href="${ruta.link}">
                                <img class="card-img-top" src="${ruta.imagen}" alt="Title" />
                            </a>
                            <div class="card-body ">
                                <h4 class="card-title">${ruta.nombre}</h4>
                                <p class="card-text">${ruta.descripcion }</p>
                                <h4 class="text-center p-3  d-inline">
                                   
                                   <c:forEach begin="1" end="${ruta.puntos}">
                                     &starf;
                                   </c:forEach>
                               
                                </h4>
                                <div class="m-5"></div>
                                <div class=" float-end bottom-0">
                                    <span class="rating">
                                        <a href="Controller?op=rating&rating=1&rutaid=${ruta.id}&idciudad=${idciudad}&nombreciu=${nombreciu}">&#9733;</a>
                                        <a href="Controller?op=rating&rating=2&rutaid=${ruta.id}&idciudad=${idciudad}&nombreciu=${nombreciu}">&#9733;</a>
                                        <a href="Controller?op=rating&rating=3&rutaid=${ruta.id}&idciudad=${idciudad}&nombreciu=${nombreciu}">&#9733;</a>
                                        <a href="Controller?op=rating&rating=4&rutaid=${ruta.id}&idciudad=${idciudad}&nombreciu=${nombreciu}">&#9733;</a>
                                        <a href="Controller?op=rating&rating=5&rutaid=${ruta.id}&idciudad=${idciudad}&nombreciu=${nombreciu}">&#9733;</a>
                                      
                                    </span>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                    
                 		</c:forEach>    
                    
                </div>
            </div>

        </main>
        <footer class="bg-primary">
            <!-- place footer here -->
             <h1 class="text-center text-white p-3 m-0">&copy; Sergio</h1>
        </footer>
        <!-- Bootstrap JavaScript Libraries -->
        <script
            src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
            integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
            crossorigin="anonymous"
        ></script>

        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
            integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
            crossorigin="anonymous"
        ></script>
    </body>
</html>
