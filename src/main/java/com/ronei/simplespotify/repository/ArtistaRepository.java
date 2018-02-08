package com.ronei.simplespotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronei.simplespotify.domain.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
	
	
	
}