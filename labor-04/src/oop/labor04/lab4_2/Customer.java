package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String fistName, String lastName) {
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
        if(getAccount(account.getAcountNumber()) == null) accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount b : accounts){
            if(b.getAcountNumber().equals(accountNumber)) return b;
        }
        return null;
    }

    public String getFistName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAcount(String accountNumber) {
        BankAccount b = getAccount(accountNumber);
        if (b != null) {
            accounts.remove(b);
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(BankAccount b :accounts){
            result.append( "\t" + b +"\n");
        }
        return result.toString();
    }
}