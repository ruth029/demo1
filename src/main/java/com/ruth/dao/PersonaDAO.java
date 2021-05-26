package com.ruth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruth.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {

	
	
}
