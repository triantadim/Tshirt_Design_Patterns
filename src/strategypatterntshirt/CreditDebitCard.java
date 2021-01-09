
package strategypatterntshirt;

import interfaces.IPayment;


public class CreditDebitCard implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("If payment is with Credit / Debit card, total amount = %s \n", amount);
        return(true);
    }
    
}
