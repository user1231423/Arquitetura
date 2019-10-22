/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.aula5;

/**
 *
 * @author joaogouveia
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    
    public Triangle(){
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }
    
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Point getA(){
        return a;
    }
    
    public Point getB(){
        return b;
    }
    
    public Point getC(){
        return c;
    }
    
    public void setA(Point a){
        this.a = a;
    }
    
    public void setB(Point b){
        this.b = b;
    }
    
    public void setC(Point c){
        this.c = c;
    }
    
    public void set(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double calculateBase(){
        return Math.round(b.distanceTo(c));
    }
  
    public double calculateHipotenusa(){
        return Math.round(Math.sqrt(Math.pow(this.b.distanceTo(c),2) + Math.pow(this.c.distanceTo(a),2)));
    }
    
    public double calculateHeight(){
        return Math.round(this.a.distanceTo(b));
    }
    
    public double calculateArea(){
        return Math.round((this.calculateBase() * this.calculateHeight()) / 2);
    }
}
