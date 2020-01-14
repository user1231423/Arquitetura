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
public class MobileDevice {
    private String brand;
    private String model;
    private int year;
    private int serialNumber;
    private CPU CPU;

    public MobileDevice() {
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.serialNumber = 0;
        this.CPU = new CPU();
    }

    public MobileDevice(String brand, String model, int year, int serialNumber, CPU CPU) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.serialNumber = serialNumber;
        this.CPU = CPU;
    }

    public String getBrand() {
        return brand;
    }

    public CPU getCPU() {
        return CPU;
    }

    public String getModel() {
        return model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCPU(CPU CPU) {
        this.CPU = CPU;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year + ", Serial Number: " + this.serialNumber + ", CPU: " + this.CPU.toString());
    }
     
}
