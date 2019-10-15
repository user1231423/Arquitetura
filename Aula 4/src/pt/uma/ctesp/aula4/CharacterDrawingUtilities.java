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
public class CharacterDrawingUtilities {

    public static void drawElement(char letra) {
        System.out.print(letra);
    }

    public static void drawNewLine() {
        System.out.println("");
    }

    public static void drawHorizontalSegmentWith(char letra) {
        for (int i = 0; i < 10; i++) {
            drawElement(letra);
        }
    }

    public static void drawFilledRectangelWith(int altura, int largura, char letra) {
        for (int i = 0; i < altura; i++) {
            if (i != 0) {
                drawNewLine();
            }
            for (int x = 0; x < largura; x++) {
                drawElement(letra);
            }
        }
        drawNewLine();
    }
    
    public static void drawEmptyRectangleWith(int altura, int largura, char letra) {
        for (int i = 0; i < altura; i++) {
            if (i != 0) {
                drawNewLine();
            }
            for (int x = 0; x < largura; x++) {
                if((i == 0) || (i == (altura - 1))){
                    drawElement(letra);                
                }else if( (x == 0) || (x == (largura - 1))){
                    drawElement(letra);
                }else{
                    drawElement(' ');
                }
            }
        }
        drawNewLine();
    }
}
