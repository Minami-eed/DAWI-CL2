package com.cibertec.dawi_cl2_quispe_edson.Interface;

import java.util.List;

import com.cibertec.dawi_cl2_quispe_edson.Model.Libro;

public interface LibroInterfaz {
    void save(Libro libro);

    List<Libro> getAll();
}
