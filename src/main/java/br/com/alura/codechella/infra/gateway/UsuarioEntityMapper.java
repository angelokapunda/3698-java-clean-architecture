package br.com.alura.codechella.infra.gateway;

import br.com.alura.codechella.domain.entities.usuarios.Usuario;
import br.com.alura.codechella.infra.persisten.UsuarioEntity;

public class UsuarioEntityMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getCpf(), usuario.getEmail(), usuario.getNascimento(), usuario.getNome());
    }

    public Usuario toDoman (UsuarioEntity entity) {
        return new Usuario(entity.getCpf(), entity.getEmail(), entity.getNascimento(), entity.getNome());
    }
}
