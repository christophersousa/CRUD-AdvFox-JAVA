package AdvFox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import AdvFox.model.Usuarios;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {

}
