<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
<head>
    <meta charset="UTF-8">
    <title>404 - Page Not Found</title>
    

    <!-- CSS 불러오기 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

    <!-- 페이지 내 스타일 -->
   <style>
    html, body {
        height: 100%;
        margin: 0;
    }

    body {
        display: flex;
        justify-content: center; /* 가로 중앙 */
        align-items: center;     /* 세로 중앙 */
    }

   .page-404 {
            display: flex;
            justify-content: center; /* 가로 중앙 */
            align-items: center;     /* 세로 중앙 */
            height: 100%;
            text-align: center;      /* 내부 텍스트 중앙 */
            flex-direction: column;  /* 세로 방향 정렬 */
        }
</style>

</head>
<body id="body">
    <section class="page-404">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <a href="/">
                        <img src="${pageContext.request.contextPath}/images/logo.png" alt="site logo" />
                    </a>
                    <h1>404</h1>
                    <h2>Page Not Found</h2>
                    <a href="/" class="btn btn-main">
                        <i class="tf-ion-android-arrow-back"></i> Go Home
                    </a>
                    <p class="copyright mt-5 mb-0">
                        Copyright <script>document.write(new Date().getFullYear())</script>
                        &copy; Designed & Developed by 
                        <a href="http://www.themefisher.com">Themefisher</a>. All rights reserved.
                        <br> Get More 
                        <a href="https://themefisher.com/free-bootstrap-templates/">Free Bootstrap Templates</a>
                    </p>
                </div>
            </div>
        </div>
    </section>
</body>
</html>
