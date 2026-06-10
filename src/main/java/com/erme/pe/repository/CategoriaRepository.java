package com.erme.pe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erme.pe.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	List<Categoria> findByNombreContainingIgnoreCase(String nombre);
	

}
