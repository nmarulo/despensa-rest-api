package dev.nmarulo.depensaapp.app.shoppinglist.classes;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShoppingListReq {
    
    private String name;
    
    private Integer totalProducts;
    
    private BigDecimal totalCalories;
    
    private BigDecimal totalPrice;
    
}
