/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegiEmpat;
import bangundatar.BangunDatar;
import bangundatar.Resizeable;
/**
 *
 * @author Biaz Prasastha
 */
public class SegiEmpat extends BangunDatar implements Resizeable{
    public int sisi;
    
    public void SegiEmpat(int s){
        sisi = s;
    }
   
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
        System.out.println("Luas SegiEmpat = "+luas);
        System.out.println("Keliling SegiEmpat = "+keliling);
        System.out.println("\n");
        
    }
   @Override
    public void normal(){
        this.sisi = sisi;
    }
    @Override
    public void perbesar(){
        this.sisi = sisi*2;
    }
    
    @Override
    public void perkecil(){
        this.sisi = sisi/2;
    } 
}
