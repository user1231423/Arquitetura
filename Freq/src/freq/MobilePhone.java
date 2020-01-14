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
public class MobilePhone extends MobileDevice{
    private String operador;
    private String redeSuportada;

    public MobilePhone() {
        super();
        this.operador = "";
        this.redeSuportada = "";
    }

    public MobilePhone(String operador, String redeSuportada, String brand, String model, int year, int serialNumber, freq.CPU CPU) {
        super(brand, model, year, serialNumber, CPU);
        this.operador = operador;
        this.redeSuportada = redeSuportada;
    }

    public String getOperador() {
        return operador;
    }

    public String getRedeSuportada() {
        return redeSuportada;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setRedeSuportada(String redeSuportada) {
        this.redeSuportada = redeSuportada;
    }

    @Override
    public String toString() {
        return String.format("Mobile Phone-> Operator: " + this.operador + ", Rede suportada: " + this.redeSuportada + ", Specs-> ") + super.toString();
    }

}
