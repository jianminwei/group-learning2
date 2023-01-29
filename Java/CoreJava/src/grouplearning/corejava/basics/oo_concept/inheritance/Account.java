package grouplearning.corejava.basics.oo_concept.inheritance;

/**
 * When design classes, you put common properties in the ancestor class.
 */
public class Account {
    private int accountNumber;
    private double accountBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


}
