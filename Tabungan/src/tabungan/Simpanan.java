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
public class Simpanan extends Tabungan{
    private double SALDO_AWAL_MINIMUM = 500000;
    private double SALDO_MINIMUM = 10000;
    private double SETORAN_MINIMUM = 5000;
    
    public void Simpanan(String nama,long noRek,double saldoAwal) {
        super.saldoMinimum = SALDO_MINIMUM;
        super.setoranMinimun = SETORAN_MINIMUM; 
        super.nama = nama;
        super.noRekening = noRek;
        if (SALDO_AWAL_MINIMUM <= saldoAwal) {
            super.saldo = saldoAwal;
        }
        else{
            System.out.println("Saldo Awal Kurang dari saldo minimum sebesar "+SALDO_AWAL_MINIMUM);
        }
    }
}