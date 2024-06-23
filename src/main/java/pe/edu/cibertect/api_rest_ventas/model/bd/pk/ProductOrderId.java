package pe.edu.cibertect.api_rest_ventas.model.bd.pk;



import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter @Setter
@Embeddable
public class ProductOrderId implements Serializable {
    private Integer orderid;
    private Integer productid;
}
