package model;

public class Inmueble {
    private String tipoConstruccion;
    private String ubicacionGeografica;
    private int precio;

    public Inmueble(String tipoConstruccion, String ubicacionGeografica, int precio) {
        this.tipoConstruccion = tipoConstruccion;
        this.ubicacionGeografica = ubicacionGeografica;
        this.precio = precio;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
