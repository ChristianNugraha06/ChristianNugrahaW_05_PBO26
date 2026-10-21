package TugasPraktikum_J4.id.ac.polinema;

import javax.security.auth.login.AccountException;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        Account acc1 = new Account("A001", customer1, 500000);
        acc1.withdraw(150000);
        Account acc3 = new Account("A003", customer1, 300000);
        
        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        Account acc2 = new Account("A002", customer2, 200000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        bank.printAllAccounts();

        Account[] hasil = bank.findAccountsByOwnerName("Nadia");

        System.out.println("Jumlah rekening milik Nadia: " + hasil.length);
        for (int i = 0; i < hasil.length; i++) {
            hasil[i].printInfo();
        }
    }
}
