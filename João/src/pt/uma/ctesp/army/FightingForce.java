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

    public double attack, defense, luck, previousAttack;

    public FightingForce() {
        this.attack = 0.0;
        this.defense = 0.0;
        this.luck = 1.0;
        this.previousAttack = 1.0;
    }

    public FightingForce(double attack, double defense, double luck, double previousAttack) {
        this.attack = attack;
        this.defense = defense;
        this.luck = luck;
        this.previousAttack = previousAttack;
    }

    public double getUnitAttack() {
        return Math.round(attack);
    }

    public double getUnitDefense() {
        return (int) defense;
    }
    
    public void setUnitAttack(double attack) {
        this.attack = attack;
    }

    public void setUnitDefense(double defense) {
        this.defense = defense;
    }

    public void setLuck() {
        this.previousAttack = this.attack;
        this.luck = getRandomNumber(0,1);
        this.attack *= this.luck;
    }

    public void resetAttackValue(){
        this.attack = this.previousAttack;
    }
        
    public double getRandomNumber(int min, int max) {
        return (Math.random() * ((1 - 0) + 0) + 0);
    }

}
