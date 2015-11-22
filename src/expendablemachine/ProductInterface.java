/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expendablemachine;

import java.util.Date;

/**
 *
 * @author nbpalomino
 */
public interface ProductInterface {
    
    public boolean isExpired();
    
    public String getName();
    
    public Date getExpirationDate();
}
