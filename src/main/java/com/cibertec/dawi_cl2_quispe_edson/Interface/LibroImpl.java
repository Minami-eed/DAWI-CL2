package com.cibertec.dawi_cl2_quispe_edson.Interface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.dawi_cl2_quispe_edson.Model.Libro;
import com.cibertec.dawi_cl2_quispe_edson.Repository.LibroRepository;

@Service
public class LibroImpl implements LibroInterfaz {

    @Autowired
    LibroRepository libroRepository;

    @Override
    public void save(Libro libro) {
        libroRepository.save(libro);
    }

    @Override
    public List<Libro> getAll() {
        return libroRepository.findAll();
    }

}
