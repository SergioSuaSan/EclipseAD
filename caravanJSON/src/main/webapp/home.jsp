<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <title>Caravanas</title>
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
    </head>

    <body>
        <div class="container shadow">
            <header>
                <!-- place navbar here -->
            </header>
            <main>
            
                <div class="row justify-content-center">
                
                <c:forEach var="lugar" items="${lugares}">
                
                    <div class="col-md-6 d-flex mb-3">
                        <div class="card flex-fill">
                         <img src="${lugar.photos[0].link_large}" alt="">
                        <a href = "Controller?op=detail&lugarid=${lugar.id}" class= "text-dark text-decoration-none">
                            <div class="card-body">
                                <h4 class="card-title">${lugar.titre}</h4>
                                <p class="card-text">${lugar.description_es}</p>
                            </div>
                        </a>
                        </div>
                        
                    </div>

                </c:forEach>
                </div>
            </main>
            <footer>
                <!-- place footer here -->
            </footer>
        </div>
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
