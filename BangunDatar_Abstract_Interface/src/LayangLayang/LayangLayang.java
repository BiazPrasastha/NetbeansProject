/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayangLayang;
import bangundatar.BangunDatar;
import bangundatar.Resizeable;
/**
 *
 * @author Biaz Prasastha
 */
public class LayangLayang extends BangunDatar implements Resizeable{
    public int d1, d2;
       
    public void LayangLayang(int a, int t){
        this.d1 = a;
        this.d2 = t;
    }
    
    @Override 
    public void hitungLuas(){
        this.luas = (d1*d2)/2;
    }
    @Override
    public void hitungKeliling(){
        double x = d1*0.5;
        double y = d2*0.25;
        double z = d2*0.75;
        double sisiA = Math.sqrt(x*x+y*y);
        double sisiB = Math.sqrt(x*x+z*z);
        this.keliling = (2*sisiA)+(2*sisiB);
    }
    @Override
    public void tampilData(){
        if (d2>d1) {
        System.out.println("-----------------------------");
        System.out.println("Luas LayangLayang = "+luas);
        System.out.println("Keliling LayangLayang = "+keliling);
        System.out.println("\n");
            
        }
        else{
            System.out.println("Diagonal 2 Harus Lebih Panjang dari Diagonal 1");
        }
    }
    
    
    @Override
    public void normal(){
        this.d1 = d1 ;
        this.d2 = d2;
    }
    @Override
    public void perbesar(){
        this.d1 = d1 *2;        
        this.d2 = d2 *2;
    }
    
    @Override
    public void perkecil(){
        this.d1 = d1 /2;        
        this.d2 = d2 /2;
    }
    

}
