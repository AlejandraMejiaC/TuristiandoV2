package com.example.turistiandov2.Moldes;

public class MoldeRestaurantes {
    private String nombre;
    private Integer foto;
    private String telefono;
    private String rangoPrecio;
    private String platoRecomendado;

    public MoldeRestaurantes() {
    }

    public MoldeRestaurantes(String nombre, Integer foto, String telefono, String rangoPrecio, String platoRecomendado) {
        this.nombre = nombre;
        this.foto = foto;
        this.telefono = telefono;
        this.rangoPrecio = rangoPrecio;
        this.platoRecomendado = platoRecomendado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoPrecio() {
        return rangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        this.rangoPrecio = rangoPrecio;
    }

    public String getPlatoRecomendado() {
        return platoRecomendado;
    }

    public void setPlatoRecomendado(String platoRecomendado) {
        this.platoRecomendado = platoRecomendado;
    }
}
