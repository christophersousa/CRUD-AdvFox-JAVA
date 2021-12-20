package br.edu.ifpb.gugawag.social.controller;

import br.edu.ifpb.gugawag.social.model.Advogados;
import br.edu.ifpb.gugawag.social.service.AdvogadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class AdvogadoController {

    @Autowired
    private AdvogadoService advogadosService;

    @GetMapping("/advogados")
    public List<Advogados> getUsuarios() {
        return this.advogadosService.getAdvogados();
    }

    @GetMapping("/advogados/{id}")
    public Advogados getUsuarioPorId(@PathVariable("id") Long idAdvogado) {
        return this.advogadosService.getAdvogadoPorId(idAdvogado);
    }

    @PostMapping("/advogados")
    public Advogados inserirUsuario(@RequestBody Advogados advogado){
        return this.advogadosService.inserirOuAtualizar(advogado);
    }

    @PutMapping("/advogados/{id}")
    public Advogados atualizarUsuario(@RequestBody Advogados advogados){
        return this.advogadosService.inserirOuAtualizar(advogados);
    }

    @DeleteMapping("/advogados/{id}")
    public void apagarAdvogado(@PathVariable("id") Long id) {
        this.advogadosService.apagar(id);
    }
}
