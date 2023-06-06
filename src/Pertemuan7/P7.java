package Pertemuan7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Masukkan alas : ");
            double alas = Double.parseDouble(br.readLine());
            System.out.println("Masukkan tinggi : ");
            double tinggi = Double.parseDouble(br.readLine());

            double luas = 0.5*alas*tinggi;

            // hasil dari prosedur
            cetakluas();

            System.out.println("luas segitiga adalah " + luas);

        }catch (Exception e){
            System.err.println("Data Salah");
    }


    }
    // fungsi prosedur
    public static double luasSegitiga(double alas, double tinggi){
    return 0.5*alas*tinggi;}
    public static void cetakluas(){
        //bisa memanggil fungsi bisa menggunakan java.IO, bisa menggunakan array, dsb.
        System.out.println("Luas segitiga : " + luasSegitiga(5,5));
    }
    public static void inputDataLuasSegitiga()throws IOException {
        // jika dengan inputan user, perlu ada BufferedReader dan IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan alas: ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tinggi: ");
        double t = Double.parseDouble(br.readLine());

        //hitung luas segitiga (memanggil fungsi)
        luasSegitiga(a,t);

        //cetak hasil hitung
        System.out.println("Luas segitiga adalah: " + luasSegitiga(a,t));

        //cetak hasil hitung dari prosedur
        cetakluas();

    }
}
