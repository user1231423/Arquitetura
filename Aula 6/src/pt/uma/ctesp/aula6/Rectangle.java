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
public class Rectangle extends Shape{
    private double base;
    private double altura;

    public Rectangle() {
        super();
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Rectangle(double base, double altura, Point position) {
        super(position);
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimeter() {
        return 2*(base + altura);
    }
    
}
