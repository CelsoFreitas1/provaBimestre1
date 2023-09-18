package br.senac.df.springbootvaadin.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Component
@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String sobrenome;
	private String email;
	
	
	public Pessoa() {
		
	}
	public Pessoa(Integer id, String nome, String sobrenome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	public void setNome(String value) {
		// TODO Auto-generated method stub
		
	}
	public void setId(Integer value) {
		// TODO Auto-generated method stub
		
	}
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getSobrenome() {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setId(String value) {
		// TODO Auto-generated method stub
		
	}
	
}
