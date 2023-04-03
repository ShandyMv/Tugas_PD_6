package WhileDo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class latihanDoWhile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //lettakan variabel sebelum blok try agar terbaca di dalam bok try-catch
        int nim, i=0;
        String nama;
        try {
            do {
                System.out.print("Entri nim : ");
                nim = Integer.parseInt(br.readLine());
                System.out.print("Entri nama : ");
                nama = br.readLine();
                i++;
            }while (i < 5);
        }catch (Exception e){
    }
        String cari, nimm = null, namaa = "" , prodi = "", mk = "";
        int menu, uts, uas, tugas, nilaiAkhir = 0;
        try {
            /*membuat program dengan menu
            1. Entri mahasiswa (nim, nama , prodi, mk)
            2. Hitung nilai mahasiswa (UTS,UAS,TUGAS)
            3. Lihat rapor mahasiswa
            4. keluar program
             */
            do {
                System.out.println("=== Program Akademik Mahasiswa ===");
                System.out.println("1. Entri Mahasiswa");
                System.out.println("2. Hitung Nilai MK Mahasiswa");
                System.out.println("3. Lihat rapor Mahasiswa");
                System.out.println("4. Keluar program");
                menu = Integer.parseInt(br.readLine());
                //mengisi logika setiap menu (percabangan: if, switch-case)
                switch (menu){
                    /*
                    if (menu == 1){
                    }else if (menu ==2){
                    }else{ else dalam if-else if == default
                    }
                     */
                    case 1:
                        System.out.println("=== Menu Entri Mahasiswa ===");
                        System.out.print("Entri NIM Mahasiswa: ");
                        nimm = br.readLine();
                        System.out.print("Entri Nama Mahasiwa: ");
                        namaa = br.readLine();
                        System.out.print("Entri program studi: ");
                        prodi = br.readLine();
                        System.out.print("Entri nama mata kuliah: ");
                        mk = br.readLine();
                        System.out.println();
                        break; //artinya berhenti proses case 1, dan mengembalikan perulangan awal (menu di awal)
                    case 2:
                        System.out.println("=== Menu Hitung Nilai Mahasiswa ===");
                        // hitung nilai akhir ( 30% uts + 30% * uas + 40% * tugas)
                        System.out.println("Cari berdasarkan NIM: ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimm)) {
                            System.out.print("Entri nilai UTS: ");
                            uts = Integer.parseInt(br.readLine());
                            System.out.print("Entri nilai UAS: ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.print("Entri nilai TUGAS: ");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiAkhir = (uts * 30/100) + (uas * 30/100) +
                                    (tugas * 40/100);

                            System.out.println("Nilai akhir : " + nilaiAkhir);
                            System.out.println();

                        } else {
                            System.out.println("Data Tidak Ditemukan");
                        }


                        break; // sama
                    case 3:
                        System.out.println("=== Menu Lihat Rapor ===");
                        /*
                        System.out.println(nimm + " " + namaa);
                        System.out.println("Nilai Akhir MK " + mk + ": " + nilaiAkhir);


                         */
                        System.out.println("Cari berdasarkan NIM: ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimm)) {
                            System.out.println(nimm + " " + namaa);
                            System.out.println("NIlai Akhir Mk " + mk + ":" + nilaiAkhir);
                        }
                        /*
                        A = 80-100
                        B+ = 75-79
                        B = 65-74
                        C+ = 60-64
                        C = 55-59
                        NIlai < 55 == D/E
                         */
                        if (nilaiAkhir >= 80 && nilaiAkhir <= 100){
                            System.out.println("Nilai Huruf : A");
                        } else if (nilaiAkhir >= 75 && nilaiAkhir <= 79) {
                            System.out.println("Nilai Huruf : B+");
                        } else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
                            System.out.println("Nilai Huruf : B");
                        } else if (nilaiAkhir >= 64 && nilaiAkhir <= 60) {
                            System.out.println("Nilai Huruf : C");
                        } else if (nilaiAkhir >= 59 && nilaiAkhir <= 55) {
                            System.out.println("Nilai Huruf : C+");
                        }  else {
                            System.out.println("Nilai Akhir D/E");
                        }
                        break;
                    default: // jika yang dipilih di luar 1-3, maka menjalankan apa
                        System.out.println("Berhasil Keluar Program");
                        System.exit(0);
                }
            }while (menu != 4);
        }catch (Exception e){
            System.out.println("Terdapat Kesalahan --> " + e.getMessage());
        }
}
}
