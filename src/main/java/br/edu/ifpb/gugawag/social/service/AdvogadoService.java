package br.edu.ifpb.gugawag.social.service;

import br.edu.ifpb.gugawag.social.repositories.AdvogadoRepository;
import br.edu.ifpb.gugawag.social.model.Advogados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdvogadoService {

    @Autowired
    private AdvogadoRepository advogadoRepository;

    public List<Advogados> getAdvogados() {
        return this.advogadoRepository.findAll();
    }

    public Advogados getAdvogadoPorId(Long idAdvogado) {
        return this.advogadoRepository.findById(idAdvogado).orElse(null);
    }

    @Transactional
    public Advogados inserirOuAtualizar(Advogados advogados) {
    	Advogados advogadoInserido = this.advogadoRepository.save(advogados);
        return advogadoInserido;
    }

    public void apagar(Long id) {
        this.advogadoRepository.deleteById(id);
    }
}
