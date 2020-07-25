/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputlatihan;
import java.io.*;
import java.util.Scanner;
import mahasiswa.mahasiswa;
/**
 *
 * @author biazprasastha
 */
public class InputOutputLatihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t \t Menu PIlihan");
        System.out.println("------------------------");
        System.out.println("1. Input Data Mahasiswa");
        System.out.println("2. Lihat Data Mahasiswa");
        System.out.println("3. Keluar Data Mahasiswa");
        System.out.println("------------------------");
        int n;
        Scanner x = new Scanner(System.in);
        System.out.println("Pilihan Anda : ");
        n = x.nextInt();
        Scanner masuk = new Scanner(System.in);
        switch(n){
            case 1:
                int nim;
                String nama, alamat, jenisk,prog,jurusan;
                Scanner y = new Scanner(System.in);
                System.out.println("Nim : ");
                nim = y.nextInt();
                System.out.println("Nama : ");
                nama = y.nextLine();
                System.out.println("Alamat : ");
                alamat = y.nextLine();
                System.out.println("Jenis Kelamin: ");
                jenisk = y.nextLine();
                System.out.println("Program Studi: ");
                prog = y.nextLine();
                System.out.println("Jurusan: ");
                jurusan = y.nextLine();
                String namaFile = "List.txt";
                try {
                    FileInputStream inFile = new FileInputStream(namaFile);
                    DataInputStream inputStream = new DataInputStream(inFile);
                    nim = inputStream.readInt();
                    nama = inputStream.readUTF();
                    alamat = inputStream.readUTF();
                    jenisk = inputStream.readUTF();
                    prog = inputStream.readUTF();
                    jurusan = inputStream.readUTF();
                    inputStream.close();
                } catch (FileNotFoundException e) {
                    System.out.println("File "+namaFile+" Tidak Ada");
                } 
                catch(IOException ex){
                    System.out.println("IOERROR: "+ex.getMessage()+"\n");
                }
            }
    }
}
