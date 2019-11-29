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

    private Army armyA;
    private Army armyB;

    public Game() {
        armyA = new Army();
        armyB = new Army();
    }

    public Army getArmyA() {
        return armyA;
    }

    public Army getArmyB() {
        return armyB;
    }

    public void setArmyA(Army army) {
        this.armyA = army;
    }

    public void setArmyB(Army army) {
        this.armyB = army;
    }

    public boolean exists() {
        if ((this.armyA.attackingForceSize() == 0 && this.armyA.defensiveForceSize() == 0) && (this.armyB.attackingForceSize() == 0 && this.armyB.defensiveForceSize() == 0)) {
            return false;
        }
        return true;
    }

    public void createArmies() {
        if (exists()) {
            boolean invalid = true;
            Scanner continuePlaying = new Scanner(System.in);
            while (invalid) {
                System.out.println("You already have an army this will delete him you want to continue? (Y/N)");
                String choice = continuePlaying.nextLine();
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
                    invalid = false;
                } else if ("n".equals(choice) || "N".equals(choice)) {
                    break;
                } else {
                    System.out.println("Invalid!");
                }
            }
        } else {
            this.armyA = new Army();
            this.armyB = new Army();
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

    public void inspectArmies() {
        this.armyA.inspectArmy();
        this.armyB.inspectArmy();
    }

    public void attack() {
        this.armyA.performAttack(this.armyB);
    }

}