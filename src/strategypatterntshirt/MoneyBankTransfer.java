
package strategypatterntshirt;

import interfaces.IPayment;

public class MoneyBankTransfer implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("If payment is with bank transfer, total amount = %s \n", amount);
        return(true);
    }
    
}
