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
public class NumericalUtilities {

    public static double powerOf(int base, int potencia) {
        double retornar = base;
        for (int i = 1; i < potencia; i++) {
            retornar *= base;
        }
        return retornar;
    }

    public static int sumOfNaturalNumbersUpTo(int upTo) {
        int retornar = 0;
        for (int i = 1; i <= upTo; i++) {
            retornar += i;
        }
        return retornar;
    }

    public static int sumOfNaturalnumbersBetween(int inicio, int fim) {
        int retornar = 0;
        if (fim < inicio) {
            System.out.println("Valor final menor que inicial!!!");
        } else if (inicio < 0 || fim < 0) {
            System.out.println("Valores inválidos dados!");
        } else {
            for (int i = inicio; i <= fim; i++) {
                retornar += i;
            }
        }
        return retornar;
    }

    public static int sumOfEvenNumbersBetween(int inicio, int fim) {
        int retornar = 0;
        if (fim < inicio) {
            System.out.println("Valor final menor que inicial!!!");
        } else if (inicio < 0 || fim < 0) {
            System.out.println("Valores inválidos dados!");
        } else {
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 == 0) {
                    retornar += i;
                }
            }
        }
        return retornar;
    }

    public static boolean isPrime(int numero) {
        int divisores = 0;
        if (numero < 0) {
            System.out.println("Numero inválido dado!");
        } else {
            for (int i = 1; i <= numero; i++) {
                if ((numero % i) == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                return true;
            } 
        }
        return false;
    }
}
