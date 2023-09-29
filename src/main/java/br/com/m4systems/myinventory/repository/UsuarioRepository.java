package br.com.m4systems.myinventory.repository;

import br.com.m4systems.myinventory.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
