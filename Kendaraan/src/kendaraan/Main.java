/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

import MiniBus.MiniBus;
import SUV.SUV;
import Sedan.Sedan;

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
        Sedan sd1 = new Sedan("MustiBisha", "AA Njay UU");
        sd1.tampilData();
        MiniBus mb1 = new MiniBus("Toyota", "AA 1515 XX");
        mb1.tampilData();
        SUV sv1 = new SUV("Toyota Fortuner", "AA KU ZZ");
        sv1.tampilData();
    }
    
}
