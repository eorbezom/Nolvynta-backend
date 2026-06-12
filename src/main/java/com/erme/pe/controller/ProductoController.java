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

import com.erme.pe.model.Producto;
import com.erme.pe.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;
	
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	//LISTAR TODO EL PRODUCTO
	@GetMapping
	public List<Producto> listarProducto(){
		return productoService.listaProducto();
	}
	
	
	//OBTENER POR ID
	@GetMapping("/{id}")
	public Producto obtenerProducto(@PathVariable Integer id) {
		return productoService.obtenerProducto(id);
	}
	
	//CREAR PRODUCTO
	@PostMapping
	public String guardarProducto(@RequestBody Producto producto) {
		productoService.guardarProducto(producto);
		return "Pedido Guardado Correctamente";
	}
	//ELIMINAR PRODUCTO
	@DeleteMapping("/{id}")
	public String eliminarProducto(@PathVariable Integer id) {
		productoService.eliminarProducto(id);
		return"Pedido Eliminado Correctamente";
	}
	
	//BUSCAR PRODUCTO
	@GetMapping("/buscar")
	public List<Producto> buscarProducto(@RequestParam String nombre){
		return productoService.buscarProducto(nombre);
	}
	
	
	
}
