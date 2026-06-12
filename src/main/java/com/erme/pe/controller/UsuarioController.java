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

import com.erme.pe.model.Usuario;
import com.erme.pe.service.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	
	//PARA LISTAR USUARIO
	@GetMapping
	public List<Usuario>listaUsuario(){
		return  usuarioService.listaUsuarios();
	}
	
	//OBTENER POR ID
	@GetMapping("/{ID}")
	public Usuario obtenerUsuario(@PathVariable Integer id) {
		return usuarioService.obtenerUsuario(id);
	}	
	
	//CREAR PRODUCTO
	@PostMapping
	public String guardarUsuario(@RequestBody Usuario usuario) {
		usuarioService.guardarUsuario(usuario);
		return"Usuario  guardado Correctamente";
	}
	
	//ELIMINAR PRODUCTO
	@DeleteMapping("/{id}")
	public String eliminarUsuario(@PathVariable Integer id) {
		usuarioService.eliminarUsuario(id);
		return"Producto Eliminado";
	}
	
	//BUSCAR USUARIP
	@GetMapping("/buscar")
	public List<Usuario> buscarUsuario(@RequestParam String nombre){
		return usuarioService.buscarUsuario(nombre);
	}

}
