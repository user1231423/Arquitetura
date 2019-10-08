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
public class CeaserCipherDecipher {
    public static char[] cypher(char [] encriptar, int shift){
        char[] retornar = new char [encriptar.length];
        for(int i = 0; i < encriptar.length; i++){
            retornar[i] = CharacterUtilities.lowerLetterSuccessorStepsOf(encriptar[i], shift);
        }
        return retornar;
    }
    
    public static char[] decipher(char [] desencriptar, int shift){
        char[] retornar = new char [desencriptar.length];
        for(int i = 0; i < desencriptar.length; i++){
            retornar[i] = CharacterUtilities.lowerLetterPredecessorStepsOf(desencriptar[i], 2);
        }
        return retornar;
    }
}
