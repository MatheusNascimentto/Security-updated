package com.security.projeto.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.projeto.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService implements UserDetailsService {
	
	 private final UsuarioRepository usuarioRepository;
	 

	    @Override
	    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
	        return usuarioRepository.findByLogin(login);
	    }

}
