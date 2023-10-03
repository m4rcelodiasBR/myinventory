package br.com.m4systems.myinventory.controller;

import br.com.m4systems.myinventory.dto.MaterialDTO;
import br.com.m4systems.myinventory.entity.Material;
import br.com.m4systems.myinventory.service.MaterialService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("listar")
    public ModelAndView listarMaterial() {
        List<Material> materiais = materialService.listarMaterial();
        ModelAndView mv = new ModelAndView("listaMaterial");
        mv.addObject("materiais", materiais);
        return mv;
    }

    @GetMapping("novo")
    public ModelAndView novoMaterial() {
        ModelAndView mv = new ModelAndView("novoMaterialForm");
        mv.addObject("materialDTO", new MaterialDTO());
        return mv;
    }

    @PostMapping("novo")
    public ModelAndView criarMaterial(@ModelAttribute("materialDTO") MaterialDTO materialDTO, @NotNull BindingResult result) {
        ModelAndView mv = new ModelAndView();
        if (result.hasErrors()) {
            mv.setViewName("novoMaterialForm");
        } else {
            materialService.criarMaterial(materialDTO);
            mv.setViewName("redirect:/material/listar");
        }
        return mv;
    }
}
