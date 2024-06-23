package pe.edu.cibertect.api_rest_ventas.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertect.api_rest_ventas.model.bd.Product;
import pe.edu.cibertect.api_rest_ventas.repository.ProductRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    @Override
    public List<Product> listarProducto() {
        return productRepository.findAll();
    }
}
