package oop.labor03.lab3_1;

public class Main{
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");

        Customer customer2 = new Customer("Mary", "WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));

        System.out.println(customer1); // RECOMMENDED APPROACH!!

        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);

        customer1.getAccount().deposit(1000);
        System.out.println(customer1);

        customer1.getAccount().withdraw(259);
        System.out.println(customer1);
        System.out.println();

        System.out.println(customer2);
        customer2.closeAcount();
        System.out.println(customer2);
        System.out.println();

        customer2.setAccount(customer1.getAccount());
        customer2.setLastName(customer1.getLastName());
        System.out.println(customer1);
        System.out.println(customer2);

    }
}