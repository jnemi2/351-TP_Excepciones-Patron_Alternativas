/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author bauti
 */
public class PaymentFailedException extends Exception {
    @Override
    public String getMessage()
    {
        return "Error: Payment failed";
    }
}
