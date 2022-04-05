package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public class CommandUsuarioLogin extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Salida
        String out = "usuario/usuario-login";

        // Operación
        String op = request.getParameter("op");

        // Discriminación de Operación
        if (op == null) {
            //Lanzar Formulario
        } else if (op.equals("captura")) {
            //Lanzar Formulario
        } else if (op.equals("proceso")){
            // Procesar Formulario                                 
        } else {
            //Lanzar formulario
        }

                // Redirección
                forward(out);
            }

        }
