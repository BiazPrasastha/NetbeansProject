/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;
import java.io.*;
/**
 *
 * @author biazprasastha
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
        // TODO code application logic here
        throws IOException {
        String namaFile = "PBO.txt";
        String namaMhs,jurusan;
        int angkatan;
        try {
            FileInputStream inFile = new FileInputStream(namaFile);
            DataInputStream inputStream = new DataInputStream(inFile);
            namaMhs = inputStream.readUTF();
            jurusan = inputStream.readUTF();
            angkatan = inputStream.readInt();
            inputStream.close();
            System.out.println("Nama : "+namaMhs);
            System.out.println("Jurusan : "+jurusan);
            System.out.println("Angkatan : "+angkatan);
        } catch (FileNotFoundException e) {
            System.out.println("File "+namaFile+" Tidak Ada");
        } 
        catch(IOException ex){
            System.out.println("IOERROR: "+ex.getMessage()+"\n");
        }
}
}   