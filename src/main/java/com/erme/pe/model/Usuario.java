package com.erme.pe.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private String usuarioIngreso;
	private Date fechaNacimiento;
	private String correo;
	private String password;
	private int telefono;
	private String direccion;
	//CONSTRUCTOR VACIO
	public Usuario() {
		super();
	}
	//COSTRUCTOR CON PARAMETROS
	public Usuario(Integer id, String nombre, String apellido, int dni, int edad, String usuarioIngreso,
			Date fechaNacimiento, String correo, String password, int telefono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.usuarioIngreso = usuarioIngreso;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.password = password;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	//GETTER Y SETTERS
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getUsuarioIngreso() {
		return usuarioIngreso;
	}
	public void setUsuarioIngreso(String usuarioIngreso) {
		this.usuarioIngreso = usuarioIngreso;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//LECTURA EN LA CONSOLA
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad
				+ ", usuarioIngreso=" + usuarioIngreso + ", fechaNacimiento=" + fechaNacimiento + ", correo=" + correo
				+ ", password=" + password + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
	
	
	

}
