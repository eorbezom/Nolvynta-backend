package com.erme.pe.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erme.pe.model.Pedidos;
import com.erme.pe.service.PedidosService;
//@CrossOrigin(origins = "https://frontend-usu-nolvynta.vercel.app/") //ENLACE CON EL FRONTEDH vercel
@CrossOrigin(origins = "http://127.0.0.1:5500") // PARA TRABAJAR EN LOCAL
@RestController
@RequestMapping("/pedido")
public class PedidoController {

    
	private final PedidosService pedidosService;

    public PedidoController(PedidosService pedidosService) {
        this.pedidosService = pedidosService;
    }

    // LISTAR TODOS
    @GetMapping
    public List<Pedidos> listarPedidos() {
        return pedidosService.ListarPedido();
    }

    // OBTENER UNO POR ID
    @GetMapping("/{id}")
    public Pedidos obtenerPedido(@PathVariable Integer id) {
        return pedidosService.obtenerPedido(id);
    }

    // CREAR PEDIDO
    @PostMapping
    public String guardarPedido(@RequestBody Pedidos pedido) {
        pedidosService.grardarPedido(pedido);
        return "Pedido guardado correctamente";
    }

    // ELIMINAR PEDIDO
    @DeleteMapping("/{id}")
    public String eliminarPedido(@PathVariable Integer id) {
        pedidosService.eliminar(id);
        return "Pedido eliminado correctamente";
    }

    // BUSCAR PEDIDO POR NOMBRE
    @GetMapping("/buscar")
    public List<Pedidos> buscarPedido(@RequestParam String nombre) {
        return pedidosService.buscarPedido(nombre);
    }
	
	
	
}
