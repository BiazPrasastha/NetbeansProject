/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabunganhb;

/**
 *
 * @author biazprasastha
 */
public class TestTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nHaji");
        Haji hj1 = new Haji();
        hj1.Junior("Biaz", 12121212, 6000000);
        hj1.simpanUang(150000);
        hj1.getSaldo();
        hj1.tarikUang(-1000000);
        hj1.getSaldo();
    }
    
}
