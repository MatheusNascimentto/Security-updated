package com.security.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.security.projeto.domain.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	UserDetails findByLogin(String login);
}
