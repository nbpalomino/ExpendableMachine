/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine;

import java.util.Iterator;

/**
 *
 * @author nbpalomino
 */
public interface ContainerInterface {
    
    public Object[] getProducts();
    
    public Double getUnitPrice();
    
    public Double getTotalPrice();
    
    public int size();
    
    public String getCode();
    
    public Iterator iterator();
}
