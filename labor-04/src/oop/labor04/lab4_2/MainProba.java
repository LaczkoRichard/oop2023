package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProba {
    public static void main(String[] args) {

        ArrayList<Customer> customersArray = readFileWithBankAccountData("lab4_2_input.csv");

        for (Customer customer : customersArray) {
            System.out.println(customer);
        }
    }
    public static ArrayList<Customer> readFileWithBankAccountData(String fileName) {
        ArrayList<Customer> accountsArrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            Customer tempCustomer;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                if (line[0].equals("Customer")) {
                    tempCustomer = new Customer(line[1].trim(), line[2].trim());
                    accountsArrayList.add(tempCustomer);
                }
                if (line[0].equals("Account")) {
                    accountsArrayList.get(accountsArrayList.size() - 1).addAccount(new BankAccount(line[1].trim()));
                    accountsArrayList.get(accountsArrayList.size() - 1).getAccount(line[1].trim()).deposit(Integer.parseInt(line[2].trim()));

                }

            }
            return accountsArrayList;
        } catch (FileNotFoundException error) {
            System.out.println("File not found: " + fileName);
            error.printStackTrace();
        }
        return accountsArrayList;
    }
}