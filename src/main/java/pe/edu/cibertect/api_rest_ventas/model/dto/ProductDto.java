package pe.edu.cibertect.api_rest_ventas.model.dto;

import lombok.Data;

@Data
public class ProductDto implements DtoEntity {
    private Integer productid;
    private String productname;
    private Double unitprice;
    private String quantityperunit;
}
