package br.com.alura.codechella.infra.persisten;


import br.com.alura.codechella.domain.entities.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
