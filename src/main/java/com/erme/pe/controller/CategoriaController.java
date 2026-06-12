package com.erme.pe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erme.pe.model.Categoria;
import com.erme.pe.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;
	
	public CategoriaController (CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	//LISTA CATEGORIA
	@GetMapping
	public List<Categoria> listaCategorias(){
		return categoriaService.listaCategoria();
	}
	//OBTENER POR ID
	@GetMapping("/{id}")
	public Categoria obtenerCategoria(@PathVariable Integer id) {
		return categoriaService.obtenerCategoria(id);
	}
	
	
	//CREAR CATEGORIA
	@PostMapping
	public String guardarCategoria(@RequestBody Categoria categoria){
		categoriaService.guardarCategoria(categoria);
		return"Categoria Guardado";
	}
	
	//ELIMINAR CATEGORIA
	@DeleteMapping("/{id}")
	public String eliminarCategoria(@PathVariable Integer id) {
		categoriaService.eliminarCategoria(id);
		return"Categoria Eliminado";
	}
	
	//BUSCAR PRODUCTO
	@GetMapping("/buscar")
	public List<Categoria> buscarCategorias(@RequestParam String nombre){
		return categoriaService.buscarCategoria(nombre);
	}
	
	
}
