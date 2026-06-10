package com.erme.pe.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erme.pe.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

	List<Producto> findByNombreContainingIgnoreCase(String nombre);

	
	

}
