package gr.teohaik.solids;

import java.awt.*;

public class Cylinder extends Solid {

    private double height;
    private static int counter;

    public Cylinder(double mass, double radius, double height) {
        super(mass, radius);
        this.height = height;
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
        return Math.PI * Math.pow(radius,2) * height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public void paint(int r, int g, int b) {
        Color c = new Color(r, g, b);

        System.out.println("Painted Cylinder with color "+c.toString());
    }

    @Override
    public String toString() {
        return super.toString() + " \n" +
                "Cylinder{" +
                "height=" + height +
                '}';
    }
}
