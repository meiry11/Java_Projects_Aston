package fr.exo01;

public class Rectangle {

    public double a;
    public double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double surface() {
        double aire = a * b;
        return aire;
    }
}






