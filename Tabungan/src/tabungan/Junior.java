/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;
import tabungan.Tabungan;
/**
 *
 * @author biazprasastha
 */
public class Junior extends Tabungan{
    private double SALDO_AWAL_MINIMUM = 500000;
    private double SALDO_MINIMUM = 10000;
    private double SETORAN_MINIMUM = 50000;
    private double MAKS_TARIKAN_PER_HARI = 1000000;
    
    public void Junior(String nama,long noRek,double saldoAwal) {
        super.nama = nama;
        super.noRekening = noRek;
        super.saldoMinimum = SALDO_MINIMUM;
        super.setoranMinimun = SETORAN_MINIMUM;
        if (SALDO_AWAL_MINIMUM <= saldoAwal) {
            super.saldo = saldoAwal;
        }
    }
    
    @Override
     public void tarikUang(double jmlPenarikan){
        if(jmlPenarikan >= MAKS_TARIKAN_PER_HARI){
            System.out.println("Batas penarikan harian terlampaui");
        }
        else if (jmlPenarikan < 0) {
            System.out.println("Jumlah penarikan tidak boleh negatif");
        } 
        else if(jmlPenarikan > saldo) {
            System.out.println("Penarikan gagal saldo tidak mencukupi, saldo anda " + saldo);
        }
        else if(saldoMinimum > saldo-jmlPenarikan){
            System.out.println("Penarikan terlalu banyak, pastikan saldo masih mencukupi minimal saldo sebesar "+ saldoMinimum);
        }
        else{
            this.saldo = saldo-jmlPenarikan;
        }
    }
}
