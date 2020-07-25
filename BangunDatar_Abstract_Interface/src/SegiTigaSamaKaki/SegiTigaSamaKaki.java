/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegiTigaSamaKaki;
import bangundatar.BangunDatar;
import  bangundatar.Resizeable;
/**
 *
 * @author Biaz Prasastha
 */
public class SegiTigaSamaKaki extends BangunDatar implements Resizeable{
    public int sisiA, a, t;

    public void SegitigaSamaKaki(int a, int t){
        this.a = a;
        this.t = t;
    }
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
    
        System.out.println("Luas SegiTigaSamaKaki = "+luas);
        System.out.println("Keliling SegiTigaSamaKaki = "+keliling);
        System.out.println("\n");
    }
    
    @Override
    public void normal(){
        this.a = a ;
        this.t = t;
    }
    @Override
    public void perbesar(){
        this.a = a *2;        
        this.t = t *2;
    }
    
    @Override
    public void perkecil(){
        this.a = a /2;        
        this.t = t /2;
    }
    
}
