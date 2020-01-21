/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freq;

import java.util.Comparator;

/**
 *
 * @author joaogouveia
 */
public class CpuCoreCompare implements Comparator<MobileDevice>{

    @Override
    public int compare(MobileDevice device1, MobileDevice device2) {
        return device1.getCPU().getCores() < device2.getCPU().getCores() ? 1: device1.getCPU().getCores() == device2.getCPU().getCores() ? 0: -1;
    }
    
}
