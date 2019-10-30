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
public class Point {
    private double x;
    private double y;
    
    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void changeXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double distanceTo(Point b){
        return Math.sqrt( Math.pow((b.getX() - this.x),2) + Math.pow((b.getY() - this.y),2) );
    }
}
