/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine.grocery;

import expendablemachine.ProductInterface;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nbpalomino
 */
public class ProductProvider {
    
    protected List<ProductInterface> list;
    
    public List<ProductInterface> getSodas() {
        
        list = new ArrayList<>();
        
        list.add(new Grocery("Inca Kola", new Date("21/10/2016")));
        list.add(new Grocery("Inca Kola", new Date("21/10/2016")));
        list.add(new Grocery("Inca Kola", new Date("21/10/2016")));
        list.add(new Grocery("Coca Cola", new Date("21/10/2016")));
        list.add(new Grocery("Coca Cola", new Date("21/10/2016")));
        list.add(new Grocery("Coca Cola", new Date("21/10/2016")));
        list.add(new Grocery("Sprite", new Date("15/10/2015")));
        list.add(new Grocery("Pepsi", new Date("12/10/2016")));
        list.add(new Grocery("Guaraná", new Date("14/10/2016")));        
        
        return list;
    } 
    
    public List<ProductInterface> getCookies() {
        
        list = new ArrayList<>();
        
        list.add(new Grocery("Tentación", new Date("21/10/2016")));
        list.add(new Grocery("Tentación", new Date("21/10/2016")));
        list.add(new Grocery("Morochas", new Date("21/10/2016")));
        list.add(new Grocery("Morochas", new Date("21/10/2016")));
        list.add(new Grocery("Charada", new Date("21/10/2016")));
        list.add(new Grocery("Choco Soda", new Date("21/10/2016")));
        list.add(new Grocery("Chocochips", new Date("15/10/2015")));
        
        return list;
    }
}
