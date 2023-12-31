package model;

import model.data.DBConnector;
import model.data.dao.VendedorDAO;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import java.sql.Connection;

public class Vendedor {
    private String nombre;
    private String rut;
    private String direccion;
    private String tituloProfesional;
    private String estadoCivil;

    public Vendedor(String nombre, String rut, String direccion, String tituloProfesional, String estadoCivil) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.tituloProfesional = tituloProfesional;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public boolean agregarVendedor(){
        Connection connection = DBConnector.connection("tiendainmueble","root","");
        DSLContext query = DSL.using(connection);
        return new VendedorDAO().agregarVendedor(query,this);
    }
}
