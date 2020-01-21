/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freq;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author joaogouveia
 */
public class DevicesList {
    private ArrayList <MobileDevice> devices;

    public DevicesList() {
        this.devices = new ArrayList<>();
    }
    
    public void addDevice(MobileDevice device){
        this.devices.add(device);
    }
    
    public void getDevices(){
        for(MobileDevice device: this.devices){
            System.out.println(device.toString());
        }
    }
    
    public void orderByCpuPower(){
        Collections.sort(devices, new CpuCoreCompare());
    }

}
