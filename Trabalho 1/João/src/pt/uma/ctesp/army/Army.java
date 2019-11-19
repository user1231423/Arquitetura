/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.army;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cláudio/João
 */
public class Army {
    
    private ArrayList<FightingForce> attackForce;
    private ArrayList<FightingForce> defenseForce;
    private int availableUnits;
    private String name;
   
    //construtor por omissão
    public Army() {
        this.attackForce = new ArrayList<>();
        this.defenseForce = new ArrayList<>();
        this.availableUnits = 100;
    }

    //gets variable availableUnits
    public int getAvailableUnits() {
        return this.availableUnits;
    }

    //sets variable avaliableUnits (by parameter)
    public void setAvailableUnits(int new_amount) {
        this.availableUnits = new_amount;
    }

    //gets variable name
    public String getName() {
        return this.name;
    }

    //sets variable name (by parameter)
    public void setName(String name) {
        this.name = name;
    }
    
    //gets ArrayList attackForce size
    public int attackingForceSize() {
        return this.attackForce.size();
    }

    //gets ArrayList defenseForce size
    public int defensiveForceSize() {
        return this.defenseForce.size();
    }
   
    //calculates army attack power (total attack value)
    private int getArmyAttackPower() {
        int retornar = 0;
        //for each unit in arraylist
        for (FightingForce force : attackForce) {
            //sum its attack value to variable 'retornar'
            retornar += force.getUnitAttack();
        }
        return retornar;
    }

    //calculates army defense power (total attack value)
    private int getArmyDefensePower() {
        int retornar = 0;
        //for each unit in arraylist
        for (FightingForce force : defenseForce) {
            //sum its defense value to variable 'retornar'
            retornar += force.getUnitDefense();
        }
        return retornar;
    }
    
    //return random number between 0 and number
    private static int getRandomNumber(int number) {
        Random r = new Random();
        return r.nextInt(number-0) + 0;
    }

    //organizes number of each unit in an array
    private int[] getAttackUnitsAmount() {
        int[] retornar = {0, 0, 0};
        for (FightingForce force : attackForce) {
            //identifying each by their defense values (never changing)
            switch ((int) force.getUnitDefense()) {
                case 75:
                    retornar[0] += 1;
                    break;
                case 50:
                    retornar[1] += 1;
                    break;
                case 1:
                    retornar[2] += 1;
                    break;
                default:
                    break;
            }
        }
        return retornar;
    }

    //organizes number of each unit in an array
    private int[] getDefenseUnitsAmount() {
        int[] retornar = {0, 0, 0};
        for (FightingForce force : defenseForce) {
            //identifying each by their defense values (never changing)
            switch ((int) force.getUnitDefense()) {
                case 75:
                    retornar[0] += 1;
                    break;
                case 50:
                    retornar[1] += 1;
                    break;
                case 1:
                    retornar[2] += 1;
                    break;
                default:
                    break;
            }
        }
        return retornar;
    }

    //add an attack unit
    public void addAttackUnit(FightingForce unit) {
        this.attackForce.add(unit);
    }

    //add a defense unit
    public void addDefenseUnit(FightingForce unit) {
        this.defenseForce.add(unit);
    }

    //get variable attackForce (arraylist)
    public ArrayList<FightingForce> getAttackForce() {
        return this.attackForce;
    }

    //get variable defenseforce (arraylist)
    public ArrayList<FightingForce> getDefenseForce() {
        return this.defenseForce;
    }

    //receives and validates amounts chosen for each unit
    private int inputAmmount(String type) {
        int spaceAvailable = this.availableUnits;
        Scanner scanner = new Scanner(System.in);
        int ammount = 0;
        boolean invalid = true;

        if (spaceAvailable == 0) {
            System.out.println("No more space for " + type);
        } else {
            while (invalid) {
                System.out.println(type + " : (" + spaceAvailable + " spaces available)");
                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a number, please insert one: ");
                    scanner.next();
                }
                ammount = scanner.nextInt();
                if (ammount > spaceAvailable) {
                    System.out.println("You inserted " + ammount + " but you only have " + spaceAvailable);
                } else if (ammount < 0) {
                    System.out.println("Please insert a number between 0 and " + spaceAvailable);
                } else {
                    invalid = false;
                    this.availableUnits -= ammount;
                    return ammount;
                }
            }
        }
        //updates available units
        this.availableUnits -= ammount;
        return ammount;
    }

    //sets attack from input
    public void setArmyAttack() {
        
        //Ask for infantry ammount
        int infantryAmmout = inputAmmount("Infantry");
        for (int i = 0; i < infantryAmmout; i++) {
            this.addAttackUnit(new Infantry());
        }

        //Ask for cavalry ammount
        int cavalryAmmount = inputAmmount("Cavalary");
        for (int x = 0; x < cavalryAmmount; x++) {
            this.addAttackUnit(new Cavalry());
        }

        //Ask for catapults ammount
        int catapultAmmount = inputAmmount("Catapults");
        for (int x = 0; x < catapultAmmount; x++) {
            this.addAttackUnit(new Catapults());
        }
        //this.availableUnits = 100;
    }

    //sets defense from input
    public void setArmyDefense() {
        //Ask for infantry ammount
        int infantryAmmout = inputAmmount("Infantry");
        for (int i = 0; i < infantryAmmout; i++) {
            this.addDefenseUnit(new Infantry());
        }

        //Ask for cavalry ammount
        int cavalryAmmount = inputAmmount("Cavalary");
        for (int x = 0; x < cavalryAmmount; x++) {
            this.addDefenseUnit(new Cavalry());
        }

        //Ask for catapults ammount
        int catapultAmmount = inputAmmount("Catapults");
        for (int x = 0; x < catapultAmmount; x++) {
            this.addDefenseUnit(new Catapults());
        }
        //this.availableUnits = 100;
    }

    //generates and validates amounts for each unit
    private int randomAmmout() {
        int spaceAvailable = this.availableUnits;
        int ammount = 0;
        boolean invalid = true;

        if (spaceAvailable == 0) {
            return 0;
        } else {
            while (invalid) {
                ammount = getRandomNumber(spaceAvailable);
                if (ammount < spaceAvailable) {
                    invalid = false;
                    this.availableUnits -= ammount;
                    return ammount;
                } else {
                    ammount = getRandomNumber(spaceAvailable);
                }
            }
        }
        this.availableUnits -= ammount;
        return ammount;
    }

    //creates the computer army
    public void createComputerArmy() {
        this.setName("Computer");
        this.setAvailableUnits(50);
        //------------------    Computer attack    --------------------
        int attackInfantryAmmout = randomAmmout();
        for (int i = 0; i < attackInfantryAmmout; i++) {
            this.addAttackUnit(new Infantry());
        }

        int attackCavalryAmmount = randomAmmout();
        for (int x = 0; x < attackCavalryAmmount; x++) {
            this.addAttackUnit(new Cavalry());
        }

        int attackCatapultAmmount = randomAmmout();
        for (int x = 0; x < attackCatapultAmmount; x++) {
            this.addAttackUnit(new Catapults());
        }
       
        this.setAvailableUnits(50 + this.availableUnits);          
        //------------------    Computer defense    --------------------
        int defenseInfantryAmmout = randomAmmout();
        for (int i = 0; i < defenseInfantryAmmout; i++) {
            this.addDefenseUnit(new Infantry());
        }

        int defenseCavalryAmmount = randomAmmout();
        for (int x = 0; x < defenseCavalryAmmount; x++) {
            this.addDefenseUnit(new Cavalry());
        }

        int defenseCatapultAmmount = randomAmmout();
        for (int x = 0; x < defenseCatapultAmmount; x++) {
            this.addDefenseUnit(new Catapults());
        }
    }

    //function that returns the result of each inspection, prettier
    public void inspectArmy() {
        int[] attackingUnitsAmmout = this.getAttackUnitsAmount();
        int[] defendingUnitsAmmout = this.getDefenseUnitsAmount();
        System.out.println("Inspection Results Of " + this.name + ":");
        System.out.println("----------------------- Attacking -------------------------------");
        System.out.println(this.name + " has " + attackingUnitsAmmout[0] + " attacking infantry units!");
        System.out.println(this.name + " has " + attackingUnitsAmmout[1] + " attacking cavalry units!");
        System.out.println(this.name + " has " + attackingUnitsAmmout[2] + " attacking catapult units!");
        System.out.println("----------------------- Defending -------------------------------");
        System.out.println(this.name + " has " + defendingUnitsAmmout[0] + " defending infantry units!");
        System.out.println(this.name + " has " + defendingUnitsAmmout[1] + " defending cavalry units!");
        System.out.println(this.name + " has " + defendingUnitsAmmout[2] + " defending catapult units!");
        System.out.println("------------------------------------------------------");
        System.out.println("Total amount of " + this.getArmyAttackPower() + " (attack) and " + this.getArmyDefensePower() + " (defense)");
    }
   
    //function that returns the result of each inspection, detailed (each unit and attack and defense values)
    public void detailedInspection(){
        System.out.println("Inspection Results Of " + this.name + ":");
        this.orderAttackUnits();
        this.orderDefenceUnits();
        System.out.println("----------------------- Attacking -------------------------------");
        for(FightingForce force: attackForce){
            System.out.println(force.getUnitAttack() + " / " + force.getUnitDefense());
        }
        System.out.println("----------------------- Defending -------------------------------");
        for(FightingForce force: defenseForce){
            System.out.println(force.getUnitAttack() + " / " + force.getUnitDefense());
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Total amount of " + this.getArmyAttackPower() + " (attack) and " + this.getArmyDefensePower() + " (defense)");
    }

    //for each unit in arraylist, reset its attack (remove luck)
    public void reset(){
        for(FightingForce force: attackForce){
            force.resetAttackValue();
        }
    }
    
    //order defense units, from weaker to stronger
    private void orderDefenceUnits() {
        Collections.sort(defenseForce, new defensePowerCompare());
    
    }
   //order attack units, from stronger to weaker
    private void orderAttackUnits(){
        Collections.sort(attackForce, new attackPowerCompare());
    }

    //remove dead units
    public void removeKilledUnits(int remaining) {
        //remaining is the damage taken
        //orders them
        orderDefenceUnits();
        //while total defense value is bigger than the remaining
        while (this.getArmyDefensePower() > remaining) {
            //iterates through defense arraylist, and removes units
            for (int i = 0; i < defenseForce.size(); i++) {
                defenseForce.remove(i);
                //breaks loop when total defense value is equal or less than remaining
                if (this.getArmyDefensePower() <= remaining) {
                    break;
                }
            }
            //orders the arraylist again
            orderDefenceUnits();
        }
    }

    //sets luck for all units in attack arraylist
    public void setAttackLuck() {
        for (FightingForce force : attackForce) {
            force.setLuck();
        }
    }
    
    //performs attack
    public void performAttack(Army Other) {
        //cont  is for rounds
        int cont = 0;
        while (this.getArmyDefensePower() > 0 || Other.getArmyDefensePower() > 0) {
            cont += 1;
            System.out.println("----------------------------------------");
            System.out.println("Round " + cont);
            //sets luck for both
            this.setAttackLuck();
            Other.setAttackLuck();
            //calculates remaining defense for each
            int otherRemainingDefencePower = Other.getArmyDefensePower() - this.getArmyAttackPower();
            int thisRemainingDefencePower = this.getArmyDefensePower() - Other.getArmyAttackPower();

            System.out.println("Player dealt: " + this.getArmyAttackPower());
            System.out.println("Computer remaining defense: " + otherRemainingDefencePower);
            System.out.println("Computer dealt: " + Other.getArmyAttackPower());
            System.out.println("Player remaining defense: " + thisRemainingDefencePower);

            //resets attack values
            this.reset();
            Other.reset();
           
            //checks if an army has lost (defense below 0)
            if(thisRemainingDefencePower <= 0 || otherRemainingDefencePower <= 0){
                if(thisRemainingDefencePower > otherRemainingDefencePower){
                    System.out.println("Player won the game!!");
                    System.out.println("----------------------------------------");
                    Other.defenseForce.clear();
                    this.removeKilledUnits(thisRemainingDefencePower);
                    break;
                }else{
                    System.out.println("Computer won the game!!");
                    System.out.println("----------------------------------------");
                    this.defenseForce.clear();
                    Other.removeKilledUnits(otherRemainingDefencePower);
                    break;        
                }
            }else{
                this.removeKilledUnits(thisRemainingDefencePower);
                Other.removeKilledUnits(otherRemainingDefencePower);  
            }          
        }
    }
}
