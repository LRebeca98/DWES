package org.japo.java.bll.commands.visita;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public class CommandVisitaLanding extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Salida
        String out = "visita/visita-landing";

        // Redirección
        forward(out);
    }

}
