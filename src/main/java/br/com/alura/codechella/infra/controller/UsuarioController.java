package br.com.alura.codechella.infra.controller;


import br.com.alura.codechella.application.usecase.CadastrarUsuario;
import br.com.alura.codechella.application.usecase.ListarUsuarios;
import br.com.alura.codechella.domain.entities.usuarios.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuasrios")
public class UsuarioController {

    private final CadastrarUsuario cadastrar;
    private final ListarUsuarios listarUsuarios;

    public UsuarioController(CadastrarUsuario cadastrar, ListarUsuarios listarUsuarios) {
        this.cadastrar = cadastrar;
        this.listarUsuarios = listarUsuarios;
    }

    @PostMapping
    public UsuarioDTO cadastrarUsuario(@RequestBody UsuarioDTO dto) {
        var salvo = cadastrar.cadastrarUsuario(new Usuario(dto.cpf(), dto.email(), dto.nascimento(), dto.nome()));
        return new UsuarioDTO(salvo.getCpf(), salvo.getEmail(), dto.nascimento(),dto.email());
    }

    @GetMapping
    public List<UsuarioDTO> listagemUsuario() {
        return listarUsuarios.listar().stream()
                .map(u -> new UsuarioDTO(u.getCpf(), u.getEmail(), u.getNascimento(), u.getNome())).toList();
    }
}
