package br.com.alura.codechella.application.gateway;


import br.com.alura.codechella.domain.entities.usuarios.Usuario;

import java.util.List;

public interface RepositotioUsuario {

    Usuario cadastrar (Usuario usuario);

    List<Usuario> listarUsuarios();
}
