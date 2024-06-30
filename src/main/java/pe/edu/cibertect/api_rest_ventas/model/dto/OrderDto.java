package pe.edu.cibertect.api_rest_ventas.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderDto {


    private String customerid;
    private Integer employeeid;
    private List<ProductDto> productlist;


}
