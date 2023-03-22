package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> arrayList = readFromCSVFile("lab4_2_input.csv");
        int index=0;
        for(Customer s : arrayList){
            System.out.println(index+": "+s);
            index++;
        }
//      for(Person s : arrayList){
//         System.out.println(String.valueOf(index++)+": "+s);
//      }
//      System.out.println(arrayList);
    }

    public static void readFilePrintItsLineNumbered(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while(scanner.hasNextLine()) System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("lab4_2_input.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                if(items[0].trim().equals("Customer")){

                }
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                // Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Customer(firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

}