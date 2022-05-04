<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App</title>
        <link rel="stylesheet" href="public/css/visita/visita-landing.css"/>
        <link rel="stylesheet" href="public/css/partials/header.css" />
        <link rel="stylesheet" href="public/css/partials/footer.css" />
    </head>
    <body>
 
        <div id="container">
        <%@include file="../partials/header.jspf" %>   
            <main>
                <h1>Aplicación Excelente</h1>
<!--                <img src="public/img/descarga.jpg" alt="Logo"/>-->

                <a href="?cmd=usuario-login">Ideltificación</a>  
            </main>
        <%@include file="../partials/footer.jspf" %>
        </div>
       
    </body>
</html>
