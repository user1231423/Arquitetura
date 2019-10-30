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
public class Rectangle {
    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle() {
        this.topLeftPoint = new Point();
        this.height = 0.0;
        this.width = 0.0;
    } 

    public Rectangle(Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public double getWidth() {
        return width;
    }
    
    public double calculateArea(){
        return this.width * this.height;
    }
    
    public double calculatePerimeter(){
        return 2*(width + height);
    }
    
    public boolean contains(Point check){
        if( ((check.getX() > this.topLeftPoint.getX() + width)) || (check.getX() < this.topLeftPoint.getX()) ){
            return false;
        }else if( ((check.getY()) > this.topLeftPoint.getY()) || (check.getY() < this.topLeftPoint.getY() - height) ){
            return false;
        }else{
            return true;   
        }
    }
    /*
    public boolean contains(Point check){
        boolean retornar = false;
        Point topRight = new Point(this.topLeftPoint.getX() + width, this.topLeftPoint.getY());
        Point botRight = new Point(this.topLeftPoint.getX() + width, this.topLeftPoint.getY() - height);
        Point botLeft = new Point(this.topLeftPoint.getX(), this.topLeftPoint.getY() - height);
        if(check.getX() > this.topLeftPoint.getX() && check.getX() < topRight.getX() && check.getY() > botRight.getY() && check.getY() < topRight.getY()){
            retornar = true;
        }
        return retornar;
    }*/
}
