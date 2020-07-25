/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sedan;
import kendaraan.Kendaraan;
import kendaraan.Sport;

/**
 *
 * @author biazprasastha
 */
public class Sedan extends Kendaraan implements Sport{
    private String platNo;

    public Sedan(String merk,String platNo){
        super(merk);
        this.platNo = platNo;
    }

    @Override
    public void displayData() {
        System.out.println("\t Sedan");
        System.out.println("Plat Nomor = "+platNo);
    }

    @Override
    public void tampilData() {
        displayData();
        System.out.println("BBM = "+BBM);
        System.out.println("Jumlah Kursi = "+jmlKursi);
        System.out.println("Jumlah Roda = "+jmlRoda);
        System.out.println("Jumlah Pintu = "+jmlPintu);
    }
    
}
