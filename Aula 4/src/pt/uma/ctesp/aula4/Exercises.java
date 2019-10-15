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

    public static void printGrades(int[] numbers, String[] acronyms, int[][] grades) {
        float media = 0;
        float soma = 0;
        float maisAlta = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            soma = 0;
            System.out.println("As notas do aluno-> " + numbers[i] + " sao:");
            for (int x = 0; x < grades[x].length; x++) {
                soma += grades[i][x];
                System.out.println(acronyms[x] + "-> " + grades[i][x]);
            }
            media = soma / 3;
            if(media > maisAlta){
                maisAlta = media;
                index = i;
            }
            System.out.println("Média: " + Math.round(media * 100.0) / 100.0);
            System.out.println(" ");
        }
        System.out.println("Media mais alta foi: " + maisAlta + " do aluno: " + numbers[index]);
    }
}
