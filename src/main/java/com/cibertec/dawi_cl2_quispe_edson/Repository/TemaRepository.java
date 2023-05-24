package com.cibertec.dawi_cl2_quispe_edson.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.dawi_cl2_quispe_edson.Model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer> {

}
