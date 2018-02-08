package com.ronei.simplespotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronei.simplespotify.domain.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {
	
	
	
}