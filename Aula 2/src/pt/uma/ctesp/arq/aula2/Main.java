/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.aula2;

/**
 *
 * @author joaogouveia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(NumericalUtilities.powerOf(22, 2));
        //System.out.println(NumericalUtilities.sumOfNaturalNumbersUpTo(100));
        //System.out.println(NumericalUtilities.sumOfNaturalnumbersBetween(0, 5));
        //System.out.println(NumericalUtilities.sumOfEvenNumbersBetween(1, 10));
        //System.out.println(NumericalUtilities.isPrime(2));
        int[] valores = {50, 30, 0, 1, 2, 55};
        //System.out.println(ArrayUtilities.toString(valores));
        //System.out.println(ArrayUtilities.maximumOf(valores));
        //System.out.println(ArrayUtilities.minimumOf(valores));
        //System.out.println(ArrayUtilities.toString(ArrayUtilities.CopyOf(valores)));
        //System.out.println(ArrayUtilities.contains(valores, 2));
        //System.out.println(ArrayUtilities.containsDuplicates(valores));
        //System.out.println(ArrayUtilities.indexOf(valores, 1));
        //System.out.println(ArrayUtilities.toString(ArrayUtilities.add(valores, 10)));
        if(ArrayUtilities.contains(valores, 30)){
            System.out.println(ArrayUtilities.toString(ArrayUtilities.remove(valores, 2)));
        }else{
            System.out.println("O valor não existe no array!!");
        }
    }

}
