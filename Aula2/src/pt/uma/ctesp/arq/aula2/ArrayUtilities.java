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
public class ArrayUtilities {

    public static String toString(int[] numeros) {
        String retornar = "[";
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                retornar += numeros[i];
            } else {
                retornar += numeros[i] + ", ";
            }
        }
        return retornar + "]";
    }
    
    public static int maximumOf(int[] numeros){
        int max = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        return max;
    }
    
    public static int minimumOf(int[] numeros){
        int min = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < min){
                min = numeros[i];
            }
        }
        return min;
    }
    
    public static int[] CopyOf(int[] numeros){
        int[] retornar = numeros;
        return retornar;
    }
    
    public static boolean contains(int[] numeros){
        boolean existe = false;
        for(int i = 0; i < numeros.length; i++){
            
        }
        return false;
    }
}
