package pe.edu.cibertect.api_rest_ventas.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertect.api_rest_ventas.model.bd.Product;
import pe.edu.cibertect.api_rest_ventas.model.dto.DtoEntity;
import pe.edu.cibertect.api_rest_ventas.model.dto.ProductDto;
import pe.edu.cibertect.api_rest_ventas.service.IProductService;
import pe.edu.cibertect.api_rest_ventas.util.DtoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@PreAuthorize("hasRole('ADMIN')")
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private IProductService iProductService;

    @GetMapping("")
    public ResponseEntity<List<Product>> listarProductos(){
        List<Product> productDtoList = new ArrayList<>(iProductService.listarProducto());
        if(productDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(productDtoList, HttpStatus.OK);
    }

    @GetMapping("/dto")
    public ResponseEntity<List<DtoEntity>> listarProductosDto(){
        List<DtoEntity> productDtoList = new ArrayList<>();
        productDtoList = iProductService.listarProducto()
                .stream()
                .map(x -> new DtoUtil().convertirADto(x, new ProductDto()))
                .collect(Collectors.toList());
        if(productDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(productDtoList, HttpStatus.OK);
    }

}
