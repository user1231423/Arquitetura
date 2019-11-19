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
public class defensePowerCompare implements Comparator<FightingForce>{
//class created for ordering arraylist

    @Override
    //compares two fightingforce elements
    public int compare(FightingForce force1, FightingForce force2) {
        //gets each defense value, and forces it to an int
        int force1DefencePower = (int) force1.getUnitDefense();
        int force2DefencePower = (int) force2.getUnitDefense();
        //if force1 < force2, returns -1;
        //if force1 == force2, returns 0;
        //if force1 > force2, returns 1;
        //1 means first is smaller, 0 they are equal, -1 first is bigger
        return force1DefencePower < force2DefencePower ? -1 : force1DefencePower == force2DefencePower ? 0 : 1;
        
   }
    
}