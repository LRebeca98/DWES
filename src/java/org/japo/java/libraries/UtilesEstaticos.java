/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rebeca Del Amo Cano - rebeca.delamo.alum@iescamp.es
 */
public final class UtilesEstaticos {

    private UtilesEstaticos() {
    }

    public static void procesarEstatico(
            HttpServletRequest request,
            HttpServletResponse response) {
        File fichero = localizarRecurso(request);

        servirRecurso(fichero, response);
    }

    private static File localizarRecurso(HttpServletRequest request) {
       String base = "/WEB-INF/static";
       
       String ruta = request.getPathTranslated().replace("\\", "/");
       
       String peticion = request.getPathInfo();
       
       String servicio = base + peticion;
       
       ruta = ruta.replace(peticion, servicio);
       
       return new File(ruta);
    }

    private static void servirRecurso(File fichero, HttpServletResponse response) {
       byte[] buffer = new byte[(int) fichero.length()];
       
       
    }
}
