/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.aula3;

/**
 *
 * @author joaogouveia
 */
public class Main {

    public static void main(String[] args) {
        /*int n = 3;
        add(n);
        //System.out.println(n);
        int[] numbers = {1,2,3,4};
        incrementFirstof(numbers);
        System.out.println(numbers[0]);*/
        //////////////////////////////////////////
        char carater = 'y';
        /*if (validChar(carater)) {
            System.out.println(CharacterUtilities.lowerLetterSuccessorOf(carater));
        }*/
        /*if(validChar(carater)){
            System.out.println(CharacterUtilities.lowerLetterPredecessorOf(carater));
        }*/
        if(validChar(carater)){
            System.out.println(CharacterUtilities.lowerLetterSuccessorStepsOf(carater, 2));
        }
        /*if(validChar(carater)){
            System.out.println(CharacterUtilities.lowerLetterpredecessorStepsOf(carater, 2));
        }*/
        
    }
    
    public static boolean validChar(char letter){
        boolean retornar = false;
        if (letter < 'a' || letter > 'z') {
            System.out.println("Inválido!!");
        } else{
            retornar = true;
        }
        return retornar;
    }
    /*static void incrementFirstof(int[] numbers){
        numbers[0]++;
    }
    
    static void add(int n) {
        n++;
        //System.out.println(n);
    }*/
}
