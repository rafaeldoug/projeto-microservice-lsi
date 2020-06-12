package br.cesed.si.lsi.microservice.professor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private Integer cursoCod;

	public Professor() {
	}

	public Professor(String nome, Integer cursoCod) {
		this.nome = nome;
		this.cursoCod = cursoCod;
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

	public Integer getCursoId() {
		return cursoCod;
	}

	public void setCursoId(Integer cursoId) {
		this.cursoCod = cursoId;
	}

}
