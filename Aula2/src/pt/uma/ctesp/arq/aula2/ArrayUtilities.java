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

    public static int maximumOf(int[] numeros) {
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    public static int minimumOf(int[] numeros) {
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    public static int[] CopyOf(int[] numeros) {
        int[] retornar = numeros;
        return retornar;
    }

    public static boolean contains(int[] numeros, int numero) {
        boolean existe = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static boolean containsDuplicates(int[] numeros) {
        boolean existe = false;
        int[] valores = numeros;
        for (int i = 0; i < numeros.length; i++) {
            for (int x = i + 1; x < valores.length; x++) {
                if (valores[x] == numeros[i]) {
                    existe = true;
                }
            }
        }
        return existe;
    }

    public static int indexOf(int[] numeros, int valor) {
        int retornar = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                retornar = i;
            }
        }
        return retornar;
    }

    public static int[] add(int[] numeros, int valor) {
        int val = numeros.length + 1;
        int[] returnArray = new int[val];
        for (int i = 0; i < numeros.length; i++) {
            returnArray[i] = numeros[i];
        }
        returnArray[val - 1] = valor;
        return returnArray;
    }

    /*    public static int[] remove(int[] numeros, int valor){
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == valor){
                for(int x = i; x < numeros.length -1; x++){
                    numeros[x] = numeros[x + 1];
                }
                break;
            }
        }
        int val = numeros.length - 1;
        int[] returnArray = new int [val];
        
        for (int a = 0; a < returnArray.length; a++){
            returnArray[a] = numeros[a];
        }
        return returnArray;
    }
     */
    public static int[] remove(int[] numeros, int valor) {
        int index = ArrayUtilities.indexOf(numeros, valor);
        int[] returnArray = new int[numeros.length - 1];
        int idx = 0;
        for (int i = 0;i < numeros.length; i++) {
            if (i != index) {
                returnArray[idx++] = numeros[i];
            }
        }
        return returnArray;
    }
}
