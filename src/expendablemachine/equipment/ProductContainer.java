/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine.equipment;

import expendablemachine.grocery.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author nbpalomino
 */
final public class ProductContainer extends Stack{

    protected Double price;
    protected String code;
    
    public ProductContainer(List<Product> products, Double price) {
        this.addAll(products);
        this.setPrice(price);        
    }

    public ProductContainer(Double price) {
        this.setPrice(price);
    }
    
    public Double getUnitPrice() {
        return price;
    }
    
    public Double getTotalPrice() {
        return this.getUnitPrice() * this.size();
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
