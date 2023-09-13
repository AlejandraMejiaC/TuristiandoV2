package com.example.turistiandov2.Moldes;

import java.io.Serializable;

public class MoldeRestaurantes implements Serializable {
    private String nombre;
    private Integer foto;
    private Integer foto2;
    private String telefono;
    private String rangoPrecio;
    private String platoRecomendado;
    private Float valoracion;
    private String comentario;


    public MoldeRestaurantes() {
    }

    public MoldeRestaurantes(String nombre, Integer foto, Integer foto2, String telefono, String rangoPrecio, String platoRecomendado, Float valoracion, String comentario) {
        this.nombre = nombre;
        this.foto = foto;
        this.foto2 = foto2;
        this.telefono = telefono;
        this.rangoPrecio = rangoPrecio;
        this.platoRecomendado = platoRecomendado;
        this.valoracion = valoracion;
        this.comentario = comentario;
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

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
    }

    public Float getValoracion() {
        return valoracion;
    }

    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
