/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
import manusia.manusia;
import java.io.*;

/**
 *
 * @author biazprasastha
 */
public class mahasiswa extends manusia{
    public int nim;
    public String prog,jurusan;
    
    public mahasiswa(int nim,String nama,String alamat,String jenisk,String prog,String jurusan){
        super(nama, alamat, jenisk);
        this.nim = nim;
        this.prog = prog;
        this.jurusan = jurusan;
    }
    public void inputData() throws IOException{
        
    }
}
