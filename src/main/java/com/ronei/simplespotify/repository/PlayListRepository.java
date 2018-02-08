package com.ronei.simplespotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronei.simplespotify.domain.PlayList;

public interface PlayListRepository extends JpaRepository<PlayList, Long> {
	
	
	
}