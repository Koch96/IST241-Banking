package banking;

/*
    @author sak5680
*/
public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber = 1000;
    
    public BankAccount(){
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
    }
    
    public void showStrings(){
        System.out.println("Account #: " + accountNumber);
        System.out.println("Last Assigned Number #: " + lastAssignedNumber);
    }
}
