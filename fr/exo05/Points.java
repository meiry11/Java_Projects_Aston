package fr.exo05;

public class Points {
    private double x;
    private double y;

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Points point) {
        double dist = Math.sqrt(((point.getX() - this.x) * (point.getX() - this.x)) + ((point.getY() - this.y) * (point.getY() - this.y)));
        return dist;
    }
}
