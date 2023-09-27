package br.com.m4systems.myinventory.controller;

import br.com.m4systems.myinventory.dto.MaterialDTO;
import br.com.m4systems.myinventory.entity.Material;
import br.com.m4systems.myinventory.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    @GetMapping("/listar")
    public String listarMaterial(Model model) {
        List<Material> materiais = materialService.listarMaterial();
        model.addAttribute("materiais", materiais);
        return "lista-materiais"; //Nome do template HTML para listar material
    }

    @PostMapping("/novo")
    public String criarMaterial(@ModelAttribute("materialDTO") @Validated MaterialDTO materialDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "form-material"; // Nome do template HTML do formulário de criação
        }
        materialService.criarMaterial(materialDTO);
        return "redirect:/materiais"; // Redireciona para a lista de materiais após a criação
    }

}
