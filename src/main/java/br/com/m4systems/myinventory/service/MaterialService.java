package br.com.m4systems.myinventory.service;

import br.com.m4systems.myinventory.dto.MaterialDTO;
import br.com.m4systems.myinventory.entity.MaterialEntity;
import br.com.m4systems.myinventory.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    protected MaterialRepository materialRepository;

    public List<MaterialEntity> listarMaterial() {
        return materialRepository.findAll();
    }

    public void criarMaterial(MaterialDTO materialDTO) {
        MaterialEntity materialEntity = new MaterialEntity(
                materialDTO.getNumPat(),
                materialDTO.getNome(),
                materialDTO.getDescricao(),
                materialDTO.getNumeroSerie(),
                materialDTO.getMarca(),
                materialDTO.getLocal(),
                materialDTO.getIncumbencia(),
                materialDTO.isAtivo()
                );
        materialRepository.save(materialEntity);
    }
}
