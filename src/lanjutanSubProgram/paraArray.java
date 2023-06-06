package lanjutanSubProgram;
import java.io.*;

public class paraArray {
    // parameter : variabel tampung sementara di sebuah fungsi / prosedur kisi kisi minggu depan
    // fungsi ber parameter array untuk menghitung rata rata nilai atau angka
    public static int AvgArray (int[]data){
        // deklarasi variabel tampung lain untuk memproses suatu perhitungan
        int jml=0, rata=0;
        // rata rata (jumlah nilai dibagi jumlah data)
        for (int i = 0; i < data.length; i++) {
            //lakukan penjumlahan nilai (1+1=2 +3=5 +1=6 +7=13....dsb)
            jml += data[i];

        }
        rata = jml/ data.length;
        return rata;
    }

    public static void terserah() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d1[] = new int[3];
        for (int i = 0; i <d1.length; i++) {
            System.out.print("isi angka : ");
            d1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(AvgArray(d1));

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d[] = {1,2,4,7}; //data statis

        //data dinamis bisa dari inputan user (isi angkanya dari user)



        terserah();
    }

}