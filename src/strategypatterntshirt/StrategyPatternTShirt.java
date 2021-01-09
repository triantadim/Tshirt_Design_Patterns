/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatterntshirt;

import interfaces.IPayment;
import models.Color;
import models.Fabric;
import models.Size;
import models.TShirt;

/**
 *
 * @author George.Pasparakis
 */
public class StrategyPatternTShirt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //TShirt tshirt = new TShirt("MARCO POLO", Color.RED, Size.XS, Fabric.WOOL);
        StrategyPatternTShirt myMainClass = new StrategyPatternTShirt();
        
        // enum with loop 
        for (Color col : Color.values()) { 
            for (Size siz : Size.values()) {
                for (Fabric fab : Fabric.values()) {
                    String tshirt = "Tshird of color " + col + "size " + siz + " and fabric " + fab ;
                    System.out.println(tshirt);
                    
                    float total = col.getColorPrice() + siz.getSizePrice()+fab.getFabricPrice();
                    System.out.println("Total Price = " + total);
                    
                    IPayment payment = new CreditDebitCard();
                    myMainClass.makeAnOrder(tshirt, payment,total);
                    
                    payment = new MoneyBankTransfer();
                    myMainClass.makeAnOrder(tshirt, payment,total);

                    payment = new CashPayment();
                    myMainClass.makeAnOrder(tshirt, payment,total);
                    
                }
            }
        } 
    }
    
    public void makeAnOrder(String tshirt, IPayment payment, float total) {
//        System.out.println(tshirt);
//        System.out.println(payment.getClass().getName());
        if(payment.getClass().getName().equals("strategypatterntshirt.CreditDebitCard")) {
            payment.pay(total + 5.0f);
        }
//        System.out.println("");
        if(payment.getClass().getName().equals("strategypatterntshirt.MoneyBankTransfer")) {
            payment.pay(total + 3.0f);
        }
        if(payment.getClass().getName().equals("strategypatterntshirt.CashPayment")) {
            payment.pay(total );
        }
        
    }
    
}
