package TugasPraktikum_J10.id.ac.polinema;

public class Main {
    public static void main(String[] args) {

        Customer customer3 = new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer3, 100000, 0.02);

        try{
            savings.withdraw(70000);
        
        } catch (InsufficientBalanceException e){
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
        try {
            savings.withdraw(30000);
            System.out.println("Withdrawal succeeded, new balance: " + savings.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " +e.getMessage());
        }
    }
}
