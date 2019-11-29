/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.play;
import java.util.Scanner;
import pt.uma.ctesp.game.*;
import pt.uma.ctesp.menu.*;
import pt.uma.ctesp.menu.Menu.Option;

/**
 *
 * @author Cláudio/João
 */
public class Play {

    public static void spaceGenerator(int spaces) {
        for (int i = 1; i <= spaces; i++) {
            System.out.println();
        }
    }
   
    public static boolean checkArray(String item, String[] Array) {
        for (String array_item : Array) {
            if (array_item.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static void menuOption (Game game) {
       
        Menu options = new Menu();

        boolean running = true;

        while (running) {
            spaceGenerator(3);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma Opção: ");
            options.showOptions();
            spaceGenerator(2);
            String line = scanner.nextLine().toUpperCase();
            String[] possible_options = {"ce", "CE", "ie", "IE", "DE", "de", "p", "P", "e", "E"};
            while (!checkArray(line, possible_options)) {
                spaceGenerator(3);
                System.out.println("Incorrect option choice!");
                options.showOptions();
                line = scanner.nextLine().toUpperCase();
            }
            Option option = Menu.Option.valueOf(line);
           
            switch (option) {
                case CE:
                    spaceGenerator(10);
                    System.out.println("Create it is!");
                    game.createArmies();
                    break;
                case IE:
                    if(game.exists()){
                        System.out.println("Inspect it is!");
                        game.getArmyA().inspectArmy();
                        game.getArmyB().inspectArmy();
                    }else{
                        System.out.println("You don't have any armies created!!");
                    }
                    break;
                case DE:
                    if(game.exists()){
                        game.getArmyA().detailedInspection();
                        game.getArmyB().detailedInspection();
                    }else{
                        System.out.println("You don't have any armies created!!");
                    }
                    break;
                case P:
                    if(game.exists()){
                        System.out.println("Play it is! And should always be!");
                        game.attack();
                        boolean invalid = true;
                        Scanner continuePlaying = new Scanner(System.in);
                        while (invalid) {
                            System.out.println("Do you want to contiue playing? (Y/N)");
                            String choice = continuePlaying.nextLine();
                            if("y".equals(choice) || "Y".equals(choice)){
                                game = new Game();
                                invalid = false;
                            } else if("n".equals(choice) || "N".equals(choice)){
                                System.out.println("Bye!!");
                                running = false;
                                invalid = false;
                            }else{
                                System.out.println("Invalid!");
                            }
                        }
                    }else{
                        System.out.println("You don't have any armies created!!");
                    }
                    break;
                case E:
                    spaceGenerator(10);
                    System.out.println("Bye!!");
                    running = false;
                    break;
            }
        }
    }
   
    public static void main(String[] args) {
        Game game = new Game();
        menuOption(game);
    }      
}