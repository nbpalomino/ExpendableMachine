/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine;

import expendablemachine.equipment.ProductContainer;
import expendablemachine.grocery.ProductProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nbpalomino
 */
public class ExpendableMachine {
    
    protected Map<String, ContainerInterface> container;    
    protected ProductProvider provider;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ExpendableMachine machine   = new ExpendableMachine();
        machine.provider    = new ProductProvider();
        machine.container   = new HashMap();
        
        machine.container.put("3A", new ProductContainer(machine.provider.getSodas(), 1.65, "3A"));
        machine.container.put("3B", new ProductContainer(machine.provider.getCookies(), 0.70, "3B"));
        
        machine.powerOn();
    }
    
    public void powerOn() {
        Scanner sc = new Scanner(System.in);
        String opc;
        
        while(true) {  
            System.out.println("===========================");
            System.out.println("===== VENDING MACHINE =====");            
            showProducts();
            System.out.println("=== Para salir presione X =");
            System.out.println("===========================");
            System.out.print("> Elige un producto: ");
            opc = sc.nextLine();
            
            if ("X".equals(opc)) {
                break;
            } 
            else if(this.container.containsKey(opc)) {
                ProductContainer elem = (ProductContainer) this.container.get(opc);
                System.out.println("You pick: " + elem.pop());
            }
        }
    }
    
    private void showProducts() {
        
        System.out.println("===========================");
        System.out.println("======== PRODUCTOS ========");
        Iterator itt =  this.container.values().iterator();
        
        //TODO: Check if container is empty
        while(itt.hasNext()) {
            System.out.println("************");
            System.out.println( itt.next() );
            System.out.println("************");
        }
    }
}
