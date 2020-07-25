/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegiTigaSikuSiku;
import bangundatar.BangunDatar;
import bangundatar.Resizeable;
/**
 *
 * @author Biaz Prasastha
 */
public class SegiTigaSikuSiku extends BangunDatar implements Resizeable{
    public int sisiA;
    public int a ;
    public int t ;
    
    public void SegitigaSikuSiku(int t, int a){
        this.a = a;
        this.t = t;
    }
    
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
        System.out.println("Luas SegiTigaSikuSiku = "+luas);
        System.out.println("Keliling SegiTigaSikuSiku = "+keliling);
        System.out.println("\n");
    }
    @Override
    public void normal(){
        this.a = a;
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
