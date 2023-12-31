package com.generation.blogpessoal.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table (name = "tb_tema")
public class Tema {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	
	@NotNull(message = "Atributo da Descrição é obrigatório!")	
		private String descricao;
	
	@OneToMany (mappedBy = "tema", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("tema")
		private List<Postagens> postagens;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagens> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagens> postagens) {
		this.postagens = postagens;
	}
		
	
}
