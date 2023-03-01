package oop.labor02;

import java.util.Random;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[ 10 ];
        double totalArea= 0 ;

        // use a random generator
        Random rand = new Random();
        //generate positive random numbers less than a bound
        for (int i=0;i<=9;i++){
//            double length = 1 + rand.nextInt(10) + (float)rand.nextInt(10)/10;
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[ i ] = new Rectangle(length, width);
        }

        for (int i=0;i<=9;i++){
            System.out.print("nr." + i + " ");
            System.out.print(rectangles[i]);
            System.out.println(" Area=" + rectangles[i].area() + " Perimeter="+ rectangles[i].perimeter());
            totalArea += rectangles[i].area();
        }

        System.out.println("\nThe total area of the generated rectangles: " + totalArea);

    }
}