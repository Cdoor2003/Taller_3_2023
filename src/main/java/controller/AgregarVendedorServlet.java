package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Vendedor;
import model.data.DBConnector;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "AgregarVendedorServlet",value = "/agregarVendedor")
public class AgregarVendedorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("nombre").length()==0 || req.getParameter("rut").length()==0 || req.getParameter("direccion").length()==0 || req.getParameter("tituloProfesional").length()==0 || req.getParameter("estadoCivil").length()==0){
            req.setAttribute("textoRespuesta","Hay campos vacios, favor probar nuevamente");
            RequestDispatcher respuesta = req.getRequestDispatcher("/agregarVendedorErroneo.jsp");
            respuesta.forward(req,resp);
        }
        else {
            String rutExtraido = null;
            try {
                Connection connection = DBConnector.connection("tiendainmueble","root","");
                PreparedStatement preparedStatement = connection.prepareStatement("select * from vendedor where rut = ?");
                preparedStatement.setString(1,req.getParameter("rut"));
                ResultSet set1 = preparedStatement.executeQuery();

                while (set1.next()){
                    rutExtraido = set1.getString(1);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            if(rutExtraido == null){
                String nombre = req.getParameter("nombre");
                String rut = req.getParameter("rut");
                String dirrecion = req.getParameter("direccion");
                String tituloProfesional = req.getParameter("tituloProfesional");
                String estadoCivil = req.getParameter("estadoCivil");
                Vendedor vendedor = new Vendedor(nombre,rut,dirrecion,tituloProfesional,estadoCivil);
                vendedor.agregarVendedor();
                req.setAttribute("nombreVendedor",nombre);
                RequestDispatcher respuesta = req.getRequestDispatcher("/vendedorExito.jsp");
                respuesta.forward(req,resp);
            }else{
                req.setAttribute("textoRespuesta","El rut ya ha sido ingresado previamente");
                RequestDispatcher respuesta = req.getRequestDispatcher("/agregarVendedorErroneo.jsp");
                respuesta.forward(req,resp);
            }
        }
    }
}
