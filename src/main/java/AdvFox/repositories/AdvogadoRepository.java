package AdvFox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import AdvFox.model.Advogados;

import java.util.List;

public interface AdvogadoRepository extends JpaRepository<Advogados, Long> {

}
