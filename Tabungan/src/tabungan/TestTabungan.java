/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;

/**
 *
 * @author biazprasastha
 */
public class TestTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tabungan");
        Tabungan tb1 = new Tabungan("Biaz", 1212120);
        tb1.setSaldoMin(10000);
        tb1.setSetoranMin(5000);
        tb1.setSaldo(5000);
        tb1.simpanUang(10000);
        tb1.getSaldo();
        System.out.println("\nSimpanan");
        Simpanan sp1 = new Simpanan();
        sp1.Simpanan("Biaz", 12121212, 500000);
        sp1.simpanUang(6000);
        sp1.getSaldo();
        sp1.tarikUang(-500000);
        sp1.getSaldo();
        System.out.println("\nJunior");
        Junior jr1 = new Junior();
        jr1.Junior("Biaz", 12121212, 6000000);
        jr1.simpanUang(56000);
        jr1.getSaldo();
        jr1.tarikUang(-1500000);
        jr1.getSaldo();
    }
    
}
