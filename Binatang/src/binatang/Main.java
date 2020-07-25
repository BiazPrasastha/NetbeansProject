/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binatang;

import Beruang.Beruang;
import Gajah.Gajah;
import Kucing.Kucing;
import Macan.Macan;
import Tikus.Tikus;

/**
 *
 * @author biazprasastha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beruang br = new Beruang("Supri", 4, "Aung Aung", "Putih");
        br.displayData();
        Kucing kc = new Kucing("Kocheng Oren", 4, "Meong", "Oren");
        kc.displayData();
        Gajah gj = new Gajah("Feri", 4, "Mbek", "Nggak Ada Bulu");
        gj.displayData();
        Macan mc = new Macan("Toyib", 4, "Maung", "Loreng");
        mc.displayData();
        Tikus tk = new Tikus("Didi", 4, "Cit CIt", "Putih Albino");
        tk.displayData();
        
    }
    
}
