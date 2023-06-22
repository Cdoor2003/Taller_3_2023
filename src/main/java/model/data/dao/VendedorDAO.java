package model.data.dao;

import model.Vendedor;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

public class VendedorDAO {
    public boolean agregarVendedor(DSLContext query, Vendedor vendedor){
        String nombre = vendedor.getNombre();
        String rut = vendedor.getRut();
        String dirrecion = vendedor.getDireccion();
        String tituloProfesional = vendedor.getTituloProfesional();
        String estadoCivil = vendedor.getEstadoCivil();
        int result = query.insertInto(DSL.table("vendedor"),
                DSL.field("nombre"),DSL.field("rut"),DSL.field("direccion"),DSL.field("tituloProfesional"),DSL.field("estadoCivil")).values(
                nombre,rut,dirrecion,tituloProfesional,estadoCivil
        ).execute();
        return result==1;
    }
}
