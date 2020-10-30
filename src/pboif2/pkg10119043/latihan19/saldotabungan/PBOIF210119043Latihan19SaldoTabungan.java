/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan19.saldotabungan;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * KELAS     : IF2
 * DESKRIPSI : Program saldo tabungan
 */
public class PBOIF210119043Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    
        
    
    public static double saldoAwal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Tabungan====");
        System.out.print("Masukan Saldo Anda : ");
        double saldoAwal = scanner.nextDouble();
        return saldoAwal;
    }
    
    public static int lamaTabungan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lama Menabung (bulan): ");
        int lama = scanner.nextInt();
        return lama;
    }
    
    public static double bungaTabungan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bunga Tabungan (%): ");
        double bunga = scanner.nextDouble();
        return bunga;
    }
    
    public static void saldoTabungan(double saldoAwal, int lamaTabungan, double bunga) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        bunga = bunga/100;
        System.out.println();
        for (int i=1; i <= lamaTabungan; i++) {
            double saldoAkhir = saldoAwal;
            double bungaSaldo = saldoAkhir * bunga;
            saldoAwal = bungaSaldo + saldoAkhir;
            //System.out.print("Saldo di bulan ke-" + i + saldoAwal);
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %s %n", kursIndonesia.format(saldoAwal));
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        saldoTabungan(saldoAwal(),lamaTabungan(), bungaTabungan());
    }
    
}
