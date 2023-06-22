package model.data.dao;

import model.Inmueble;
import model.Vendedor;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

public class InmuebleDAO {
    public boolean agregarInmueble(DSLContext query, Inmueble inmueble){
        String tipoConstruccion = inmueble.getTipoConstruccion();
        String ubicacion = inmueble.getUbicacionGeografica();
        int precio = inmueble.getPrecio();
        int result = query.insertInto(DSL.table("vendedor"),
                DSL.field("tipoConstruccion"),DSL.field("ubicacion"),DSL.field("precio")).values(
                tipoConstruccion,ubicacion,precio
        ).execute();
        return result==1;
    }
}
