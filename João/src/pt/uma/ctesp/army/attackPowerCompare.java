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

    @Override
    public int compare(FightingForce force1, FightingForce force2) {
        int force1AttackPower = (int) force1.getUnitAttack();
        int force2AttackPower = (int) force2.getUnitAttack();

        return force1AttackPower < force2AttackPower ? 1 : force1AttackPower == force2AttackPower ? 0 : -1;
    }
}
