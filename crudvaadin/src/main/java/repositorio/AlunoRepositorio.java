package repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long > {

	List<Aluno> findByEmail(String email);
}
