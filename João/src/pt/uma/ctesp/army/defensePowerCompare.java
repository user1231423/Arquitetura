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

    @Override
    public int compare(FightingForce force1, FightingForce force2) {
        int force1DefencePower = (int) force1.getUnitDefense();
        int force2DefencePower = (int) force2.getUnitDefense();
        
        return force1DefencePower < force2DefencePower ? -1 : force1DefencePower == force2DefencePower ? 0 : 1;
        
   }
    
}