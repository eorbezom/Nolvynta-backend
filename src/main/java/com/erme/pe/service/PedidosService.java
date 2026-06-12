package com.erme.pe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.erme.pe.model.Pedidos;
import com.erme.pe.repository.PedidosRepository;

@Service
public class PedidosService {

    private final PedidosRepository pedidosRepository;
	
	PedidosService(PedidosRepository pedidosRepository) {
		this.pedidosRepository = pedidosRepository;		
	}
	//METODO PARA LISTAR PEDIDO
	public List<Pedidos> ListarPedido(){
		return pedidosRepository.findAll();
	}
	//METODO PARA OBTENER POR ID
	public Pedidos obtenerPedido(Integer idPedido) {
		return pedidosRepository.findById(idPedido).orElseThrow(()-> new IllegalArgumentException("Id invalido: "+idPedido));		
	}
	//ELIMINAR PEDIDO
	public void eliminar(Integer idPedido) {
		pedidosRepository.deleteById(idPedido);;
	}
	//GUARDAR Y CREAR PEDIDO 
	public void grardarPedido(Pedidos pedidos) {
		pedidosRepository.save(pedidos);
		
	}
	//BUSCAR PEDIDO POR NOMBRE
	public List<Pedidos> buscarPedido(String nombrePedido){
		return pedidosRepository.findByNombreContainingIgnoreCase(nombrePedido);
	}
	

}
