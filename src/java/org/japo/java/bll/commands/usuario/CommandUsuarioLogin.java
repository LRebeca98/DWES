package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import org.japo.java.bll.commands.Command;
import org.japo.java.entities.Usuario;
import org.japo.java.libraries.UtilesUsuarios;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public class CommandUsuarioLogin extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Salida
        String out;

        // Validar Usuario YA Identificado
        if (validarSesion(request)) {
            out = UtilesUsuarios.obtenerComandoVistaPrincipal(request);
        } else {
            // Operación
            String op = request.getParameter("op");

            // Discriminación de Operación
            if (op == null || op.equals("captura")) {
                //Lanzar Formulario
                out = "usuario/usuario-login";

            } else if (op.equals("proceso")) {
                // Entrada + BD > Usuario
                Usuario usuario = UtilesUsuarios.obtenerUsuarioRequest(config, request);

                // Validar Usuario
                if (usuario == null) {
                    out = "message/acceso-denegado";
                } else {
                    // Regenerar Sesión
                    HttpSession sesion = UtilesUsuarios.reiniciarSesion(config, request);

                    // Usuario > Sesión
                    sesion.setAttribute("usuario", usuario);

                    // Usuario + Perfil > Salida
                    out = UtilesUsuarios.obtenerComandoVistaPrincipal(request);
                }

            } else {
                out = "message/operacion-desconocida";

            }

        }

        // Redirección
        forward(out);
    }

}
