package com.ronei.simplespotify.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "artista")
@SequenceGenerator(name = "artista_seqgen", sequenceName = "artista_seq", allocationSize = 1)
public class Artista implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "artista_seqgen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "nome", length = 255)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "genero_id", nullable = false)
	private Genero genero;

	@OneToMany(mappedBy = "artista")
	private List<Album> albuns;

	@Basic(fetch = FetchType.LAZY)
	@Column(name = "imagem")
	private byte[] imagem;

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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Album> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(List<Album> albuns) {
		this.albuns = albuns;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

}
