package br.com.alura.codechella.infra.controller;

import br.com.alura.codechella.domain.Endereco;

import java.time.LocalDate;

public record UsuarioDTO(
         String cpf,
         String nome,
         LocalDate nascimento,
         String email) {
}
