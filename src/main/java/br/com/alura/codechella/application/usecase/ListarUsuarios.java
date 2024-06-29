package br.com.alura.codechella.application.usecase;

import br.com.alura.codechella.application.gateway.RepositotioUsuario;
import br.com.alura.codechella.domain.entities.usuarios.Usuario;

import java.util.List;

public class ListarUsuarios {

    private final RepositotioUsuario repositotioUsuario;


    public ListarUsuarios(RepositotioUsuario repositotioUsuario) {
        this.repositotioUsuario = repositotioUsuario;
    }

    public List<Usuario> listar () {
        return repositotioUsuario.listarUsuarios();
    }
}
