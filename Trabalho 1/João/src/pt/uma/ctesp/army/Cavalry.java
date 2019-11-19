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
public class Cavalry extends FightingForce {
//Cavalry inherits methods and variables from FightingForce

    //construtor por ommissão
    public Cavalry() {
        super.setUnitAttack(50);
        super.setUnitDefense(50);  
    }

    //construtor por parâmetros
    public Cavalry(int attack, int defense) {
        super.setUnitAttack(attack);
        super.setUnitDefense(defense);
    }
    
}