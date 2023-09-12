package repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long > {

	List<Usuario> findByEmail(String email);
}
