package grouplearning.corejava.basics.oo_concept.inheritance;

/**
 * You put specific properties in the sub-class. These specific properties
 * only belongs to the sub-class.
 *
 * For the SavingAccount, interestRate only belongs to this account, so put it here.
 */
public class SavingAccount extends Account{
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accountNumber=" + this.getAccountNumber() +
                " accountBalance=" + this.getAccountBalance() +
                " interestRate=" + this.interestRate +
                '}';
    }
}
