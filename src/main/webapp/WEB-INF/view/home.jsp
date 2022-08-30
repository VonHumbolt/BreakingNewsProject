<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Landing Page - Start Bootstrap Theme</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet" />
    </head>
    <body>
        <!-- Navigation-->
        <nav class="navbar navbar-light bg-light static-top">
            <div class="container">
                <a class="navbar-brand" href="/api/v1/news/">Breaking News</a>
            </div>
        </nav>

        <section class="features-icons bg-light text-center">
            <div class="container">
                <h1 class="text-uppercase mb-4" style="font-size: 70px;">Breaking News App</h1>
                <div class="row justify-content-center align-items-center">
                    <div class="col-sm-8 ">
<%--                        <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">--%>
                            <h3>Search News</h3>
                            <p class="lead mb-3">Filter news by title, subtitle or content!</p>
                            <form:form action="/api/v1/news/search" method="post" modelAttribute="searchNewDto">
                                <div class="input-group mb-3">
                                    <form:input path="filterText" cssClass="form-control" placeholder="New's title, subtitle, content"
                                                aria-label="Recipient's username" aria-describedby="button-addon2" />
                                    <input class="btn btn-primary" type="submit" id="button-addon2" value="Search" />
                                </div>

                            </form:form>
<%--                        </div>--%>
                    </div>

                </div>
            </div>
        </section>
        <!-- Image Showcases-->
        <section class="showcase ">
            <div class="container-fluid p-0">

                <c:if test="${searchResultSize != null}">
                    <h5 class="text-center my-5">${searchResultSize} News Found <i class="bi bi-search"></i> </h5>
                </c:if>

                <c:if test="${name != null}">
                    <h5 class="text-center my-5">${name}'s News </h5>
                </c:if>


                <c:set var="number" value="1"/>
                <c:forEach items="${allNews}" var="item">
                    <c:choose>
                        <c:when test="${number % 2 != 0}">
                            <div class="row g-0">
                                <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('${item.imageUrl}')"></div>
                                <div class="col-lg-6 order-lg-1 my-auto showcase-text">
                                    <h2>${item.title}</h2>
                                    <h4>${item.subtitle}</h4>
                                    <div class="text ellipsis">
                                        <p class="lead mb-0 text-concat">${item.content}</p>
                                    </div>
                                    <a class="lead text-end text-decoration-none" href="/api/v1/news/${item.newsId}">Read More <i class="bi bi-chevron-right"></i></a>
                                </div>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="row g-0">
                                <div class="col-lg-6 text-white showcase-img" style="background-image: url('${item.imageUrl}')"></div>
                                <div class="col-lg-6 my-auto showcase-text">
                                    <h2>${item.title}</h2>
                                    <h4>${item.subtitle}</h4>
                                    <div class="text ellipsis">
                                        <p class="lead mb-0 text-concat">${item.content}</p>
                                    </div>
                                    <a class="lead text-end text-decoration-none" href="/api/v1/news/${item.newsId}">Read More <i class="bi bi-chevron-right"></i></a>
                                </div>
                            </div>
                        </c:otherwise>
                    </c:choose>

                    <c:set var="number" value="${number + 1}"/>

                </c:forEach>


            </div>
        </section>
        <!-- Testimonials-->
        <section class="testimonials text-center bg-light">
            <div class="container">
                <h2 class="mb-5">Most Popular Authors...</h2>
                <div class="row">
                    <div class="col-lg-4" onclick="location.href='/api/v1/news/getByAuthorId/1'" style="cursor:pointer;">
                        <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                            <h1><i class="bi bi-vector-pen"></i></h1>
                            <h5>Kanav Javin</h5>
                            <p class="font-weight-light mb-0">Breaking.com</p>
                        </div>
                    </div>
                    <div class="col-lg-4" onclick="location.href='/api/v1/news/getByAuthorId/4'" style="cursor:pointer;">
                        <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                            <h1><i class="bi bi-vector-pen"></i></h1>
                            <h5>Delma Wilson</h5>
                            <p class="font-weight-light mb-0">Coinpedia - Fintech & Cryptocurreny News Media</p>
                        </div>
                    </div>
                    <div class="col-lg-4" onclick="location.href='/api/v1/news/getByAuthorId/6'" style="cursor:pointer;">
                        <div class="testimonial-item mx-auto mb-5 mb-lg-0">
                            <h1><i class="bi bi-vector-pen"></i></h1>
                            <h5>Kevin Nicholson</h5>
                            <p class="font-weight-light mb-0">AMBCrypto</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Footer-->
        <footer class="footer call-to-action">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 h-100 text-center text-lg-start my-auto">
                        <ul class="list-inline mb-2">
                            <li class="list-inline-item"><a href="#!">About</a></li>
                            <li class="list-inline-item"> . </li>
                            <li class="list-inline-item"><a href="#!">Contact</a></li>
                            <li class="list-inline-item"> . </li>
                            <li class="list-inline-item"><a href="#!">Terms of Use</a></li>
                            <li class="list-inline-item"> . </li>
                            <li class="list-inline-item"><a href="#!">Privacy Policy</a></li>
                        </ul>
                        <p class="text-muted small mb-4 mb-lg-0">&copy; Breaking News 2022. All Rights Reserved.</p>
                    </div>
                    <div class="col-lg-6 h-100 text-center text-lg-end my-auto">
                        <ul class="list-inline mb-0">
                            <li class="list-inline-item me-4">
                                <a href="https://github.com/VonHumbolt/BreakingNewsProject"><i class="bi bi-github fs-3"></i></a>
                            </li>
                            <li class="list-inline-item me-4">
                                <a href="#!"><i class="bi-twitter fs-3"></i></a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#!"><i class="bi-instagram fs-3"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>


        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <!-- * *                               SB Forms JS                               * *-->
        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
        <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
    </body>
</html>
