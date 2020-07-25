/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanjangString;

/**
 *
 * @author biazprasastha
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        String[] nama = {"Megawati Sukarno Putri",
            "Susilo Bambang Yudoyono",
            "Jusuf Kalla",
            "Prabowo Subianto",
            "Boediono",
            "Wiranto"
        };
        
        String sementara;
        int n =nama.length;
        
        System.out.println("Daftar Nama sebelum diurutkan");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+". "+nama[i]);
        }
        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                if (nama[i].compareTo(nama[j])>0) {
                    sementara =nama[i];
                    nama[i] =nama[j];
                    nama[j] = sementara;
                }
            }
        }
        System.out.println("Daftar Nama Setelah diurutkan");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+". "+nama[i]);
        }
    }
    
}
