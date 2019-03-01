package gr.teohaik.solids;

import java.awt.*;

public class Cone extends Solid {

    private double height;
    private static int counter;

    public Cone(double mass, double radius, double aHeight) {
        super(mass, radius);
        height = aHeight;
        counter++;
        order = counter;
    }

    public static int getCounter() {
        return counter;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius,2) * height;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cone{" +
                "height=" + height +
                '}';
    }

    @Override
    public void paint(int r, int g, int b) {
        Color c = new Color(r, g, b);
        System.out.println("Painted with color "+c.toString());
    }
}
