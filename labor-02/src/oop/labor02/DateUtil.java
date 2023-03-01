package oop.labor02;

import java.util.Random;

public class DateUtil {


    public static boolean leapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if ((day > 31 || day <= 0) || (month > 12 || month <= 0) || (year > 2022 || year <= 0)) {
            return false;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        } else if (month == 2 && leapYear(year)) {
            return day <= 29;
        } else return month != 2 || day <= 28;
    }

    public static void main(String[] args) {

//      System.out.println(DateUtil.isValidDate(2000, 2, 29) == true);
//      System.out.println(DateUtil.isValidDate(2000, 2, 30) == false);
//      System.out.println(DateUtil.isValidDate(1900, 2, 29) == false);
//      System.out.println(DateUtil.isValidDate(1900, 2, 28) == true);
//      System.out.println(DateUtil.isValidDate(-1900, 2, 28) == false);
//      System.out.println(DateUtil.isValidDate(0, 2, 28) == false);
//      System.out.println(DateUtil.isValidDate(2021, 2, 29) == false);
//      System.out.println(DateUtil.isValidDate(2020, 2, 29) == true);
//      System.out.println(DateUtil.isValidDate(2020, 1, 32) == false);
//      System.out.println(DateUtil.isValidDate(2020, 1, 0) == false);
//      System.out.println(DateUtil.isValidDate(2020, 0, 0) == false);
//      System.out.println(DateUtil.isValidDate(2020, 4, 31) == false);
//      System.out.println(DateUtil.isValidDate(2020, 1, 31) == true);

        Random rand = new Random();
        int validDates=0;
        int inValidDates=0;

        for(int i=0;i<1000;i++){
            int year = rand.nextInt(4000)-100;  //between -100 and 3900
            int month = rand.nextInt(20)-5;  //between -5 and 14
            int day = rand.nextInt(50)-10;  //between -10 and 39

            MyDate myDate = new MyDate(year,month,day);
            System.out.print(myDate);
            if(isValidDate(myDate.getYear(),myDate.getMonth(),myDate.getDay())) {
                System.out.println(" Is a VALID date. :)");
                validDates++;
            }
            else {
                System.out.println(" Is NOT a Valid date, Sorry! :(");
                inValidDates++;
            }
        }
        System.out.println("\nIn total "+validDates+" GOOD dates and "+inValidDates+" BAD dates.");

    }
}