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
    public static String cypher(String encriptar, int shift){
        char [] retornar = encriptar.toCharArray();
        for(int i = 0; i < retornar.length; i++){
            retornar[i] = CharacterUtilities.lowerLetterSuccessorStepsOf(retornar[i], shift);
        }
        return String.valueOf(retornar);
    }
    
    public static String decipher(String desencriptar, int shift){
        char [] retornar = desencriptar.toCharArray();
        for(int i = 0; i < retornar.length; i++){
            retornar[i] = CharacterUtilities.lowerLetterPredecessorStepsOf(retornar[i], shift);
        } 
        return String.valueOf(retornar);
    }
}
