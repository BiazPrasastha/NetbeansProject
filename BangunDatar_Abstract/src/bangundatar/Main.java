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
        bj.sisiA = 12;
        bj.sisiB = 10;
        bj.hitungLuas();
        bj.hitungKeliling();
        bj.tampilData();
        
        Lingkaran li = new Lingkaran();
        li.r = 7;
        li.hitungLuas();
        li.hitungKeliling();
        li.tampilData();
        
        BelahKetupat bk = new BelahKetupat();
        bk.d1 = 12;
        bk.d2 = 12;
        bk.hitungLuas();
        bk.hitungKeliling();
        bk.tampilData();
        
        LayangLayang ll = new LayangLayang();
        ll.d1 = 6;
        ll.d2 = 16;
        ll.hitungLuas();
        ll.hitungKeliling();
        ll.tampilData();
        
        SegiEmpat se = new SegiEmpat();
        se.sisi = 5;
        se.hitungLuas();
        se.hitungKeliling();
        se.tampilData();
        
        SegiTigaSamaKaki sk = new SegiTigaSamaKaki();
        sk.a = 6;
        sk.t = 5;
        sk.hitungLuas();
        sk.hitungKeliling();
        sk.tampilData();
        
        SegiTigaSikuSiku ss = new SegiTigaSikuSiku();
        ss.a = 5;
        ss.t = 8;
        ss.hitungLuas();
        ss.hitungKeliling();
        ss.tampilData();
    }
    
}
