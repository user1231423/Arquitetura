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
public class CPU {
    private int cores;
    private int bits;
    private double speed;

    public CPU() {
        this.cores = 0;
        this.bits = 0;
        this.speed = 0.0;
    }

    public CPU(int cores, int bits, double speed) {
        this.cores = cores;
        this.bits = bits;
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public int getBits() {
        return bits;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return String.format("Cores: " + this.cores + ", Bits: " + this.bits + ", Speed: " + this.speed);
    }
    
}
