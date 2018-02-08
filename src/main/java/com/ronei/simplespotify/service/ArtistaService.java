package com.ronei.simplespotify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ronei.simplespotify.domain.Artista;
import com.ronei.simplespotify.repository.ArtistaRepository;

@Service
public class ArtistaService {

	@Autowired
	private ArtistaRepository repository;

	public Page<Artista> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public Artista findOne(Long id) {
		return repository.findOne(id);
	}

	public Artista save(Artista artista) {
		return repository.save(artista);
	}

	public Artista update(Artista disciplina) {
		return repository.save(disciplina);
	}

	public void delete(Long id) {
		repository.delete(id);
	}

}
