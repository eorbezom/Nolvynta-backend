package com.erme.pe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erme.pe.model.Pedidos;
import com.erme.pe.service.PedidosService;

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
	
	
	
	
}
