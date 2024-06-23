package pe.edu.cibertect.api_rest_ventas.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertect.api_rest_ventas.model.bd.Order;
import pe.edu.cibertect.api_rest_ventas.service.IOrderService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    private IOrderService iOrderService;

    @GetMapping("")
    public ResponseEntity<List<Order>> listarOrdenes(){
        List<Order> orderList = new ArrayList<>(iOrderService.listarOrdenes());
        if(orderList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }
}
