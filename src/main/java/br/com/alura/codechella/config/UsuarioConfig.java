package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateway.RepositotioUsuario;
import br.com.alura.codechella.application.usecase.CadastrarUsuario;
import br.com.alura.codechella.application.usecase.ListarUsuarios;
import br.com.alura.codechella.infra.gateway.RepositorioDeUsuarioJpa;
import br.com.alura.codechella.infra.gateway.UsuarioEntityMapper;
import br.com.alura.codechella.infra.persisten.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {


    @Bean
    public CadastrarUsuario cadastrarUsuario(RepositotioUsuario repositotioUsuario) {
        return new CadastrarUsuario(repositotioUsuario);
    }

    @Bean
    public ListarUsuarios listarUsuarios(RepositotioUsuario repositotioUsuario) {
        return new ListarUsuarios(repositotioUsuario);
    }

    @Bean
    public RepositorioDeUsuarioJpa criarRepositorioJpa(UsuarioRepository usuarioRepository, UsuarioEntityMapper mapper) {
        return new RepositorioDeUsuarioJpa(usuarioRepository,mapper );
    }

    @Bean
    public UsuarioEntityMapper retornarMapper() {
        return new UsuarioEntityMapper();
    }
}
