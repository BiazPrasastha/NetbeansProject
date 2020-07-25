/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaketPegawai;

import Honorer.Honor;
import Honorer.Lembur;
import PegawaiTetap.GajiPokok;
import PegawaiTetap.Tunjangan;

/**
 *
 * @author biazprasastha
 */
public class PaketPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPokok objekGajiPokok = new GajiPokok();
        objekGajiPokok.Gol("A");
        objekGajiPokok.GjPokok(1800000);
        objekGajiPokok.MasaKerja(3);
        
        Tunjangan objekTunjangan = new Tunjangan();
        objekTunjangan.TunjKel(500000);
        objekTunjangan.TunjJbt(800000);
        
        Honor objekHonorer = new Honor();
        objekHonorer.HonorTetap(6000000);
        
        Lembur objekLembur = new Lembur();
        objekLembur.HonorLembur(100000);
    }   
}