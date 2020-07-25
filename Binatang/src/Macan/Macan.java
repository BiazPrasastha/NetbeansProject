/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Macan;
import binatang.Binatang;
import binatang.Karnifora;
/**
 *
 * @author biazprasastha
 */
public class Macan extends Binatang implements Karnifora{
    private String suara;
    private String warnaBulu;
    
    public Macan(String nama,int jmlKaki,String suara,String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void setNama(String Nama){
        this.nama = Nama;
    }
    @Override
    public void setKaki(int Kaki){
        this.jmlKaki = Kaki;
    }
    @Override
    public String getNama(){
        return this.nama;
    }
    @Override
    public int getKaki(){
        return this.jmlKaki;
    }
    @Override
    public void displayBinatang(){
        System.out.println("\t Macan");
        super.displayBinatang();
        System.out.println("Suara : "+suara);
        System.out.println("Warna Bulu : "+warnaBulu);
    }
    @Override
    public void displayMakan(){
        System.out.println("Jenis : " + Karnifora.jenisk);
        System.out.println("Makanan : " + Karnifora.makanank);
    } 
    public void displayData(){
        displayBinatang();
        displayMakan();
        System.out.println("");
    }
}
