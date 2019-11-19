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
public class Infantry extends FightingForce {
//Infantry inherits methods and variables from FightingForce

    //construtor por ommissão
    public Infantry() {
        super.setUnitAttack(25);
        super.setUnitDefense(75);
    }
    
    //construtor por parâmetros
    public Infantry(int attack, int defense) {
        super.setUnitAttack(attack);
        super.setUnitDefense(defense);
    }
    
}
