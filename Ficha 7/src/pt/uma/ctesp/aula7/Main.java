/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.aula7;
import pt.uma.ctesp.menu.Menu;
import java.util.Scanner;
import pt.uma.ctesp.menu.Menu.Options;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import pt.uma.ctesp.rational.Rational;
/**
 *
 * @author joaogouveia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu options = new Menu();
        //options.printMenu();
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma Opção: ");
        options.printMenu();
        String line = scanner.nextLine().toUpperCase();
        Options option = Menu.Options.valueOf(line);
        /*
        if(option == Options.START){
            System.out.println("Starting!!");
        }else if(option == Options.QUIT){
            System.out.println("Leaving game!!");
        }else if(option == Options.HIGH_SCORES){
            System.out.println("High scores list!");
        }else if(option == Options.LOAD_GAME){
            System.out.println("Loading!!!");
        }else if(option == Options.SAVE_GAME){
            System.out.println("Saving!!");
        }*/
        /*
        switch(option){
            case START:
                System.out.println("Starting!!");
                break;
            case QUIT:
                System.out.println("Leaving game!!");
                break;
            case HIGH_SCORES:
                System.out.println("High scores list!");
                break;
            case LOAD_GAME:
                System.out.println("Loading!!!");
                break;
            case SAVE_GAME:
                System.out.println("Saving!!");
                break;
        }*/
        ArrayList<Rational> rationals = new ArrayList<Rational>();

        Rational r1 = new Rational(31,2);
        Rational r2 = new Rational(2,5);
        Rational r3 = new Rational(3,6);
        Rational r4 = new Rational(12,5);
        
        rationals.add(r1);
        rationals.add(r2);
        rationals.add(r3);
        rationals.add(r4);
        System.out.println(Arrays.toString(rationals.toArray()));
        Collections.sort(rationals);
        System.out.println(Arrays.toString(rationals.toArray()));
    }
    
}
