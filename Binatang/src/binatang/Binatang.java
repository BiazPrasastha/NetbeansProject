/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binatang;

/**
 *
 * @author biazprasastha
 */
public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;
    
    public Binatang(String Nama,int Kaki){
        this.nama = Nama;
        this.jmlKaki = Kaki;
    }
    
    public void setNama(String Nama){
        this.nama = Nama;
    };
    public String getNama(){
        return this.nama;
    };
    public void setKaki(int Kaki){
        this.jmlKaki = Kaki;
    };
    public int getKaki(){
        return this.jmlKaki;
    };
    public void displayBinatang(){
        System.out.println("Nama  : "+nama);
        System.out.println("Jumlah Kaki : "+jmlKaki);
    };
    
}
