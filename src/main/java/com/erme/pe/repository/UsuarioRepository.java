package com.erme.pe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erme.pe.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{

	List<Usuario> findByNombreContainingIgnoreCase(String nombre);

}
