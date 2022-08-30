<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kaank
  Date: 29.08.2022
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News Detail</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet" />
</head>
<body>

    <nav class="navbar navbar-light bg-light static-top">
        <div class="container">
            <a class="navbar-brand" href="/api/v1/news/">Breaking News</a>
        </div>
    </nav>

    <header class="masthead" >
        <div class="container position-relative">
            <div class="row justify-content-between">
                <div class="col-sm-12 col-md-6">
                    <div class="text-center text-white">
                        <!-- Page heading-->
                        <h1 class="text-white mb-4" style="font-size: 50px;">${newDto.title}</h1>
                        <hr>
                        <h2 class="mb-2">${newDto.subtitle}</h2>
                        <a href="/api/v1/news/getByAuthorId/${newDto.authorId}" class="lead text-white text-decoration-none my-1"> <i> ${newDto.authorName} </i></a>
                        <br>
                        <a href="/api/v1/news/getBySourceId/${newDto.sourceId}" class="lead text-white text-decoration-none my-1"> <i> ${newDto.sourceName} </i> </a>
                        <p class="lead mt-1"><i> Published At: ${newDto.publishedDate} </i></p>
                    </div>
                </div>
                <div class="col-sm-12 col-md-6 text-center text-white">
                    <img class="img-fluid my-2" src="${newDto.imageUrl}" />
                </div>
            </div>
        </div>
    </header>

    <section class=" mt-4 pt-5">
        <div class="container">
            <div class="row justify-content-center align-items-center">
                <div class="col-sm-8 text-start">
                    <h1 class="mb-4">${newDto.title}</h1>
                    <h2 class="mb-3">${newDto.title}</h2>
                    <p class="lead mb-3">${newDto.content}</p>

                </div>

            </div>
        </div>
    </section>








    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="js/scripts.js"></script>
</body>
</html>
