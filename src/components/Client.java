/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;
import exceptions.NotEnoughFundsException;
import exceptions.PaymentFailedException;

/**
 *
 * @author bauti
 */
public class Client {
    
    private float cash, credit, bank;
    
    public Client(float cash, float bank, float credit)
    {
        this.cash = cash;
        this.credit = credit;
        this.bank = bank;
    }
    
    void payCash(float amount) throws NotEnoughFundsException
    {
        if (amount <= this.cash)
            System.out.println("The Client has paid in cash");
        else
            throw new NotEnoughFundsException();
    }
    
    void payCredit(float amount) throws NotEnoughFundsException
    {
        if (amount <= this.credit)
            System.out.println("The Client has paid with credit card");
        else
            throw new NotEnoughFundsException();
    }
    
    void payBank(float amount) throws NotEnoughFundsException
    {
        if (amount <= this.bank)
            System.out.println("The Client has paid with debit card");
        else
            throw new NotEnoughFundsException();
    }
    
    void pay(float amount) throws PaymentFailedException
    {
        // Ordered Alternatives
        try
        {
            payCredit(amount);
        }
        catch(NotEnoughFundsException firstException)
        {
            System.out.println(firstException.getMessage());
            try
            {
                payBank(amount);
            }
            catch(NotEnoughFundsException secondException)
            {
                System.out.println(secondException.getMessage());
                try
                {
                    payCash(amount);
                }
                catch(NotEnoughFundsException thirdException)
                {
                    //No more alternatives
                    System.out.println(thirdException.getMessage());
                    throw new PaymentFailedException();
                }
            }
        }
    }
}
