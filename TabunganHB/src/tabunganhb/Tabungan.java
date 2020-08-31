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
public class Tabungan {
    public String nama;
    public long noRekening;
    public double saldo = 0;
    public double saldoMinimum = 0;
    public double setoranMinimun = 0;
    
    public Tabungan(){

    }
    
    public Tabungan(String nama, long noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
    }
    protected void setSaldoMin(double saldoMin){
        this.saldoMinimum = saldoMin;
    }
    
    protected void setSetoranMin(double setoranMin){
        this.setoranMinimun = setoranMin;
    }
    
    public double getSaldo(){
        System.out.println("Saldo Total : " + saldo);
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void simpanUang(double uang){
        if(uang <= setoranMinimun){
            System.out.println("Uang yang disetor kurang dari setoran minimal sebesar " + setoranMinimun);
        }
        else{
            this.saldo = saldo+uang;
        }
    }
    
    public void tarikUang(double jmlPenarikan){
        if (jmlPenarikan < 0) {
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


