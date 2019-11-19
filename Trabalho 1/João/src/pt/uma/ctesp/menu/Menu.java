/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.menu;

/**
 *
 * @author Cláudio/João
 */
public class Menu {
    
    //Create options
    public enum Option {
      //create_army, inspect_army, play, exit
        CE, IE, DE, P, E;
    }
    
    //Show menu options
    public void showOptions(){
         for(Option o : Option.values()){
            System.out.println(o);
        }
    }
    
}