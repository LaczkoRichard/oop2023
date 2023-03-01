package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;
import java.util.Random;

public class Main {
    public static int numberGen = 10;

    public static void main(String[] args) {

        Random random = new Random();

        Customer customer1 = new Customer("John","PINK");
        Customer customer2 = new Customer("Mary","JANE");

        for(int i=0;i<5;i++) {
            String accountGen = "OTP000" + numberGen;
            BankAccount account = new BankAccount(accountGen);
            customer1.addAccount(account);
            account.deposit(random.nextInt(1000)+1);
            numberGen++;
        }
        for(int i=0;i<9;i++) {
            String accountGen = "OTP000" + numberGen;
            BankAccount account = new BankAccount(accountGen);
            customer2.addAccount(account);
            account.deposit(random.nextInt(500)+1);
            numberGen++;
        }

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println("--------------------------------------------------------------------");

        customer1.closeAcount("OTP00010");  // hard coded mert nincs irva x-edik accountra valo bezaras
        customer2.closeAcount("OTP00023");  // irhatok ha kell.

        System.out.println(customer1);
        System.out.println(customer2);
    }
}