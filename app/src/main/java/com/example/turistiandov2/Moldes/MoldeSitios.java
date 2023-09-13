package com.example.turistiandov2.Moldes;

import java.io.Serializable;

public class MoldeSitios implements Serializable {

    private String nombre;
    private String nombreGuia;
    private String telefono;
    private String precio;
    private Integer foto;
    private Integer foto2;
    private Float valoracion;

    private String descripcion;
    private String comentario;


    public MoldeSitios() {
    }

    public MoldeSitios(String nombre, String nombreGuia, String telefono, String precio, Integer foto, Integer foto2, Float valoracion, String descripcion, String comentario) {
        this.nombre = nombre;
        this.nombreGuia = nombreGuia;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.foto2 = foto2;
        this.valoracion = valoracion;
        this.descripcion = descripcion;
        this.comentario = comentario;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
