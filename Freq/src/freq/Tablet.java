/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freq;

/**
 *
 * @author joaogouveia
 */
public class Tablet extends MobileDevice{
    private boolean caneta;

    public Tablet() {
    }

    public Tablet(boolean caneta, String brand, String model, int year, int serialNumber, freq.CPU CPU) {
        super(brand, model, year, serialNumber, CPU);
        this.caneta = caneta;
    }

    public void setCaneta(boolean caneta) {
        this.caneta = caneta;
    }
    
   public boolean getCaneta(){
       return this.caneta;
   }

    @Override
    public String toString() {
        return String.format("Tablet-> Suporta Caneta?: " + this.caneta + ", Specs-> ") + super.toString();
    }
   
    
}
