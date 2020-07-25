/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUV;
import kendaraan.Kendaraan;
import kendaraan.Pribadi;

/**
 *
 * @author biazprasastha
 */
public class SUV extends Kendaraan implements Pribadi{
    private String platNo;

    public SUV(String merk,String platNo){
        super(merk);
        this.platNo = platNo;
    }

    @Override
    public void displayData() {
        System.out.println("\t SUV");
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
