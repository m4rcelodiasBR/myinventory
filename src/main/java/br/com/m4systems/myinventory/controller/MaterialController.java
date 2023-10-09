package br.com.m4systems.myinventory.controller;

import br.com.m4systems.myinventory.dto.MaterialDTO;
import br.com.m4systems.myinventory.entity.Material;
import br.com.m4systems.myinventory.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("listar")
    public ModelAndView listarMaterial() {
        List<Material> materiais = materialService.listarMaterial();
        ModelAndView mv = new ModelAndView("/material/listaMaterial");
        mv.addObject("materiais", materiais);
        return mv;
    }

    @GetMapping("novo")
    public ModelAndView novoMaterial() {
        ModelAndView mv = new ModelAndView("/material/novoMaterialForm");
        mv.addObject("materialDTO", new MaterialDTO());
        return mv;
    }

    @PostMapping("novo")
    public ModelAndView criarMaterial(@ModelAttribute("materialDTO") MaterialDTO materialDTO, BindingResult result) {
        ModelAndView mv = new ModelAndView();
        if (result.hasErrors()) {
            mv.setViewName("/material/novoMaterialForm");
        } else {
            materialService.criarMaterial(materialDTO);
            mv.setViewName("redirect:/material/listar");
        }
        return mv;
    }

    @GetMapping("editar")
    public ModelAndView editarMaterial(@RequestParam(value = "id", required = false) Long id) {
        Material material = materialService.buscarMaterialPorId(id);
        MaterialDTO materialDTO = new MaterialDTO(material);
        ModelAndView mv = new ModelAndView("/material/editarMaterialForm");
        mv.addObject("materialDTO", materialDTO);
        return mv;
    }

    @PostMapping("editar")
    public ModelAndView editarMaterial(@ModelAttribute("materialDTO") MaterialDTO materialDTO, BindingResult result) {
        ModelAndView mv = new ModelAndView();
        if (result.hasErrors()) {
            mv.setViewName("/material/editarMaterialForm");
        } else {
            Material material = new Material(materialDTO);
            materialService.salvarMaterial(material);
            mv.setViewName("redirect:/material/listar");
        }
        return mv;
    }

    @GetMapping("excluir")
    public ModelAndView excluirMaterial(@RequestParam(value = "id", required = false) Long id) {
        if (id != null) {
            Material material = materialService.buscarMaterialPorId(id);
            materialService.excluirMaterial(material.getId());
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/material/listar");
        return mv;
    }
}
