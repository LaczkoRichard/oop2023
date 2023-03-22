package oop.labor04.lab4_2;

public class BankAccount {
    private String acountNumber;
    private double balance;

    public BankAccount(String acountNumber) {
        this.acountNumber = acountNumber;
        this.balance = 0;
    }

    public String getAcountNumber() {
        return acountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount>0) this.balance += amount;
    }

    public void withdraw(double amount){
        if(amount<=this.balance) this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "acountNumber='" + acountNumber + '\'' +
                ", balance=" + balance + '}';
    }
}