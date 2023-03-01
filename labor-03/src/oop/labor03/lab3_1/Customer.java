package oop.labor03.lab3_1;

public class Customer {
    private String fistName;
    private String lastName;
    private BankAccount account;

    public Customer(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.account = null;
    }

    public void setAccount(BankAccount acount) {
        this.account = acount;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void closeAcount(){
        this.account = null;
    }

    @Override
    public String toString() {
        if(this.account != null) return "Costumer{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", acount=" + account + '}';
        return "Costumer{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", has NO acount opened at this bank}";
    }
}