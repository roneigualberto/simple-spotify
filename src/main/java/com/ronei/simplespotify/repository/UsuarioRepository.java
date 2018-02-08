package com.ronei.simplespotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronei.simplespotify.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
	
}