package com.cibertec.dawi_cl2_quispe_edson.Interface;

import java.util.List;

import com.cibertec.dawi_cl2_quispe_edson.Model.Tema;

public interface TemaInterfaz {
    List<Tema> getAll();

    Tema findById(Integer id);
}
