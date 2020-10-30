/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10116415.latihan36.targetsaldotabungan;

/**
 *
 * @author Frda
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * Target Saldo Tabungan
 */
public class PBO0210116415LATIHAN36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000;
        double bunga = 0.08;
        double bulan = 0;
        
        SaldoTabungan targetsaldotabungan = new SaldoTabungan();
        targetsaldotabungan.hitungSaldoTabungan(saldo, bulan, bunga);
    
    }
    
}
