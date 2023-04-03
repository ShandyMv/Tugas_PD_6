package Tugas_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TUGAS_4 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double segi3;
        // segi3 = segitiga
        System.out.println("Ukuran segitiga yang di inginkan");
        segi3 = Double.parseDouble(br.readLine());
        for (int a = 0; a < segi3; a++) {
            for (int b = 1; b <= segi3-a; b++) {
                System.out.print("*");
            }
            System.out.println();
    }
    }
}



