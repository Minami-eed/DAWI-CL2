package com.cibertec.dawi_cl2_quispe_edson.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.dawi_cl2_quispe_edson.Interface.LibroInterfaz;
import com.cibertec.dawi_cl2_quispe_edson.Interface.TemaInterfaz;
import com.cibertec.dawi_cl2_quispe_edson.Model.Libro;
import com.cibertec.dawi_cl2_quispe_edson.Model.Tema;

@Controller
public class LibroController {

    @Autowired
    LibroInterfaz libroInterfaz;

    @Autowired
    TemaInterfaz temaInterfaz;

    @GetMapping(value = "/libros")
    public String libros(Model model, Integer idTema) {
        List<Libro> libros = libroInterfaz.getAll();
        List<Tema> temas = temaInterfaz.getAll();

        model.addAttribute("libros", libros);
        model.addAttribute("temas", temas);

        return "mantenimiento";
    }

    @PostMapping("/libros")
    public String librosByTemas(Model model, Integer idTema) {
        Tema temas = temaInterfaz.findById(idTema);
        List<Libro> libros = null;

        if (temas == null) {
            libros = libroInterfaz.getAll();
        } else {
            libros = temas.getLibros();
        }

        List<Tema> tema = temaInterfaz.getAll();

        model.addAttribute("temas", temas);
        model.addAttribute("libros", libros);
        return "mantenimiento";
    }

    @GetMapping(value = "/libro/crear")
    public String saveFormLibro(Model model) {
        List<Tema> temas = temaInterfaz.getAll();
        Libro libro = new Libro();


}
