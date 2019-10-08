/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.aula3;

/**
 *
 * @author JEVG
 */
public class EncDec {

        public static char successorSteps(char letter, int steps) {
        int codeReturn = 0;
        int code = getCharCode(letter);
        codeReturn = code + steps;
        return getChar(codeReturn);
    }

    public static char predecessorSteps(char letter, int steps) {
        int codeReturn = 0;
        int code = getCharCode(letter);
        codeReturn = code - steps;
        return getChar(codeReturn);
    }

    public static String encrypt(String txt, int shift){
    char [] retornar = txt.toCharArray();
    return String.valueOf(retornar);
    }
    
}
