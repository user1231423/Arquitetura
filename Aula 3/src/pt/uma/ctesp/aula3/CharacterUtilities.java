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
            int returnNumber = 97 + difference;
            retornar = (char) returnNumber;
        } else if (number < 97) {
            int difference = 97 - number;
            int returnNumber = 122 - difference;
            retornar = (char) returnNumber;
        } else {
            retornar = (char) number;
        }
        return retornar;
    }

    public static char lowerLetterSuccessorOf(char letter) {
        char retornar = letter;
        int x = getCharCode(letter);
        System.out.println(x + 2);
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
        codeReturn = code + steps;
        return getChar(codeReturn);
    }

    public static char lowerLetterPredecessorStepsOf(char letter, int steps) {
        int codeReturn = 0;
        int code = getCharCode(letter);
        codeReturn = code - steps;
        return getChar(codeReturn);
    }

    public static int ocorrencesOfCharacterIn(char[] letras, char encontrar) {
        int repeticoes = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == encontrar) {
                repeticoes++;
            }
        }
        return repeticoes;
    }

    public static int indexOf(char[] letras, char encontrar) {
        int retornar = -1;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == encontrar) {
                retornar = i;
                break;
            }
        }
        return retornar;
    }

    public static char[] replaceCharacterIn(char[] letras, char substituto, char novo) {
        int index = indexOf(letras, substituto);
        if (index != -1) {
            letras[index] = novo;
        } else {
            System.out.println("Letra não existente no array!");
        }
        return letras;
    }

    public static char[] concatenationOf(char[] array1, char[] array2) {
        int length = array1.length + array2.length;
        char[] retornar = new char[length];
        int left = 0;
        for (int i = 0; i < array1.length; i++) {
            retornar[i] = array1[i];
            left = i;
        }
        left++;
        for (int x = 0; x < array2.length; x++) {
            retornar[left + x] = array2[x];
        }
        return retornar;
    }

    public static char[] copyOfPartOf(char[] letras, int inicio, int fim) {
        char[] retornar = new char[(fim - inicio) + 1];
        if ((inicio >= fim) || (fim > letras.length) ) {
            System.out.println("Operação inválida!");
        } else {
            for (int i = 0; i < retornar.length; i++) {
                if ((i >= inicio) || (i < fim)) {
                    retornar[i] = letras[i];
                } else {
                    continue;
                }
            }
        }
        return retornar;
    }
}
