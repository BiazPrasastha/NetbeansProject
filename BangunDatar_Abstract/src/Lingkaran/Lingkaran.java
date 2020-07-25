/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;
import bangundatar.BangunDatar;
/**
 *
 * @author Biaz Prasastha
 */
public class Lingkaran extends BangunDatar{
    public int r;
    public final double pi = 22/7;
    
    @Override
    public void hitungLuas(){
        if (r % 7 == 0){
            this.luas = pi*r*r;
        }
        else{
            this.luas = Math.PI*r*r;
        }
    }
    
    @Override
    public void hitungKeliling(){
        if (r % 7 == 0){
            this.keliling = 2*pi*r;
        }
        else{
            this.keliling = 2*Math.PI*r;
        }
    }
    @Override
    public void tampilData(){
        
        System.out.println("-----------------------------");
        System.out.println("Luas Lingkaran = "+luas);
        System.out.println("Keliling Lingkaran = "+keliling);
        System.out.println("\n");
    }
    
}
