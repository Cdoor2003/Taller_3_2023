package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Inmueble;

import java.io.IOException;

@WebServlet(name = "AgregarInmuebleServlet",value = "/agregarinmueble")
public class AgregarInmuebleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("tipoConstruccion").length()==0 || req.getParameter("ubicacion").length()==0 || req.getParameter("precio").length()==0){
            req.setAttribute("textoRespuesta","Hay campos vacios, favor comprobar nuevamente");
            RequestDispatcher respuesta = req.getRequestDispatcher("/agregarInmuebleErroneo.jsp");
            respuesta.forward(req,resp);
        }
        else{
            String tipoConstruccion = req.getParameter("tipoConstruccion");
            String ubicacion = req.getParameter("ubicacion");
            int precio = Integer.parseInt(req.getParameter("precio"));
            Inmueble inmueble = new Inmueble(tipoConstruccion,ubicacion,precio);
            inmueble.agregarInmueble();
            RequestDispatcher respuesta = req.getRequestDispatcher("/inmuebleExito.jsp");
            respuesta.forward(req,resp);
        }
    }
}
