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
public class Motorcycle extends Vehicle {
    private int numManetes;

    public Motorcycle() {
        super();
        this.numManetes = 0;
    }

    public Motorcycle(int numManetes, int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        this.numManetes = numManetes;
    }
    
    @Override
    public String toString(){
        return String.format("Override String class motorcycle");
    }
}
