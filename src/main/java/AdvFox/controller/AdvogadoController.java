package AdvFox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AdvFox.model.Advogados;
import AdvFox.model.Usuarios;
import AdvFox.service.AdvogadoService;
import AdvFox.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/")
public class AdvogadoController {

    @Autowired
    private AdvogadoService advogadosService;
    
    @Autowired
    private UsuarioService usuariosService;

    @GetMapping("/advogados")
    public List<Advogados> getAdvogados() {
        return this.advogadosService.getAdvogados();
    }
    
    @GetMapping("/usuarios")
    public List<Usuarios> getUsuarios() {
        return this.usuariosService.getUsuarios();
    }

    @GetMapping("/advogados/{id}")
    public Advogados getAdvogadoPorId(@PathVariable("id") Long idAdvogado) {
        return this.advogadosService.getAdvogadoPorId(idAdvogado);
    }
    
    @GetMapping("/usuarios/{id}")
    public Usuarios getUsuarioPorId(@PathVariable("id") Long idUsuario) {
        return this.usuariosService.getUsuarioPorId(idUsuario);
    }

    @PostMapping("/advogados")
    public Advogados inserirAdvogado(@RequestBody Advogados advogado){
        return this.advogadosService.inserirOuAtualizar(advogado);
    }
    
    @PostMapping("/usuarios")
    public Usuarios inserirUsuario(@RequestBody Usuarios usuario){
        return this.usuariosService.inserirOuAtualizar(usuario);
    }

    @PutMapping("/advogados/{id}")
    public Advogados atualizarAdvogado(@RequestBody Advogados advogados){
        return this.advogadosService.inserirOuAtualizar(advogados);
    }
    
    @PutMapping("/usuarios/{id}")
    public Usuarios atualizarUsuario(@RequestBody Usuarios usuarios){
        return this.usuariosService.inserirOuAtualizar(usuarios);
    }

    @DeleteMapping("/advogados/{id}")
    public void apagarAdvogado(@PathVariable("id") Long id) {
        this.advogadosService.apagar(id);
    }
    
    @DeleteMapping("/usuarios/{id}")
    public void apagarUsuario(@PathVariable("id") Long id) {
        this.usuariosService.apagar(id);
    }
}
