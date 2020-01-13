package com.soprodivino.visitante.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.soprodivino.visitante.enums.TipoIrmao;

@Entity
public class Irmao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_IRMAO")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "SOBRE_NOME")
	private String sobrenome;
	
	@Column(name = "IGREJA")
	private String igreja;
	
	@Column(name = "CRENTE")
	private boolean crente;
	
	@Column(name = "TIPO_IRMAO")
	private Integer tipoIrmao;
	
	/*
	 * Construtores Irmao
	 */

	public Irmao(){}
	
	public Irmao(Integer id, String nome, String igreja, boolean crente, TipoIrmao tipoIrmao){
		this.id = id;
		this.nome = nome;
		this.igreja = igreja;
		this.crente = crente;
		this.tipoIrmao = tipoIrmao.getCod();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Irmao other = (Irmao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/*
	 * Getters e Seters
	 */
	
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

	public String getIgreja() {
		return igreja;
	}

	public void setIgreja(String igreja) {
		this.igreja = igreja;
	}

	public boolean isCrente() {
		return crente;
	}

	public void setCrente(boolean crente) {
		this.crente = crente;
	}

	public Integer getTipoIrmao() {
		return tipoIrmao;
	}

	public void setTipoIrmao(Integer tipoIrmao) {
		this.tipoIrmao = tipoIrmao;
	}

	public Integer getId() {
		return id;
	}
}
