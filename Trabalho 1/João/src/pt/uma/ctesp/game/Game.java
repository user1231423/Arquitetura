/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.game;

import java.util.Scanner;

import pt.uma.ctesp.army.*;
import static pt.uma.ctesp.play.Play.spaceGenerator;

/**
 *
 * @author Cláudio/João
 */
public class Game {

    //variables are armies class
    private Army armyA;
    private Army armyB;

    //construtor por omissão
    public Game() {
        armyA = new Army();
        armyB = new Army();
    }
    
    //gets army A
    public Army getArmyA() {
        return armyA;
    }
    
    //gets army B
    public Army getArmyB() {
        return armyB;
    }
    
    //sets army A
    public void setArmyA(Army army) {
        this.armyA = army;
    }

    //sets army B
    public void setArmyB(Army army) {
        this.armyB = army;
    }

    //check if armies exist
    public boolean exists() {
        if ((this.armyA.attackingForceSize() == 0 && this.armyA.defensiveForceSize() == 0) && (this.armyB.attackingForceSize() == 0 && this.armyB.defensiveForceSize() == 0)) {
            return false;
        }
        return true;
    }

    //create armies
    public void createArmies() {
        //if armies were already created
        if (exists()) {
            //boolean created
            boolean invalid = true;
            Scanner continuePlaying = new Scanner(System.in);
            while (invalid) {
                System.out.println("You already have an army this will delete him you want to continue? (Y/N)");
                String choice = continuePlaying.nextLine();
                //if Y, deletes previous armies and creates new ones
                if ("y".equals(choice) || "Y".equals(choice)) {
                    System.out.println("Create your new Army, notice that computer will also get a new one!!!");
                    this.armyA = new Army();
                    this.armyB = new Army();
                    Scanner scanner_A = new Scanner(System.in);

                    System.out.println("Insert Team name:");
                    String name_A = scanner_A.nextLine();
                    armyA.setName(name_A);
                    System.out.println(this.armyA.getName());
                    System.out.println("Army: (" + name_A + ")");
                    System.out.println("Build the attack-> ");
                    armyA.setArmyAttack();
                    System.out.println("Defense: ");
                    this.armyA.setArmyDefense();
                    // // //
                    this.armyB.createComputerArmy();
                    //set to false when both armies are created
                    invalid = false;
                    //if N, breaks
                } else if ("n".equals(choice) || "N".equals(choice)) {
                    break;
                } else {
                    System.out.println("Invalid!");
                }
            }
            //if armies weren't already created
        } else {
            //creates 2 instances of the army class
            this.armyA = new Army();
            this.armyB = new Army();
            //asks for input
            Scanner scanner_A = new Scanner(System.in);
            
            System.out.println("Insert Team name:");
            String name_A = scanner_A.nextLine();
            armyA.setName(name_A);
            spaceGenerator(10);
            System.out.println("Army: (" + name_A + ")");
            System.out.println("Build the attack-> ");
            armyA.setArmyAttack();
            spaceGenerator(10);
            System.out.println("Army: (" + name_A + ")");
            System.out.println("Build the Defense-> : ");
            this.armyA.setArmyDefense();
            // // //
            this.armyB.createComputerArmy();
        }
    }

    //inspects armies
    public void inspectArmies() {
        this.armyA.inspectArmy();
        this.armyB.inspectArmy();
    }
    
    //attack army
    public void attack() {
        this.armyA.performAttack(this.armyB);
    }

}