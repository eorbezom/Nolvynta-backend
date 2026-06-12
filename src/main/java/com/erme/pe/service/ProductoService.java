package com.erme.pe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.erme.pe.model.Producto;

import com.erme.pe.repository.ProductoRepository;

@Service
public class ProductoService {

 
//INYECCION AUTOMATICO DE LOS REPOSITORIOS DE DENTRO DE SERVICE
    private final ProductoRepository productoRepository;
	
	
	ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
		
		
	}
	
//PARA LISTAR PRODUCTO
	
	public List<Producto> listaProducto(){
		return productoRepository.findAll();
	}
	//PARA OBTENER PRODUCTO POR ID
	public Producto obtenerProducto(Integer idProducto) {
		return  productoRepository.findById(idProducto).orElseThrow(()-> 
		new IllegalArgumentException("Id invalido: "+idProducto));
	}
	//ELIMINAR PRODUCTO
	public void eliminarProducto(Integer idProducto) {
		productoRepository.deleteById(idProducto);
	}
	
	//CREAR Y GUARDAR NUEVO PRODUCTO
	public void guardarProducto(Producto producto) {
		productoRepository.save(producto);
	}
	//BUSCA PRODUCTO POR NOMBRE
	public List<Producto> buscarProducto(String nombre){
		return productoRepository.findByNombreContainingIgnoreCase(nombre);
	}

}
