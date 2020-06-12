package br.cesed.si.lsi.microservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long professorId;

	private Integer cursoCod;

	private String nome;

	public Disciplina() {
	}

	public Disciplina(Long professorId, Integer cursoCod, String nome) {
		super();
		this.professorId = professorId;
		this.cursoCod = cursoCod;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public Long getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Long professorId) {
		this.professorId = professorId;
	}

	public Integer getCursoCod() {
		return cursoCod;
	}

	public void setCursoCod(Integer cursoCod) {
		this.cursoCod = cursoCod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
