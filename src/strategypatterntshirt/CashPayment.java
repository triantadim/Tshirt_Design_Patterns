
package strategypatterntshirt;

import interfaces.IPayment;


public class CashPayment implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("If payment is with Cash, total amount = %s \n", amount);
        return(true);
    }
    
}