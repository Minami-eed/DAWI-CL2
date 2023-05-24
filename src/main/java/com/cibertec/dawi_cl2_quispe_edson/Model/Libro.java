package com.cibertec.dawi_cl2_quispe_edson.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlibro")
    private int idlibro;

    @Pattern(regexp = "^[a-zA-Z]{1,45}$", message = "Este campo solo debe contener letras y un máximo de 45 caracteres")
    @Column(name = "titulo")
    private String titulo;

    @Pattern(regexp = "^\\d+(?:\\.\\d(1,2))?$", message = "este campo solo debe contener 1 o 2 dígitos después del punto decimal")
    @Column(name = "precio")
    private String precio;

    @Pattern(regexp = "[0-9]+", message = "Este campo solo debe contener números positivos")
    @Column(name = "cantejemplares")
    private String cantejemplares;

    @Pattern(regexp = "^[a-zA-Z]{1,45}$", message = "Este campo solo debe contener letras y un máximo de 45 caracteres")
    @Column(name = "origen")
    private String origen;

    @ManyToOne
    @JoinColumn(name = "idtema")
    @NotNull(message = "Debes seleccionar un tema")
    private Tema tema;

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantejemplares() {
        return cantejemplares;
    }

    public void setCantejemplares(String cantejemplares) {
        this.cantejemplares = cantejemplares;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Libro [idlibro=" + idlibro + ", titulo=" + titulo + ", precio=" + precio + ", cantejemplares="
                + cantejemplares + ", origen=" + origen + ", tema=" + tema + "]";
    }
}
