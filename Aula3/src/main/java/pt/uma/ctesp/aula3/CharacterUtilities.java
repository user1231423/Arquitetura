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
public class CharacterUtilities {

    //Gets the code from given char
    public static int getCharCode(char letter) {
        int retornar = (int) letter;
        return retornar;
    }

    //Get the char from given code
    public static char getChar(int number) {
        char retornar = ' ';
        
        if (number > 122) { 
            int difference = number - 122;
            int returnNumber = 96 + difference;
            retornar = (char) returnNumber;
        }else{
            retornar = (char) number;
        }
        return retornar;
    }

    public static char lowerLetterSuccessorOf(char letter) {
        char retornar = letter;
        if (letter == 'z') {
            retornar = 'a';
        } else {
            ++retornar;
        }
        return retornar;
    }

    public static char lowerLetterPredecessorOf(char letter) {
        char retornar = letter;
        if (letter == 'a') {
            retornar = 'z';
        } else {
            --retornar;
        }
        return retornar;
    }

    public static char lowerLetterSuccessorStepsOf(char letter, int steps) {
        int codeReturn = 0;
        int code = getCharCode(letter);
        int sum = code + steps;
        if (sum > 122) {
        
        }
        codeReturn = code + steps;
        return getChar(codeReturn);
    }

    public static char lowerLetterpredecessorStepsOf(char letter, int steps) {

        return ' ';
    }

}
