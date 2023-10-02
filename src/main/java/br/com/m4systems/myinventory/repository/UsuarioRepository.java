package br.com.m4systems.myinventory.repository;

import br.com.m4systems.myinventory.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
