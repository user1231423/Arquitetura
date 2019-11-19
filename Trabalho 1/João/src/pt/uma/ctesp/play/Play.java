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
    
    //simple function to generate spaces, since we can't 'clear the console'
    public static void spaceGenerator(int spaces) {
        for (int i = 1; i <= spaces; i++) {
            System.out.println();
        }
    }
      
    //function to check for a string in an array
    public static boolean checkArray(String item, String[] Array) {
        for (String array_item : Array) {
            if (array_item.equals(item)) {
                return true;
            }
        }
        return false;
    }

    //creates a new instance of the menu class
    public static void menuOption (Game game) {
       
        Menu options = new Menu();

        //boolean representing if the game is running or not
        boolean running = true;

        while (running) {
            //while it is...
            spaceGenerator(3);
            //creates new scanner class instance
            Scanner scanner = new Scanner(System.in);
            //outputs this
            System.out.println("Escolha uma Opção: ");
            //shows options
            options.showOptions();
            spaceGenerator(2);
            //assigns next line input to variable line
            String line = scanner.nextLine().toUpperCase();
            //accepted options
            String[] possible_options = {"ce", "CE", "ie", "IE", "DE", "de", "p", "P", "e", "E"};
            //while the input is not found in the array of acceptable options (not accepted)
            while (!checkArray(line, possible_options)) {
                spaceGenerator(3);
                //prints error
                System.out.println("Incorrect option choice!");
                //shows menu again
                options.showOptions();
                //asks for input again
                line = scanner.nextLine().toUpperCase();
            }
            //if input is accepted, that menu option is executed
            Option option = Menu.Option.valueOf(line);
           
            //what happens with each option
            switch (option) {
                case CE:
                    //if option is CE (create army)
                    spaceGenerator(10);
                    System.out.println("Create it is!");
                    //calls game class method createArmies()
                    game.createArmies();
                    break;
                    //end
                case IE:
                    //if there are armies created (method exists())
                    if(game.exists()){
                        System.out.println("Inspect it is!");
                        game.getArmyA().inspectArmy();
                        //prints results of first army inspection
                        game.getArmyB().inspectArmy();
                        //prints results of second army inspection
                    }else{
                        System.out.println("You don't have any armies created!!");
                    }
                    break;
                case DE:
                    //if there are armies created (method exists())
                    if(game.exists()){
                        game.getArmyA().detailedInspection();
                        //prints results of first army inspection (detailed)
                        game.getArmyB().detailedInspection();
                        //prints results of second army inspection (detailed)
                    }else{
                        //prints error message
                        System.out.println("You don't have any armies created!!");
                    }
                    break;
                case P:
                    //if there are armies created (method exists())
                    if(game.exists()){
                        System.out.println("Play it is! And should always be!");
                        //call attack method of game class
                        game.attack();
                        //creates a variable invalid, true
                        boolean invalid = true;
                        //asks for user input
                        Scanner continuePlaying = new Scanner(System.in);
                        //after playing
                        while (invalid) {
                            System.out.println("Do you want to contiue playing? (Y/N)");
                            //choose yes or no
                            String choice = continuePlaying.nextLine();
                            //if Y
                            if("y".equals(choice) || "Y".equals(choice)){
                                //create new game
                                game = new Game();
                                //reset variable
                                invalid = false;
                                //if N
                            } else if("n".equals(choice) || "N".equals(choice)){
                                //say proper goodbye
                                System.out.println("Bye!!");
                                //update variables
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
                    //generate spaces
                    spaceGenerator(10);
                    //say proper goodbye
                    System.out.println("Bye!!");
                    //no longer running
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