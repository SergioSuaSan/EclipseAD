<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <title>Platos</title>
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
        <link rel="stylesheet" href="mycss.css">
        
    </head>

    <body>
        <header class="bg-azul p-3">
            <!-- place navbar here -->
             <img src="img/logo.png" alt="">

        </header>
        <main>
            <section>
                <div id="carouselId" class="carousel slide" data-bs-ride="carousel">
                    <ol class="carousel-indicators list-unstyled  ">
                        <li
                            data-bs-target="#carouselId"
                            data-bs-slide-to="0"
                            class="active"
                            aria-current="true"
                            aria-label="First slide"
                        ></li>
                        <li
                            data-bs-target="#carouselId"
                            data-bs-slide-to="1"
                            aria-label="Second slide"
                        ></li>
                        <li
                            data-bs-target="#carouselId"
                            data-bs-slide-to="2"
                            aria-label="Third slide"
                        ></li>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                        <div class="carousel-item active">
                            <img
                                src="img/slider1.png"
                                class="w-100 d-block"
                                alt="First slide"
                            />
                        </div>
                        <div class="carousel-item">
                            <img
                                src="img/slider2.png"
                                class="w-100 d-block"
                                alt="Second slide"
                            />
                        </div>
                        <div class="carousel-item">
                            <img
                                src="img/slider3.png"
                                class="w-100 d-block"
                                alt="Third slide"
                            />
                        </div>
                    </div>
                    <button
                        class="carousel-control-prev"
                        type="button"
                        data-bs-target="#carouselId"
                        data-bs-slide="prev"
                    >
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button
                        class="carousel-control-next"
                        type="button"
                        data-bs-target="#carouselId"
                        data-bs-slide="next"
                    >
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
                
            </section>
            <section class="pt-3">
                <h1 class="text-mas-azul bg-light text-center p-3 mb-3">${nombrecat}</h1>
                <div class="container shadow">
                    <div class="row justify-content-center">
                    <c:forEach items="${productos}" var="plato">
                        <div class="col-md-6 col-lg-4">
                            <a href="Controller?op=detail&idproducto=${plato.id}&nombreproducto=${plato.titulo}" class="text-decoration-none">
                                <div class="card">
                                    <img class="card-img-top" src="${plato.imagen}" alt="Title" />
                                    <div class="card-body">
                                        <h4 class="card-title text-center">${plato.titulo}</h4>
                                        
                                    </div>
                                </div>
                            </a>
                                
                        </div>
                    </c:forEach>
                    </div>
                </div>


            </section>
        </main>
        <footer class="bg-azul">
            <!-- place footer here -->
             <h1 class="text-center text-white m-0 p-3">Foster Hollywood</h1>
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
