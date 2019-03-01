package gr.teohaik.solids;

public abstract class Solid implements Paintable {

    protected int order;
    protected double mass;
    protected double radius;

    public Solid(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public abstract double calculateVolume();

    public abstract double calculateArea();

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Solid{" +
                "mass=" + mass +
                ", radius=" + radius +
                '}';
    }
}
