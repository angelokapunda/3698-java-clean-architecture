package br.com.alura.codechella.infra.gateway;

import br.com.alura.codechella.application.gateway.RepositotioUsuario;

import br.com.alura.codechella.domain.entities.usuarios.Usuario;
import br.com.alura.codechella.infra.persisten.UsuarioEntity;
import br.com.alura.codechella.infra.persisten.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeUsuarioJpa implements RepositotioUsuario {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper usuarioEntityMapper;

    public RepositorioDeUsuarioJpa(UsuarioRepository usuarioRepsitorio, UsuarioEntityMapper mapper) {
        this.usuarioRepository = usuarioRepsitorio;
        this.usuarioEntityMapper = mapper;
    }


    @Override
    public Usuario cadastrar(Usuario usuario) {
        UsuarioEntity entity = usuarioEntityMapper.toEntity(usuario);
        usuarioRepository.save(new Usuario(entity.getCpf(), usuario.getEmail(), usuario.getNascimento(), usuario.getNome()));
        return usuarioEntityMapper.toDoman(entity);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }
}
