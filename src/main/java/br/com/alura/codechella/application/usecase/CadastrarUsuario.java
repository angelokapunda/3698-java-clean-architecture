package br.com.alura.codechella.application.usecase;


import br.com.alura.codechella.application.gateway.RepositotioUsuario;
import br.com.alura.codechella.domain.entities.usuarios.Usuario;

public class CadastrarUsuario {

    private final RepositotioUsuario repositotioUsuario;

    public CadastrarUsuario(RepositotioUsuario repositotioUsuario) {
        this.repositotioUsuario = repositotioUsuario;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositotioUsuario.cadastrar(usuario);
    }
}
