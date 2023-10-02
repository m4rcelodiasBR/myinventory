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
        Material materialEntity = new Material(
                materialDTO.getNumPat(),
                materialDTO.getNome(),
                materialDTO.getDescricao(),
                materialDTO.getNumeroSerie(),
                materialDTO.getMarca(),
                materialDTO.getLocal(),
                materialDTO.getCompartimento(),
                materialDTO.getAtivo()
                );
        materialRepository.save(materialEntity);
    }
}
