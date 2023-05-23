package com.cibertec.dawi_cl2_quispe_edson.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @Column(name = "idLibro")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLibro;

    @Column(name = "titulo")
    @NotBlank
    @Size(max = 45, message = "El campo debe tener como maximo 45 caracteres")
    private String titulo;

    @Column(name = "precio")
    @NotEmpty
    private double precio;

    @Column(name = "cantEjemplares")
    @NotEmpty
    @Min(1)
    private int cantEjemplares;

    @Column(name = "origen")
    @NotBlank
    @Size(max = 45, message = "El campo debe tener como maximo 45 caracteres")
    @Pattern(regexp = "^[\\p{L}]+$")
    private String origen;

    @JoinColumn(name = "idTema")
    @Digits(integer = 4, fraction = 0)
    private int idTema;

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    @Override
    public String toString() {
        return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", precio=" + precio + ", cantEjemplares="
                + cantEjemplares + ", origen=" + origen + ", idTema=" + idTema + "]";
    }
}
