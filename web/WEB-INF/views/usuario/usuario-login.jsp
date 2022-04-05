<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App</title>
        <link rel="stylesheet" href="public/css/usuario/usuario-login.css"/>
    </head>
    <body>
        <div id="container">
            <h2>Login del Usuario</h2>

            <form action="?cmd=usuario-login&op=proceso" 
                  method="POST"
                  accept-charset="ISO-8859-1">
                <div class="fieldset">
                    <label for="user">Nombre de Usuario</label>
                    <input type="text" id="user" name="user">
                </div>
                <div class="fieldset">
                    <label for="pass">Contraseña</label>
                    <input type="text" id="pass" name="pass">
                </div>
                <div class="buttonset">
                    <input type="submit" value="Enviar">
                    <input type="reset" value="Reiniciar">

                </div>
            </form>


        </div>

    </body>
</html>
