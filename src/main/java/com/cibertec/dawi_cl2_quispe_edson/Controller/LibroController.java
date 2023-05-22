package com.cibertec.dawi_cl2_quispe_edson.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.dawi_cl2_quispe_edson.Interface.LibroRepository;
import com.cibertec.dawi_cl2_quispe_edson.Model.Libro;

@Controller
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    @GetMapping("/cargar")
    public String cargarPag(Model model) {
        model.addAttribute("libro", new Libro());
        return "mantenimiento";
    }

    @PostMapping("/grabar")
    public String grabarPag(@ModelAttribute Libro libro) {
        System.out.println(libro);
        libroRepository.save(libro);
        return "mantenimiento";
    }
}
