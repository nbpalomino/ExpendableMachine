/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine.equipment;

import expendablemachine.ContainerInterface;
import expendablemachine.ProductInterface;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author nbpalomino
 */
final public class ProductContainer extends Stack implements ContainerInterface {

    protected Double price;
    protected String code;
    
    public ProductContainer(List<ProductInterface> products, Double price, String code) {
        this.addAll(products);
        this.setPrice(price);        
        this.code = code;
    }

    public ProductContainer(Double price) {
        this.setPrice(price);
    }
    
    @Override
    public Object[] getProducts() {
        return this.toArray();
    }
    
    @Override
    public Double getUnitPrice() {
        return price;
    }
    
    @Override
    public Double getTotalPrice() {
        return this.getUnitPrice() * this.size();
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        
        return String.format(" [Code: %s] \n (%s) \n [S/ %s] ", this.getCode(), this.peek(), this.getUnitPrice());
    }
}
