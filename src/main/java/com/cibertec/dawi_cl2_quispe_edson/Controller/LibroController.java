package com.cibertec.dawi_cl2_quispe_edson.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.dawi_cl2_quispe_edson.Model.Libro;
import com.cibertec.dawi_cl2_quispe_edson.Model.Tema;
import com.cibertec.dawi_cl2_quispe_edson.Repository.LibroRepository;
import com.cibertec.dawi_cl2_quispe_edson.Repository.TemaRepository;

import jakarta.validation.Valid;

@Controller
public class LibroController {

    @Autowired
    private TemaRepository temaRepository;

    @Autowired
    private LibroRepository libroRepository;

    @GetMapping(value = "/libros")
    public String libros(Model model) {
        model.addAttribute("libros", libroRepository.findAll());

        return "app-quispe-consulta";
    }

    @GetMapping(value = "/libros/crear")
    public String saveFormLibro(Model model) {
        List<Tema> temas = temaRepository.findAll();
        Libro libro = new Libro();

        model.addAttribute("libro", libro);
        model.addAttribute("temas", temas);

        return "app-quispe-registro";
    }

    @PostMapping(value = "/libros/crear")
    public String saveLibro(@Valid @ModelAttribute(name = "libro") Libro libro,
            BindingResult result,
            RedirectAttributes redirectAttributes,
            Model model) {

        if (result.hasErrors()) {
            List<Tema> temas = temaRepository.findAll();
            model.addAttribute("temas", temas);

            return "app-quispe-registro";
        }

        libroRepository.save(libro);
        redirectAttributes.addFlashAttribute("mensaje", "libro agregado correctamente");

        return "redirect:/libros/crear";
    }
}
