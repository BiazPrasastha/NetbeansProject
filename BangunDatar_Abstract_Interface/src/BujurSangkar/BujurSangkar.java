/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BujurSangkar;
import bangundatar.BangunDatar;
import  bangundatar.Resizeable;
/**
 *
 * @author Biaz Prasastha
 */
public class BujurSangkar extends BangunDatar implements Resizeable{
    public int sisiA, sisiB;
    
    public void BujurSangkar(int a, int t){
        this.sisiA = a;
        this.sisiB = t;
    }
    
    @Override
    public void hitungLuas(){
        this.luas = sisiA * sisiB;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = (4*(sisiA+sisiB));
    }
    @Override
    public void tampilData(){
        if(sisiA > sisiB){
        System.out.println("Luas BujurSangkar = " + luas);
        System.out.println("Keliling BujurSangkar = " + keliling);
        }
        else{
            System.out.println("Sisi A  adalah Sisi Panjang dan Sisi B adalah Sisi Lebar");
        }
    }
    @Override
    public void normal(){
        this.sisiA = sisiA ;
        this.sisiB = sisiB;
    }
    @Override
    public void perbesar(){
        this.sisiA = sisiA *2;        
        this.sisiB = sisiB *2;
    }
    
    @Override
    public void perkecil(){
        this.sisiA = sisiA /2;        
        this.sisiB = sisiB /2;
    }
    
}
