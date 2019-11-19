/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.army;
/**
 *
 * @author Cláudio/João
 */
public abstract class FightingForce {
//class whose methods and variables are inherited

    public double attack, defense, luck, previousAttack;
    
    //construtor por omissão
    public FightingForce() {
        this.attack = 0.0;
        this.defense = 0.0;
        this.luck = 1.0;
        this.previousAttack = 1.0;
    }

    //construtor por parâmetros
    public FightingForce(double attack, double defense, double luck, double previousAttack) {
        this.attack = attack;
        this.defense = defense;
        this.luck = luck;
        this.previousAttack = previousAttack;
    }

    //gets attack value
    public double getUnitAttack() {
        return Math.round(attack);
    }

    //gets defense value
    public double getUnitDefense() {
        return Math.round(defense);
    }
    
    //sets the unit attack to a value passed with parameter
    public void setUnitAttack(double attack) {
        this.attack = attack;
    }

    //sets the unit defense to a value passed with parameter
    public void setUnitDefense(double defense) {
        this.defense = defense;
    }

    //sets the unit luck to a random value, and then multiplies that value with the attack value
    public void setLuck() {
        this.previousAttack = this.attack;
        this.luck = getRandomNumber(0,1);
        this.attack *= this.luck;
    }

    //sets unit attack value to previous, before luck is applied (reset to default)
    public void resetAttackValue(){
        this.attack = this.previousAttack;
    }

    //function that gives a random double between 1 and 0
    public double getRandomNumber(int min, int max) {
        return (Math.random() * ((1 - 0) + 0) + 0);
    }

}
