/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;
import exceptions.PaymentFailedException;

/**
 *
 * @author bauti
 */
public class Cashier {
    
    public Cashier()
    {
        
    }
    
    public void charge(Client client, float amount)
    {
        try
        {
            client.pay(amount);
        }
        catch(PaymentFailedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
