package pe.edu.cibertect.api_rest_ventas.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryid;
    //@Column(name = "categoryname")
    private String categoryname;
    private String description;
}
