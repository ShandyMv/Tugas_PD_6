package WhileDo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //menjumlahkan setiap anga yang di entry kan
        // kondisi : pengulangan penjumlahan akan di lakukan apabila angka yang di inputkan >= 0
        //output : angka hasil jumlah
        int number=1, jumlah =0;
        while (number >= 0) {
            jumlah += number; //untuk penjumlahan setiap angka yang di inputkan
            System.out.print("Entri angka : ");
            number = Integer.parseInt(br.readLine());
        }
            System.out.println("Jumlah =" + jumlah);


        //mengentrikan nim dan nama apabila kondisinya true (dua data diisi dengan benar)
        boolean b;
        int i = 0;
        while (i < 5){
            System.out.print("Entri nim : ");
            int nim = Integer.parseInt(br.readLine());
            System.out.print("Entri nama : ");
            String nama = br.readLine();
            i++;
        }
        }
    }

