package grouplearning.corejava.basics.oo_concept.inheritance;

public class AccountTest {

    public static void main(String[] args) {
        CreditAccount ca = new CreditAccount();

        ca.setAccountNumber(123);
        ca.setAccountBalance(500.50);
        ca.setCreditLimit(8000);

        SavingAccount sa = new SavingAccount();
        sa.setAccountNumber(456);
        sa.setAccountBalance(9000.50);
        sa.setInterestRate(0.03);

        System.out.println(ca);
        System.out.println(sa);

    }
}
