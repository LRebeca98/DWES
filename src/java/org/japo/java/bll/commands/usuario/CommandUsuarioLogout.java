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
public class CommandUsuarioLogout extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Salida
        String out = "controller?cmd=usuario-login";

        // Validar Usuario YA Identificado
        if (validarSesion(request)) {
            // Cierre artefactos externos 
            // ---
            
            // Request > Sesion
            HttpSession sesion = request.getSession(false);
            
            // Cerrar Sesion Acual
            sesion.invalidate();
//            out = UtilesUsuarios.obtenerComandoVistaPrincipal(request);    quitar esta linea  
        }

        // Redirección
        forward(out);
    }

}
