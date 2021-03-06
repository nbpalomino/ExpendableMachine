/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine.grocery;

import expendablemachine.ProductInterface;
import java.util.Date;

/**
 *
 * @author nbpalomino
 */
public class Grocery implements ProductInterface {
    
    protected String name;
    protected Date expirationDate;
    
    /**
     *
     * @param name
     * @param expirationDate
     */
    public Grocery(String name, Date expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;        
    }
    
    public Grocery setName(String name) {
        this.name = name;
        return this;
    }
    
    public Grocery setExpirationDate(Date expDate) {
        this.expirationDate = expDate;
        return this;
    }

    @Override
    public boolean isExpired() {        
        return this.getExpirationDate().before(new Date());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
}
