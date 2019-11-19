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
public class Catapults extends FightingForce {
//Catapults inherits methods and variables from FightingForce

    //construtor por ommissão
    public Catapults() {
        super.setUnitAttack(100);
        super.setUnitDefense(1);
    }
    
    //construtor por parâmetros
    public Catapults(int attack, int defense) {
        super.setUnitAttack(attack);
        super.setUnitDefense(defense);
    }

}