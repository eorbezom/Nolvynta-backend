package com.erme.pe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.erme.pe.model.Categoria;
import com.erme.pe.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	//INYECCION DE REPOSITORIO DENTRO DE SERVICE
    private final CategoriaRepository categoriaRepository;
	
	CategoriaService(CategoriaRepository categoriaRepository){
		this.categoriaRepository = categoriaRepository;
	}
	
	//METODO PARA LISTAR CATEGORIA
	public List<Categoria>listaCategoria(){
		return categoriaRepository.findAll();
	}
	
	//METODO PARA OBTENER POR ID
	
	public Categoria obtenerCategoria(Integer IdCategoria) {
		return categoriaRepository.findById(IdCategoria).orElseThrow(()->new IllegalArgumentException("Id invalido: "+IdCategoria));
	}
	//METODO PARA ELIMINAR CATEGORIA
	public void eliminarCategoria(Integer idCategoria) {
		categoriaRepository.deleteById(idCategoria);
		
	}
	//METODO PARA CREAR Y GUARDAS NUEVO PRODUCTO
	public void guardarCategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
		
	}
	
	//METODO PARA BUSCAR POR NOMBRE
	public List<Categoria> buscar(String nombre){
		return categoriaRepository.findByNombreContainingIgnoreCase(nombre);
	}
	
	
}
