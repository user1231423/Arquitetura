/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.menu;

/**
 *
 * @author joaogouveia
 */
public class Menu {
    public enum Options{
        START, SAVE_GAME, LOAD_GAME, HIGH_SCORES, QUIT;
    }
    
    public void printMenu(){
        for(Options opt: Options.values()){
            System.out.println(opt);
        }
    }    
    
}
