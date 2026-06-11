package com.erme.pe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.erme.pe.model.Usuario;
import com.erme.pe.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

   
	
	UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;	
	}
	
	
	//PARA LISTAR EL USUARIO
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	//METODO PARA OBTENER USUARIO POR SU ID
	public Usuario obtenerUsuario(Integer idUsuario) {
		return usuarioRepository.findById(idUsuario).orElseThrow(()-> new IllegalArgumentException("Id invalido: "+idUsuario));
	}
	
	
	//METODO PARA ELIMINAR USUARIO
	public void eliminarUsuario(Integer idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}
	
	//METODO PARA CREAR Y GUARDAR NUEVO USUARIO 
	public void guardarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	//BUSCAR USUARIO POR NOMBRE
	public List<Usuario> buscarUsuario(String nombre){
		return usuarioRepository.findByNombreContainingIgnoreCase(nombre);
	}

}
