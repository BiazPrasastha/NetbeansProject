/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegiEmpat;
import bangundatar.BangunDatar;
/**
 *
 * @author Biaz Prasastha
 */
public class SegiEmpat extends BangunDatar{
    public int sisi;
    
    @Override
    public void hitungLuas(){
        this.luas = (sisi*sisi);
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = (4*sisi);
    }
    @Override
    public void tampilData(){
        System.out.println("-----------------------------");
        System.out.println("Luas SegiEmpat = "+luas);
        System.out.println("Keliling SegiEmpat = "+keliling);
        System.out.println("\n");
        
    }
    
}
