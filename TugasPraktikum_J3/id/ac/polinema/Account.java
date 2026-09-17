package id.ac.polinema;

public class Account {

    private String accountNumber;
    private String ownerName;
    private double balance;
    private double dailyWithdrawLimit;

    public Account (String accountNumber, String ownerName, double balance, double dailyWithdrawLimit) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount<=0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount){
        if (amount <= 0 || amount > balance || amount > dailyWithdrawLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void printInfo(){
        System.out.println(accountNumber + " - " + ownerName + " - balance: " + balance );
    }
    
}



