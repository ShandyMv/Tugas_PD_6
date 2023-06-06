package lanjutanSubProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // class math : int, float, double BUKAN STRING!
    //sqrt: akar kuadraat
        System.out.println(Math.sqrt(4.0));

    //pow: pangkat
        System.out.println(Math.pow(5.0,3));

    //random
        System.out.println(Math.random());

        /* item jurusan :
        1. SI
        2. DKV
        3. MANAJEMEN
        stack: urutan LIFO (last in first out)
        Ketentutan:
        -import java util (ok)
        -deklarasi stack
        -push data (tambah data)
        -pop (ambil data/item)
        -size (lihat jumlah data/item)
         */
    }
}
