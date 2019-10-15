/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.aula4;

/**
 *
 * @author joaogouveia
 */
public class MatrixUtilities {

    public static void show(int[][] imprimir) {
        for (int i = 0; i < imprimir.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < imprimir.length; j++) {
                System.out.print(imprimir[i][j] + " ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }

    public static boolean isMatrix(int[][] verificar) {
        int numCol = verificar.length;
        int lastIndex = 0;
        for (int i = 1; i < verificar.length; i++) {
            if ((verificar[i].length) != (verificar[i - 1].length)) {
                return false;
            } else {
                lastIndex = i;
            }
        }

        if (numCol != verificar[lastIndex].length) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isIdentity(int[][] verificar) {
        int cont = 0;
        int contInvalids = 0;
        for (int i = 0; i < verificar.length; i++) {
            for (int x = 0; x < verificar[i].length; x++) {
                if (x == i) {
                    if (verificar[i][x] == 1) {
                        cont += 1;
                    }
                }else{
                    if(verificar[i][x] != 0){
                        contInvalids += 1;
                    }
                }
            }
        }
        if(contInvalids != 0){
            return false;
        }else if (((cont == verificar.length)) || (cont == verificar[0].length)) {
            return true;
        } else {
            return false;
        }
    }

    public static void multiplyBy(int[][] valores, int mult) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[");
            for (int x = 0; x < valores[i].length; x++) {
                System.out.print(valores[i][x] * mult + " ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }

    public static int getLineLength(int[][] verificar) {
        int cont = 0;
        int temp = 0;
        for (int i = 0; i < verificar.length; i++) {
            if (cont > temp) {
                temp = cont;
            }
            cont = 0;
            for (int x = 0; x < verificar[i].length; x++) {
                cont += 1;
            }
        }
        return cont;
    }

    public static boolean areCompatibleForSum(int[][] valores1, int[][] valores2) {
        boolean retornar = false;
        int valores1ColLength = valores1.length;
        int valores2ColLength = valores2.length;
        int valores1LineLength = getLineLength(valores1);
        int valores2LineLength = getLineLength(valores2);
        if ((valores1LineLength == valores2LineLength) && (valores1ColLength == valores2ColLength)) {
            retornar = true;
        } else {
            retornar = false;
        }
        return retornar;
    }

}
