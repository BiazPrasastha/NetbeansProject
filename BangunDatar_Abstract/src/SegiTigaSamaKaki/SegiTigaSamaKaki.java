/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegiTigaSamaKaki;
import bangundatar.BangunDatar;
/**
 *
 * @author Biaz Prasastha
 */
public class SegiTigaSamaKaki extends BangunDatar {
    public int sisiA, a, t;
    
    @Override
    public void hitungLuas(){
        this.luas = (a*t)/2;
    }
    
    @Override
    public void hitungKeliling(){
        double x = a*0.5;
        double sisiA = Math.sqrt(x*x+t*t);
        this.keliling = (2*sisiA)+a;
    }  
    @Override
    public void tampilData(){
    
        System.out.println("-----------------------------");
        System.out.println("Luas SegiTigaSamaKaki = "+luas);
        System.out.println("Keliling SegiTigaSamaKaki = "+keliling);
        System.out.println("\n");
    }
    
}
