/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import components.Cashier;
import components.Client;

/**
 *
 * @author bauti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello, World!");
        Cashier cashier = new Cashier();
        Client client = new Client(100,0,0);
        cashier.charge(client, 110);
    }
    
}
