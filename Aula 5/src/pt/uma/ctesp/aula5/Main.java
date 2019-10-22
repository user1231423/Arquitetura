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
public class Main {
    public static void main(String[] args){
       Point p1 = new Point(0,5);
       Point p2 = new Point(0,0);
       Point p3 = new Point(6,0);
       //System.out.println(p.getY());
       //System.out.println(p1.distanceTo(p2));
       Triangle t1 = new Triangle(p1,p2,p3);
       //System.out.println(t1.calculateArea());
       Point topLeft = new Point(0,10);
       Rectangle r1 = new Rectangle(topLeft,10,20);
       System.out.println(r1.contains(p1));
    }  
}
