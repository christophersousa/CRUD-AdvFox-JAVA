package br.edu.ifpb.gugawag.social.repositories;

import br.edu.ifpb.gugawag.social.model.Advogados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvogadoRepository extends JpaRepository<Advogados, Long> {

}
