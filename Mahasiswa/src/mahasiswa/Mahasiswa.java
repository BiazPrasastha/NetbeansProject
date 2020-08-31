/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
/**
 *
 * @author biazprasastha
 */
public class Mahasiswa {

    private String nim;
    private String nama;    
    private String ket;
    private int tinggi;
    private boolean pindahan;
    
    public void setNim(String nim){
        this.nim  = nim;
    }
    public String getNim(){
        return nim;
    }
    public void setNama(String nama){
        this.nama  = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setTinggi(int tinggi){
        this.tinggi  = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }
    public void setPindahan(boolean pindahan){
        this.pindahan  = pindahan;
    }
    public boolean isPindahan(){
        if (pindahan == false) {
            ket = "Bukan Siswa Pindahan";
        }
        else{
            ket = "Siswa Pindahan";
        }
        return pindahan;
    }
    public Mahasiswa(String nim, String nama, int tinggi){
        this.nim = nim;
        this.nama = nama;
        this.tinggi = tinggi;
    }
    public Mahasiswa(String nim, String nama, int tinggi,boolean pindahan){
        this(nim, nama, tinggi);
        this.pindahan = pindahan;
    }
    public static void main(String[] args) {
        Mahasiswa mh1  = new Mahasiswa("13196", "Biaz Prasastha", 191);
        mh1.setPindahan(true);
        mh1.isPindahan();
        System.out.println("Nim    = " + mh1.nim);
        System.out.println("Nama   = " + mh1.nama);
        System.out.println("Tinggi = " + mh1.tinggi + "cm");
        System.out.println("Keterangan = " + mh1.ket);
    }
    
}
