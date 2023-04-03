package Tugas_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TUGAS_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String NIM;
        int ipklast,skskum,sks,tobot;
        System.out.println("Masukkan NIM: ");
        NIM = br.readLine();
        System.out.println("Masukkan IPK terakhir anda: ");
        ipklast = Integer.parseInt(br.readLine());
        System.out.println("Masukkan SKS kumulatif anda: ");
        skskum = Integer.parseInt(br.readLine());
        System.out.println("Masukkan SKS yang sedang ditempuh: ");
        sks = Integer.parseInt(br.readLine());
        System.out.println("Masukkan total bobot nilai anda:");
        tobot = Integer.parseInt(br.readLine());

        int ips = ((ipklast * skskum) + tobot) / (sks+ skskum);
        System.out.println("Nilai IPK Anda adalah: " + ips);
        if (ips >= 3.5) {
                System.out.println("Bisa Mengambil 24 SKS");}
            else if (ips <= 3.00 && ips <= 3.4) {
            System.out.println("Bisa Mengambil 22 SKS");}
        else if (ips <= 2.00 && ips <= 2.9) {
            System.out.println("Bisa Mengambil 20 SKS");}
        else if (ips <= 2) {
            System.out.println("Bisa Mengambil 18 SKS");}



    }
}



