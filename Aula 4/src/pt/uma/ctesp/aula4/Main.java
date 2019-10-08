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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int [] studentNumbers = {20032,30312,25342,31432};
        final String[] courseAcronyms = {"Ad", "Web-FE", "WEB-Be", "HC"};
        final int [][] studentGrades = {
            {15,18,17},
            {18,10,15},
            {11,13,15},
            {10,19,16}
        };
        
        final int [][] identityMatrix = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        
        Exercises.printGrades(studentNumbers, courseAcronyms, studentGrades);
    }
    
}
