<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<head>
    <title>Turismo</title>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <!-- Bootstrap CSS v5.2.1 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <header>
        <!-- place navbar here -->
        <div class="row m-0 justify-content-between align-items-center">
            <div class="col">
                <a href="Controller?op=inicio">
                    <img src="img/logo.png" alt="inicio">
                </a>
            </div>
            <div class="col w-100 text-end">
             <c:choose>
							<c:when test="${fav == '1'}">
								<a href="Controller?op=damefav&idprovincia=${provincia.id}&idcategoria=${idcategoria}&idlugar=${idlugar}&idfav=0&favid=0">
                    <i class="fa fa-heart p-3 text-danger" aria-hidden="true"></i>
                </a>
							</c:when>

							<c:otherwise>
								 <a href="Controller?op=damefav&idprovincia=${provincia.id}&idcategoria=${idcategoria}&idlugar=${idlugar}&idfav=1&favid=1">
                   				 <i class="fa fa-heart p-3 text-dark" aria-hidden="true"></i>
                </a>
							</c:otherwise>
						</c:choose>
                
            </div>

        </div>
    </header>
    <main>
        <section>
            <div class="ratio ratio-16x9 ">
                <video src="img/video.mp4" autoplay onplay=""></video>
            </div>
        </section>
        <section>
            <div class="shadow p-3">

                <div class="card">
                    <div class="row clmbg">
                        <div class="col-8 p-0 ">
                            <img class="card-img-top img-fluid" src="img/molinos.jpg" alt="Title" />
                        </div>
                        <div class="col-4 h-100">
                        <c:forEach items="${provincias}" var="provincia">
                      
                        
                        	
                            <a href="Controller?op=dameprovincia&idprovincia=${provincia.id}&idcategoria=${idcategoria}&idlugar=${idlugar}&idfav=${idfav}" class=" text-decoration-none text-white text-start btn w-100">
                                <div class="card-body clmbg ">
                                
                                    <h4 class="card-title text-white">${provincia.nombre}</h4>
                                   
                                </div>

                            </a>
                        </c:forEach>
                        </div>
                    </div>
                </div>
                

                <div class="row m-3 justify-content-center">
                	<c:forEach items="${categorias}" var="categoria">
                    <div class="col-md-6 mb-3">
                        <a href="Controller?op=damecategoria&idcategoria=${categoria.id}&idprovincia=${idprovincia}&idlugar=${idlugar}&idfav=${idfav}">
                            <div class="card bg-dark text-white">
                            <img class="card-img" src="${categoria.imagen}" alt="Title" />
                            <div class="card-img-overlay">
                                <h4 class="card-title text-center clmbgalpha p-3">${categoria.nombre}</h4>
                               
                            </div>
                        </div>
                        </a>
                        
                    </div>
                	</c:forEach>
                    
                    
                </div>

                <hr class="w-100">

                <div class="row justify-content-center">
                	<c:forEach items="${lugares}" var="lugar">
                    <div class="col-6 col-md-4 col-xl-3 mb-3">
                        <div class="card">
                            <div class="card-body text-white bg-black">
                                <h4 class="card-title">${lugar.nombre}</h4>
                            </div>
                            <img class="card-img-bottom rounded-0" src="${lugar.imagen}" alt="Title" />
                            <div class="position-absolute end-0 bottom-0">
                            <c:choose>
							<c:when test="${lugar.fav == '1'}">
							<!--  idfav=${lugar.fav}&idlugar=${lugar.id}-->
								  <a href="Controller?op=cambiofav&idfav=${lugar.fav}&idlugar=${lugar.id}&idprovincia=${idprovincia}&idcategoria=${idcategoria}" class="text-danger">
                                    <i class="fa fa-heart fs-1 m-3 rounded-circle bg-white p-3 bg-opacity-50" aria-hidden="false"></i>
                                    
                                </a>
							</c:when>

							<c:otherwise>
								<!--  idfav=${lugar.fav}&idlugar=${lugar.id}-->
								  <a href="Controller?op=cambiofav&idfav=${lugar.fav}&idlugar=${lugar.id}&idprovincia=${idprovincia}&idcategoria=${idcategoria}" class="text-dark">
                                    <i class="fa fa-heart fs-1 m-3 rounded-circle bg-white p-3 bg-opacity-50" aria-hidden="false"></i>
                                    
                                </a>
							</c:otherwise>
						</c:choose>
                                  
                                </div>
                           
                        </div>
                        

                    </div>
                	</c:forEach>
                </div>

            </div>
        </section>
    </main>
    <footer>
        <!-- place footer here -->
         <div class="row justify-content-center m-0">
            <div class="col w-100 text-center p-3 clmbg fs-2 text-white fw-bold">
                &copy; Turismo CLM
                <i class="fa fa-instagram p-2" aria-hidden="true"></i>
                <i class="fa fa-facebook p-2" aria-hidden="true"></i>
                <i class="fa fa-twitter p-2" aria-hidden="true"></i>

            </div>
            

         </div>
    </footer>
    <div class="position-fixed top-50 start-50 translate-middle">
    	<div id="tostada" class="toast rounded-pill border-2 border-danger" role="alert" aria-live="assertive" aria-atomic="true" data-bs-delay="2000">
        		<div class="toast-body bg-light text-danger text-center rounded-pill">
            		<h5>${msg}</h5>
        		</div>
    	</div>
</div>
    
    <!-- Bootstrap JavaScript Libraries -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
        integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
        crossorigin="anonymous"></script>
        <c:if test="${msg!=null}">
        	<script type="text/javascript">
	    	const tostada = document.getElementById('tostada')
	    	const toastBootstrap = bootstrap.Toast.getOrCreateInstance(tostada)
	    	toastBootstrap.show()
        	</script>
 </c:if>
 <c:remove var="msg" scope="session" />
        
</body>

</html>