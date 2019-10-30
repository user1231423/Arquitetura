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
public class Car extends Vehicle {
    private int doorAmount;
    
    public Car() {
        super();
        this.doorAmount = 0;
    }

    public Car(int doorAmount, int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        this.doorAmount = doorAmount;
    }
    
    @Override
    public String toString(){
        return String.format("Override String class car");
    }
}
