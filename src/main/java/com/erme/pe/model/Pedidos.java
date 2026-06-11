package com.erme.pe.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String Apellidos;
	private String numCliente;
	private String direccion;
	private String referencia;
	
	@ManyToOne
	@JoinColumn(name="productoId")
	private Producto producto;
	
	private int cantidad;
	private double total;
	private String estado;
	private Date fechaPedido;
	//CONSTRUCTOR VACION
	public Pedidos() {
		super();
	}
	//CONSTRUCTOR CON PARAMETROS
	public Pedidos(Integer id, String nombre, String apellidos, String numCliente, String direccion, String referencia,
			Producto producto, int cantidad, double total, String estado, Date fechaPedido) {
		super();
		this.id = id;
		this.nombre = nombre;
		Apellidos = apellidos;
		this.numCliente = numCliente;
		this.direccion = direccion;
		this.referencia = referencia;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
		this.estado = estado;
		this.fechaPedido = fechaPedido;
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
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	//LECTURA EN CONSOLA
	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", nombre=" + nombre + ", Apellidos=" + Apellidos + ", numCliente=" + numCliente
				+ ", direccion=" + direccion + ", referencia=" + referencia + ", producto=" + producto + ", cantidad="
				+ cantidad + ", total=" + total + ", estado=" + estado + ", fechaPedido=" + fechaPedido + "]";
	}
	

}
