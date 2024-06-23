package pe.edu.cibertect.api_rest_ventas.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertect.api_rest_ventas.model.bd.Order;

import java.util.List;

public interface IOrderService {

    List<Order> listarOrdenes();

}
