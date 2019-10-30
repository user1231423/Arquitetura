/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.aula6;

/**
 *
 * @author joaogouveia
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(double radius, Point position) {
        super(position);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    
}
