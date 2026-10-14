package TugasPraktikum_J4.id.ac.polinema;

public class Bank {
    private Account [] accounts;
    private int count;
    
    public Bank (int capaciyt){
        accounts = new Account[capaciyt];
        count = 0;
    }

    public boolean addAccount (Account account){
        if (count >= accounts.length) {
            return false;
            
        }

        accounts[count] = account;
        count++;
        return true;
    }

    public Account findAccount(String accountNumber){
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
                
            }
        }
        return null;
    }

    public void printAllAccounts(){
        for (int i = 0; i < count; i++) {
            accounts[i].printInfo();
        }
    }
}
