package br.com.alura.codechella.domain.entities.usuarios;

import br.com.alura.codechella.domain.Endereco;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Usuarios {

    @Test
    public void naoPodePassarOCpfNoFormadoErrado() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("222.234234-43", "email@email.com", LocalDate.parse("2002-02-21"), "Angelo"));
    }

    @Test
    public void criarComFacricaUsuario() {
        FabricaUsuario fabricaUsuario = new FabricaUsuario();
        Usuario usuario = fabricaUsuario.comNomeCpfNascimento("Angelo", "222.222.222-22", LocalDate.parse("2000-02-02"));

        Assertions.assertEquals("Angelo", usuario.getNome());

        usuario = fabricaUsuario.comEndereco("1234-3455", 140,"Apto 408");

        Assertions.assertEquals(140, usuario.getEndereco().getNumero());

    }

}
