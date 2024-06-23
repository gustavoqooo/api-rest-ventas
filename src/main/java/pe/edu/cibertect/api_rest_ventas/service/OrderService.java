package pe.edu.cibertect.api_rest_ventas.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertect.api_rest_ventas.model.bd.Order;
import pe.edu.cibertect.api_rest_ventas.repository.OrderRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderService implements IOrderService {

    private OrderRepository orderRepository;

    @Override
    public List<Order> listarOrdenes() {
        return orderRepository.findAll();
    }
}
