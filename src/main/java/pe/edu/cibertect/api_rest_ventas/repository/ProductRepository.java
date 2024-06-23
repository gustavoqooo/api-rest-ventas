package pe.edu.cibertect.api_rest_ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertect.api_rest_ventas.model.bd.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
