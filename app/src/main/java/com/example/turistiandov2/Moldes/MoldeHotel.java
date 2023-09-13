package com.example.turistiandov2.Moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {
    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private Integer foto2;
    private String descripcion;
    private Float Valoracion;
    private String comentario;


    public MoldeHotel() {
    }

    public MoldeHotel(String nombre, String precio, String telefono, Integer foto, Integer foto2, String descripcion, Float valoracion, String comentario) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.foto2 = foto2;
        this.descripcion = descripcion;
        Valoracion = valoracion;
        this.comentario = comentario;
    }

    // constructor lleno

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
    }

    public Float getValoracion() {
        return Valoracion;
    }

    public void setValoracion(Float valoracion) {
        Valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

