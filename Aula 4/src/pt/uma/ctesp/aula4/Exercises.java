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
public class Exercises {
    public static void printGrades(int[] numbers, String [] acronyms, int[][] grades){
        for(int i = 0; i < numbers.length; i++){
            System.out.println("As notas do aluno-> " + numbers[i] +  " sao:");
            for(int x = 0; x < grades[x].length; x++){
                System.out.println(acronyms[x] + "-> " + grades[i][x]);
            }
        }
    }
}
