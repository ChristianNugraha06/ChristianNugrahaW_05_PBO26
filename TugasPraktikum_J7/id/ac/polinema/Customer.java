package TugasPraktikum_J7.id.ac.polinema;

public class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone ){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }
}

