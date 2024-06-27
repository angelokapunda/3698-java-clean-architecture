package br.com.alura.codechella.naoUsar.model.repository;

import br.com.alura.codechella.naoUsar.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
