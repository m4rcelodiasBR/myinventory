package br.com.m4systems.myinventory.service;

import br.com.m4systems.myinventory.dto.MaterialDTO;
import br.com.m4systems.myinventory.entity.Material;
import br.com.m4systems.myinventory.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    protected MaterialRepository materialRepository;

    public List<Material> listarMaterial() {
        return materialRepository.findAll();
    }

    public void criarMaterial(MaterialDTO materialDTO) {
        Material material = new Material();
                material.setNumPat(materialDTO.getNumPat());
                material.setNome(materialDTO.getNome());
                material.setDescricao(materialDTO.getDescricao());
                material.setNumeroSerie(materialDTO.getNumeroSerie());
                material.setMarca(materialDTO.getNumeroSerie());
                material.setLocal(materialDTO.getLocal());
                material.setCompartimento(material.getCompartimento());
                material.setAtivo(material.getAtivo());
        materialRepository.save(material);
    }
}
