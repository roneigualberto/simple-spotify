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
@Table(name = "album")
@SequenceGenerator(name = "album_seqgen", sequenceName = "album_seq", allocationSize = 1)
public class Album implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "album_seqgen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@ManyToOne
	@JoinColumn(name = "artista_id", nullable = false)
	private Artista artista;

	@ManyToOne
	@JoinColumn(name = "genero_id", nullable = false)
	private Genero genero;

	@Column(name = "ano", nullable = false)
	private Integer ano;

	@Basic(fetch = FetchType.LAZY)
	@Column(name = "capa")
	private byte[] capa;

	@OneToMany(mappedBy = "album")
	private List<Musica> musicas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

}
