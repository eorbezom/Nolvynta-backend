package com.erme.pe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erme.pe.model.Pedidos;

public interface PedidosRepository  extends JpaRepository<Pedidos, Integer>{

	List<Pedidos> findByNombreContainingIgnoreCase(String nombrePedido);

}
