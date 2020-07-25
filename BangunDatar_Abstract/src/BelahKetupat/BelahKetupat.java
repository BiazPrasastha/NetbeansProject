/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelahKetupat;
import bangundatar.BangunDatar;
/**
 *
 * @author Biaz Prasastha
 */
public class BelahKetupat extends BangunDatar{
    public int sisi, d1, d2;
    
    @Override 
    public void hitungLuas(){
        this.luas = (d1*d2)/2;
    }
    
    @Override
    public void hitungKeliling(){
        double x = d1*0.5;
        double z = d2*0.5;
        double sisi = Math.sqrt(x*x+z*z);
        this.keliling = (4*sisi);
    }
    
    @Override
    public void tampilData(){
     
        System.out.println("-----------------------------");
        System.out.println("Luas BelahKetupat = "+luas);
        System.out.println("Keliling BelahKetupat = "+keliling);
        System.out.println("\n");   
    }
}
