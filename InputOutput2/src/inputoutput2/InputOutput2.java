/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput2;

import java.io.*;

/**
 *
 * @author biazprasastha
 */
public class InputOutput2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // TODO code application logic here
        throws IOException {
        String namaFile = "PBO.txt";
        String namaMhs = "Irfan Arifudin ";
        String jurusan = "Sistem Informasi";
        int angkatan = 2004;
        FileOutputStream outFile = new FileOutputStream(namaFile);
        
        try {
            DataOutputStream outStream = new DataOutputStream(outFile);
            outStream.writeUTF(namaMhs);
            outStream.writeUTF(jurusan);
            outStream.writeInt(angkatan);
        } catch (Exception e) {
            System.out.println("IOERROR: "+e.getMessage()+"\n");
        } 
    }
}   
    
