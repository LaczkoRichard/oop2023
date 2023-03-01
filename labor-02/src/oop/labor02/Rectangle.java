package oop.labor02;

public class Rectangle {
    public double lenght;
    public double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return this.lenght*this.width;
    }

    public double perimeter(){
        return this.width+this.lenght;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "lenght=" + lenght +
                ", width=" + width + '}';
    }
}