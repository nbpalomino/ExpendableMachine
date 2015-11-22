/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine;

import expendablemachine.equipment.ProductContainer;
import expendablemachine.grocery.Product;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nbpalomino
 */
public class ExpendableMachine {
    
    protected List<Product> container;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ExpendableMachine machine = new ExpendableMachine();
        
        System.out.println("===== WELCOME ======");
        
        List<Product> products = new ArrayList<>();
        
        Date expDate = new Date("11/23/2015 15:32:12");
        
        Product soda1 = new Product("Kola Real", expDate);
        products.add(new Product("Inca Kola", expDate));
        products.add(new Product("Coca Cola", expDate));
        Product soda4 = new Product("Guaraná", expDate);
        
        ProductContainer container = new ProductContainer(0.80);
        container.setCode("3A");
        container.add(soda1);
        container.add(soda4);
        container.addAll(products);
        
        machine.ContainerPresenter(container);
    }
    
    public void ContainerPresenter(ProductContainer container) {
        System.out.printf("====== CONTAINER %s ======", container.getCode());
        System.out.println();
        System.out.printf("Unit price:      S/ %s \n", container.getUnitPrice());
        System.out.printf("Total price:     S/ %s \n", container.getTotalPrice());
        System.out.printf("Identify code:   %s \n", container.getCode());
        System.out.printf("Total products:  %s \n", container.size());
        
        Iterator it = container.iterator();        
        while(it.hasNext()) {
            System.out.println( " > " + it.next() );
        }        
        System.out.println("===========================");
    }
}
