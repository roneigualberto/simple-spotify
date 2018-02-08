package com.ronei.simplespotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronei.simplespotify.domain.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
	
	
	
}