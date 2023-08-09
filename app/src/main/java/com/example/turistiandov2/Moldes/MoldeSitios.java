package com.example.turistiandov2.Moldes;

public class MoldeSitios {

    private String nombre;
    private String nombreGuia;
    private String telefono;
    private String precio;
    private Integer foto;

    public MoldeSitios() {
    }

    public MoldeSitios(String nombre, String nombreGuia, String telefono, String precio, Integer foto) {
        this.nombre = nombre;
        this.nombreGuia = nombreGuia;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreGuia() {
        return nombreGuia;
    }

    public void setNombreGuia(String nombreGuia) {
        this.nombreGuia = nombreGuia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
