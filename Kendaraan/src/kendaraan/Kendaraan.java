/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author biazprasastha
 */
public abstract class Kendaraan {

    public String merk;
    
    public Kendaraan(String Merk){
        this.merk = Merk;
    }
    public void displayData(){
        System.out.println("Merk : "+merk);
        
    }
}
