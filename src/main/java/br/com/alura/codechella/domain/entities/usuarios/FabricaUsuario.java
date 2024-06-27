package br.com.alura.codechella.domain.entities.usuarios;

import br.com.alura.codechella.domain.Endereco;

import java.time.LocalDate;

public class FabricaUsuario {

    private Usuario usuario;

    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento) {
        this.usuario = new Usuario(cpf, "", nascimento, nome);
        return this.usuario;
    }

    public Usuario comEndereco (String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new Endereco(cep, complemento, numero));
        return this.usuario;
    }

}
