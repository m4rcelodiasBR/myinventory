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

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

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
        material.setLocalizacao(materialDTO.getLocalizacao());
        material.setCompartimento(materialDTO.getCompartimento());
        material.setAtivo(materialDTO.getAtivo());
        materialRepository.save(material);
    }

    public Material buscarMaterialPorId(Long id) {
        return materialRepository.findById(id).get();
    }

    public void salvarMaterial(Material material) {
        Material novosDadosMaterial = materialRepository.findById(material.getId()).orElse(null);
        if (novosDadosMaterial != null) {
            novosDadosMaterial.setId(material.getId());
            novosDadosMaterial.setNumPat(material.getNumPat());
            novosDadosMaterial.setNome(material.getNome());
            novosDadosMaterial.setDescricao(material.getDescricao());
            novosDadosMaterial.setNumeroSerie(material.getNumeroSerie());
            novosDadosMaterial.setMarca(material.getNumeroSerie());
            novosDadosMaterial.setLocalizacao(material.getLocalizacao());
            novosDadosMaterial.setCompartimento(material.getCompartimento());
            novosDadosMaterial.setAtivo(material.getAtivo());
            materialRepository.save(novosDadosMaterial);
        } else {
            System.out.println("Material não existe!");
        }
    }

    public void excluirMaterial(Long id) {
        materialRepository.deleteById(id);
    }

}
