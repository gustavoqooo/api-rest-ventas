package pe.edu.cibertect.api_rest_ventas.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertect.api_rest_ventas.model.bd.Customer;
import pe.edu.cibertect.api_rest_ventas.model.bd.Order;
import pe.edu.cibertect.api_rest_ventas.model.bd.OrderDetail;
import pe.edu.cibertect.api_rest_ventas.model.bd.Product;
import pe.edu.cibertect.api_rest_ventas.model.dto.OrderDto;
import pe.edu.cibertect.api_rest_ventas.model.dto.ProductDto;
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

    @Transactional
    public boolean registrarOrdenYOrderDetail(OrderDto orderDto){
        Order order = new Order();
        Customer customer = new Customer();
        customer.setCustomerid(orderDto.getCustomerid());
        order.setCustomer(customer);
        Order nuevaOrder = orderRepository.save(order);
        OrderDetail orderDetail = new OrderDetail();
        for (ProductDto productDto: orderDto.getProductlist()){
            Product product = new Product();
            product.setProductid(productDto.getProductid());
            orderDetail.setProduct(product);
        }
        return false;
    }


}
