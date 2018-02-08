package com.ronei.simplespotify.dto;

public class ArtistaDTO {

	private Long id;
	private GeneroDTO genero;
	private String titulo;
	private Integer ano;
	private byte[] imagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GeneroDTO getGenero() {
		return genero;
	}

	public void setGenero(GeneroDTO genero) {
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

}
