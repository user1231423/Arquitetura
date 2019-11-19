/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.army;

import java.util.Comparator;

/**
 *
 * @author joaogouveia
 */
public class attackPowerCompare implements Comparator<FightingForce> {
//class created for ordering arraylist
    
    @Override
    //compares two fightingforce elements
    public int compare(FightingForce force1, FightingForce force2) {
        //gets each attack value, and forces it to an int
        int force1AttackPower = (int) force1.getUnitAttack();
        int force2AttackPower = (int) force2.getUnitAttack();
        //if force1 < force2, returns 1;
        //if force1 == force2, returns 0;
        //if force1 > force2, returns -1;
        //1 means first is smaller, 0 they are equal, -1 first is bigger
        return force1AttackPower < force2AttackPower ? 1 : force1AttackPower == force2AttackPower ? 0 : -1;
    }
}
