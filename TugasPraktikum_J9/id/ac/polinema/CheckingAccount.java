package TugasPraktikum_J9.id.ac.polinema;

public class CheckingAccount extends Account implements Auditable {

    @Override 
    public String auditLog(){
        return "AUDIT" + getAccountNumber() + " - balance: " + getBalance() + " (overdraft limit: " + overdraftLimit + ")";
    }

    private double overdraftLimit;

    private static final double MONTHLY_FEE = 15000;

    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit){
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    @Override 
    public double monthlyFee(){
        return MONTHLY_FEE;
    }

    @Override 
    protected boolean canWithdraw(double amount){
        return amount > 0 && amount <= getBalance() + overdraftLimit;
    }

    @Override 
    public void printInfo(){
        super.printInfo();
        System.out.println("Account type: Checking, overdraft limit: " + overdraftLimit);
    }

    
    
    
}
