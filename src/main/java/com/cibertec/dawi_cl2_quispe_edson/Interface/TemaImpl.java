package com.cibertec.dawi_cl2_quispe_edson.Interface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.dawi_cl2_quispe_edson.Model.Tema;
import com.cibertec.dawi_cl2_quispe_edson.Repository.TemaRepository;

@Service
public class TemaImpl implements TemaInterfaz {

    @Autowired
    TemaRepository temaRepository;

    @Override
    public List<Tema> getAll() {
        return temaRepository.findAll();
    }

    @Override
    public Tema findById(Integer id) {
        Optional<Tema> temas = temaRepository.findById(id);
        if (temas.isEmpty()) {
            return null;
        }
        return temas.get();
    }
}
