package com.erme.pe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.erme.pe.model.Producto;
import com.erme.pe.repository.CategoriaRepository;
import com.erme.pe.repository.ProductoRepository;

@Service
public class ProductoService {

    private final CategoriaRepository categoriaRepository;

    private final ProductoRepository productoRepository;
	
	
	ProductoService(ProductoRepository productoRepository, CategoriaRepository categoriaRepository) {
		this.productoRepository = productoRepository;
		this.categoriaRepository = categoriaRepository;
		
	}
	

	
	public List<Producto> listaProducto(){
		return productoRepository.findAll();
	}
	
	public Producto obtenerProducto(Integer idProducto) {
		return  productoRepository.findById(idProducto).orElseThrow(()-> new IllegalArgumentException("Id invalido: "+idProducto));
	}
	public void eliminarProducto(Integer idProducto) {
		productoRepository.deleteById(idProducto);
	}
	
	public void guardarProducto(Producto producto) {
		productoRepository.save(producto);
	}
	
	public List<Producto> buscar(String nombre){
		return productoRepository.findByNombreContainingIgnoreCase(nombre);
	}

}
