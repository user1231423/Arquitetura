/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.aula6;
import java.util.ArrayList;
/**
 *
 * @author joaogouveia
 */
public class Figure {
    private ArrayList<Shape> shapes;

    public Figure() {
        this.shapes = new ArrayList<>();
    }
    
    /*
    public Figure(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }*/

    public void addShape(Shape shape){
        this.shapes.add(shape);
    }
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
