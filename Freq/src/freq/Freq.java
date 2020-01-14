/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freq;

/**
 *
 * @author joaogouveia
 */
public class Freq {

    public static boolean belongsTo(String word, char c) {
        boolean retornar = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                retornar = true;
            }
        }
        return retornar;
    }

    public static int count(String word, char c) {
        int retornar = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                retornar += 1;
            }
        }
        return retornar;
    }

    public static String countInWord(String word) {
        StringBuilder finalWord = new StringBuilder(0);
        int ammount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (belongsTo(finalWord.toString(), word.charAt(i)) == true) {
                i += 1;
            } else {
                ammount = count(word, word.charAt(i));
                if(ammount != 1){
                    finalWord.append(ammount);
                }
                finalWord.append(word.charAt(i));
            }
        }
        return finalWord.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DevicesList list = new DevicesList();
        CPU cpu1 = new CPU(8, 64, 2.5);
        CPU cpu2 = new CPU(16, 64, 2.5);
        MobileDevice device = new MobileDevice("Xiaomi", "A3", 2019, 123, cpu1);
        //System.out.println(device.toString());

        MobilePhone mobile = new MobilePhone("MEO", "5G", "Xiaomi", "A3", 2019, 123, cpu1);
        list.addDevice(mobile);
        //System.out.println(mobile.toString());

        Tablet tablet = new Tablet(true, "Xiaomi", "A3", 2019, 123, cpu2);
        list.addDevice(tablet);
        System.out.println(list.toString());
        System.out.println(list.orderByCpuPower());

        String ff = countInWord("TTTASSPPRRRR");
        System.out.println(ff);
    }

}
