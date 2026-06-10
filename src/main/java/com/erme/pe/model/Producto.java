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
@Table(name="producto")
public class Producto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	private String nombre;
	
	private String descripcion;
	private Double precio;
	private int stock;
	private String marca;
	
	@ManyToOne
	@JoinColumn(name="categoriaId")
	private Categoria categoria;
	
	private Double peso;
	private String sabor;
	private String image="default.jpg";
	private boolean estado;
	private Date fecha;
	
	//COSTRUCTOR VACION
	public Producto() {
		super();
	}
	//COSTRUCROT CON PARAMETROS

	public Producto(Integer id, String nombre, String descripcion, Double precio, int stock, String marca,
			Categoria categoria, Double peso, String sabor, String image, boolean estado, Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.marca = marca;
		this.categoria = categoria;
		this.peso = peso;
		this.sabor = sabor;
		this.image = image;
		this.estado = estado;
		this.fecha = fecha;
	}
	//GETTER Y SETTER
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", stock=" + stock + ", marca=" + marca + ", categoria=" + categoria + ", peso=" + peso + ", sabor="
				+ sabor + ", image=" + image + ", estado=" + estado + ", fecha=" + fecha + "]";
	}
	

	
	
	

	
	
	

}
