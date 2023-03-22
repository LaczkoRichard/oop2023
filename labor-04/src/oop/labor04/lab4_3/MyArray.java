package oop.labor04.lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class MyArray {
    private int length;
    private Double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements=new Double[length];
        for (int i = 0; i < length; i++)
        {
            elements[i]=0.0;
        }
    }
    public MyArray(MyArray array)
    {
        this.length=array.length;
        this.elements=new Double[length];
        for (int i = 0; i < array.length; i++)
        {
            this.elements[i]=array.elements[i];
        }
    }
    public MyArray(double[] array)
    {
        this.length=array.length;
        this.elements=new Double[length];
        for (int i = 0; i < array.length; i++)
        {
            this.elements[i]=array[i];
        }
    }

    public MyArray(String input)
    {
        try (Scanner scanner = new Scanner(new File(input)))
        {
            String line = scanner.nextLine();
            this.length=Integer.parseInt(line.trim());

            this.elements=new Double[length];

            String line2 = scanner.nextLine();
            String[] items = line2.split(" ");
            for (int i = 0; i < this.length; i++)
            {
                this.elements[i]=(double) Integer.parseInt(items[i].trim());
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void fillRandom(double min,double max)
    {
        for (int i = 0; i < length; i++)
        {
            elements[i]=Math.random()*(max-min+1)+min;
        }
    }

    public double mean()
    {
        if (length == 0) return 0;
        double sum=0;
        for (int i = 0; i < length; i++)
        {
            sum+=elements[i];
        }
        return sum/(double) length;
    }

    public double stddev()
    {
        if (length == 0) return 0;
        double mean=this.mean();
        double sum=0;
        for (int i = 0; i < length; i++)
        {
            sum+=(elements[i]-mean)*(elements[i]-mean);
        }
        return sqrt(sum/length);
    }

    public void sort()
    {
        Arrays.sort(elements);
    }

    public void print(String name)
    {
        System.out.print(name+":");
        for (int i = 0; i < length; i++)
        {
            System.out.print("\t"+this.elements[i]);
        }
        System.out.println();
    }

}