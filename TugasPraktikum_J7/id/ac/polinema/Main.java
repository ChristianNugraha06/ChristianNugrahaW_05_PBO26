package TugasPraktikum_J7.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer1, 100000, 0.02);
        
        savings.deposit(50000, "Initial top-up");
        savings.printInfo();
        
        
    }
}
