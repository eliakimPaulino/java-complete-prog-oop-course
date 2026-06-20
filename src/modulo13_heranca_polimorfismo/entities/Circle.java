package modulo13_heranca_polimorfismo.entities;

import modulo13_heranca_polimorfismo.entities.enums.Color;

public class Circle extends Shape {

    private double radius;
    private Color color;

    public Circle() {
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
