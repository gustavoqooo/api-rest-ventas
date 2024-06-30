package pe.edu.cibertect.api_rest_ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertect.api_rest_ventas.model.bd.OrderDetail;
import pe.edu.cibertect.api_rest_ventas.model.bd.pk.ProductOrderId;

@Repository
public interface OrderDetailRepository
        extends JpaRepository<OrderDetail, ProductOrderId> {
}
