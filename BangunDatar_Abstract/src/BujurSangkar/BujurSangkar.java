/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BujurSangkar;
import bangundatar.BangunDatar;
/**
 *
 * @author Biaz Prasastha
 */
public class BujurSangkar extends BangunDatar {
    public int sisiA, sisiB;
    
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
        System.out.println("-----------------------------");
        System.out.println("Luas BujurSangkar = " + luas);
        System.out.println("Keliling BujurSangkar = " + keliling);
        System.out.println("");
        }
        else{
            System.out.println("Sisi A  adalaha Sisi Panjang dan Sisi B adalah Sisi Lebar");
        }
    }
    
}
