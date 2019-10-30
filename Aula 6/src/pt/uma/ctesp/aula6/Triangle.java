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
public class Triangle extends Shape {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public Triangle() {
        super();
        this.base = 0.0;
        this.altura = 0.0;
        this.lado1 = 0.0;
        this.lado2 = 0.0;
    }

    public Triangle(double base, double lado1, double lado2, double altura, Point position) {
        super(position);
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
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
        return (base * altura) / 2;
    }

    @Override
    public double getPerimeter() {
        return base + lado1 + lado2;
    }
}
