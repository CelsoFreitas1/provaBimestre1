package model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@EntityScan
@Table(name="UserTable")
public class Aluno {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String sobrenome;
	private String idade;
	
	protected Aluno() {}
	
	public Aluno(Long id, String nome, String sobrenome, String idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getIdade() {
		return idade;
	}

	public void setEmail(String idade) {
		this.idade = idade;
	}
	
	

}
