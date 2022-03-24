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

            <main>
                <h2>Login del Usuario</h2>

                <form action="" 
                      method="post" accept-charset="Windows-1252">
                    <div class="fieldset">
                        <label for="user">Usuario</label>
                        <input
                            id="user"
                            type="text"
                            name="user"
                            required
                            pattern="\w{3,20}"
                            autocomplete="username"
                            minlength="1"
                            maxlength="20"
                            />
                        <label for="user">👤</label>
                        <div class="feedback user">Nombre de usuario incorrecto</div>
                    </div>
                    <div class="fieldset">
                        <label for="pass">Contraseña</label>
                        <input
                            id="pass"
                            type="password"
                            name="pass"
                            required
                            pattern="\w{3,20}"
                            autocomplete="current-password"
                            />
                        <label for="pass">🔑</label>
                        <div class="feedback pass">Contraseña de usuario incorrecta</div>
                    </div>
                    <div class="buttonset">
                        <button type="submit">Acceder</button> 
                        <button type="reset">Reiniciar</button>
                    </div>
                </form>
            </main>

        </div>
       
    </body>
</html>
