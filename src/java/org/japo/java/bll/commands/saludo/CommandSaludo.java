package org.japo.java.bll.commands.saludo;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public class CommandSaludo extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Salida
        String out = "saludo/saludo";

        // Redirección
        forward(out);
    }

}
