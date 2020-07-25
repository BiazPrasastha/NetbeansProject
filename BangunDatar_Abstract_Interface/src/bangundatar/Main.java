/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;
import SegiTigaSamaKaki.SegiTigaSamaKaki;
import SegiEmpat.SegiEmpat;
import Lingkaran.Lingkaran;
import BujurSangkar.BujurSangkar;
import LayangLayang.LayangLayang;
import BelahKetupat.BelahKetupat;
import SegiTigaSikuSiku.SegiTigaSikuSiku;
/**
 *
 * @author Biaz Prasastha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BujurSangkar bj = new BujurSangkar();
        bj.BujurSangkar(12,10);
        bj.normal();
        bj.hitungLuas();
        bj.hitungKeliling();
        bj.tampilData();
        bj.perkecil();
        bj.hitungLuas();
        bj.hitungKeliling();
        bj.tampilData();
        bj.BujurSangkar(12,10);
        bj.perbesar();
        bj.hitungLuas();
        bj.hitungKeliling();
        bj.tampilData();

        System.out.println("-------------------------------");
        
        Lingkaran li = new Lingkaran();
        li.Lingkaran(7);
        li.normal();
        li.hitungLuas();
        li.hitungKeliling();
        li.tampilData();
        li.perkecil();
        li.hitungLuas();
        li.hitungKeliling();
        li.tampilData();
        li.Lingkaran(7);
        li.perbesar();
        li.hitungLuas();
        li.hitungKeliling();
        li.tampilData();

        System.out.println("-------------------------------");

        
        BelahKetupat bk = new BelahKetupat();
        bk.BelahKetupat(12,12);
        bk.normal();
        bk.hitungLuas();
        bk.hitungKeliling();
        bk.tampilData();
        bk.perkecil();
        bk.hitungLuas();
        bk.hitungKeliling();
        bk.tampilData();
        bk.BelahKetupat(12,12);
        bk.perbesar();
        bk.hitungLuas();
        bk.hitungKeliling();
        bk.tampilData();
        
        System.out.println("-------------------------------");

        
        LayangLayang ll = new LayangLayang();
        ll.LayangLayang(6,16);
        ll.normal();
        ll.hitungLuas();
        ll.hitungKeliling();
        ll.tampilData();
        ll.perkecil();
        ll.hitungLuas();
        ll.hitungKeliling();
        ll.tampilData();
        ll.LayangLayang(6,4);
        ll.perbesar();
        ll.hitungLuas();
        ll.hitungKeliling();
        ll.tampilData();
        
        
        SegiEmpat se = new SegiEmpat();
        se.SegiEmpat(5);
        se.normal();
        se.hitungLuas();
        se.hitungKeliling();
        se.tampilData();
        se.perkecil();
        se.hitungLuas();
        se.hitungKeliling();
        se.tampilData();
        se.SegiEmpat(5);
        se.perbesar();
        se.hitungLuas();
        se.hitungKeliling();
        se.tampilData();
 
        System.out.println("-------------------------------");
        
        SegiTigaSamaKaki sk = new SegiTigaSamaKaki();
        sk.SegitigaSamaKaki(6,4);
        sk.normal();
        sk.hitungLuas();
        sk.hitungKeliling();
        sk.tampilData();
        sk.perkecil();
        sk.hitungLuas();
        sk.hitungKeliling();
        sk.tampilData();
        sk.SegitigaSamaKaki(6,4);
        sk.perbesar();
        sk.hitungLuas();
        sk.hitungKeliling();
        sk.tampilData();
 
        System.out.println("-------------------------------");
        
        SegiTigaSikuSiku ss = new SegiTigaSikuSiku();
        ss.SegitigaSikuSiku(5, 8);
        ss.normal();
        ss.hitungLuas();
        ss.hitungKeliling();
        ss.tampilData();
        ss.perkecil();
        ss.hitungLuas();
        ss.hitungKeliling();
        ss.tampilData();
        ss.SegitigaSikuSiku(5, 8);
        ss.perbesar();
        ss.hitungLuas();
        ss.hitungKeliling();
        ss.tampilData();
        
        System.out.println("-------------------------------");

    }
    
}
