package AdvFox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import AdvFox.model.Advogados;
import AdvFox.model.Usuarios;
import AdvFox.repositories.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuarios> getUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Usuarios getUsuarioPorId(Long idUsuario) {
        return this.usuarioRepository.findById(idUsuario).orElse(null);
    }

    @Transactional
    public Usuarios inserirOuAtualizar(Usuarios usuarios) {
    	Usuarios usuariosInserido = this.usuarioRepository.save(usuarios);
        return usuariosInserido;
    }
    

    public void apagar(Long id) {
        this.usuarioRepository.deleteById(id);
    }
}
