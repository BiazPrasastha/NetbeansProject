/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabunganhb;

/**
 *
 * @author biazprasastha
 */
public class Haji extends Tabungan{
    private double SALDO_AWAL_MINIMUM = 500000;
    private double SALDO_MINIMUM = 500000;
    private double SETORAN_MINIMUM = 100000;
    private double MAKS_TARIKAN_PER_HARI;
    
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
        MAKS_TARIKAN_PER_HARI = 0.1 * this.saldo;
        if(jmlPenarikan >= MAKS_TARIKAN_PER_HARI){
            System.out.println("Batas penarikan harian melebihi 10% dari total saldo, saldo terpotong 50.000");
            this.saldo = saldo-jmlPenarikan-50000;
        }else if (jmlPenarikan < 0) {
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
