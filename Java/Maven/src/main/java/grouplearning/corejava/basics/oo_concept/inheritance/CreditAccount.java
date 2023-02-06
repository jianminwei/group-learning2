package grouplearning.corejava.basics.oo_concept.inheritance;

/**
 * You put specific properties in the sub-class. These specific properties
 * only belongs to the sub-class.
 *
 * For the CreditAccount, creditLimit only belongs to this account, so put it here.
 */
public class CreditAccount extends Account{

    private int creditLimit;

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "accountNumber=" + this.getAccountNumber() +
                " accountBalance=" + this.getAccountBalance() +
                " creditLimit=" + creditLimit +
                '}';
    }
}
