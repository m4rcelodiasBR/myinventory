package br.com.m4systems.myinventory.repository;

import br.com.m4systems.myinventory.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {

}
