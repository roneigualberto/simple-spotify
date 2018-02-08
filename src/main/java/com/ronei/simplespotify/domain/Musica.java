package com.ronei.simplespotify.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "musica")
@SequenceGenerator(name = "musica_seqgen", sequenceName = "musica_seq", allocationSize = 1)
public class Musica implements Serializable {

	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "musica_seqgen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "album_id", nullable = false)
	private Album album;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Basic(fetch = FetchType.LAZY)
	@Column(name = "audio")
	private byte[] audio;

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

	public byte[] getAudio() {
		return audio;
	}

	public void setAudio(byte[] audio) {
		this.audio = audio;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

}
