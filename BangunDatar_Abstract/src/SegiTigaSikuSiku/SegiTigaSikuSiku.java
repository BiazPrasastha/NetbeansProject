/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegiTigaSikuSiku;
import bangundatar.BangunDatar;
/**
 *
 * @author Biaz Prasastha
 */
public class SegiTigaSikuSiku extends BangunDatar{
    public int sisiA, a, t;
    
    @Override
    public void hitungLuas(){
        this.luas = (a*t)/2;
    }
    
    @Override
    public void hitungKeliling(){
        double sisiA = Math.sqrt(a*a+t*t);
        this.keliling = a+t+sisiA;
    } 
    @Override
    public void tampilData(){
        System.out.println("-----------------------------");
        System.out.println("Luas SegiTigaSikuSiku = "+luas);
        System.out.println("Keliling SegiTigaSikuSiku = "+keliling);
        System.out.println("\n");
    }
    
}
