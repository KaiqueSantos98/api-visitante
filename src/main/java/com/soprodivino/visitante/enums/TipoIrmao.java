package com.soprodivino.visitante.enums;

public enum TipoIrmao {
	
	MASCULINO(1, "Varão"),
	FEMININO(2, "Varoa");
	
	private int cod;
	private String descricao;
	
	/*
	 * Construtores TipoIrmao
	 */
	
	private TipoIrmao(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	/*
	 * Verifica há existencia do codigo TipoIrmao
	 * @throws IllegalAccessException
	 */
	public static TipoIrmao toEnum(Integer cod) throws IllegalAccessException {
		if(cod != null) {
			for(TipoIrmao irmao : TipoIrmao.values()) {
				if(cod.equals(irmao.cod)) {
					return irmao;
				}else 
					throw new IllegalAccessException("Id inválido: " + cod);
			}
		}
		
		return null;
	}
	
	/*
	 * Getters e Seters
	 */
	
	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
