//package WhileDo;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//    public class coba {
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//            // Proses pengisian data mahasiswa
//            System.out.print("Masukkan jumlah mahasiswa: ");
//            int jumlahMahasiswa = Integer.parseInt(reader.readLine());
//
//            String[][] dataMahasiswa = new String[jumlahMahasiswa][5];
//
//            for (int i = 0; i < jumlahMahasiswa; i++) {
//                System.out.println("\nData Mahasiswa ke-" + (i+1));
//                System.out.print("NIM: ");
//                dataMahasiswa[i][0] = reader.readLine();
//                System.out.print("Nama: ");
//                dataMahasiswa[i][1] = reader.readLine();
//                System.out.print("Program Studi: ");
//                dataMahasiswa[i][2] = reader.readLine();
//                System.out.print("Semester Saat Ini: ");
//                dataMahasiswa[i][3] = reader.readLine();
//                System.out.print("IPS: ");
//                dataMahasiswa[i][4] = reader.readLine();
//            }
//
//            // Proses perwalian
//            System.out.print("\nMasukkan NIM mahasiswa yang akan melakukan perwalian: ");
//            String nimCari = reader.readLine();
//
//            boolean mahasiswaDitemukan = false;
//            String[] dataMahasiswaTerpilih = new String[5];
//
//            for (int i = 0; i < jumlahMahasiswa; i++) {
//                if (dataMahasiswa[i][0].equals(nimCari)) {
//                    mahasiswaDitemukan = true;
//                    dataMahasiswaTerpilih = dataMahasiswa[i];
//                    break;
//                }
//            }
//
//            if (mahasiswaDitemukan) {
//                System.out.println("\nData Mahasiswa:");
//                System.out.println("NIM: " + dataMahasiswaTerpilih[0]);
//                System.out.println("Nama: " + dataMahasiswaTerpilih[1]);
//                System.out.println("Program Studi: " + dataMahasiswaTerpilih[2]);
//                System.out.println("Semester Saat Ini: " + dataMahasiswaTerpilih[3]);
//                System.out.println("IPS: " + dataMahasiswaTerpilih[4]);
//
//                double ips = Double.parseDouble(dataMahasiswaTerpilih[4]);
//                int maksSks = 0;
//                if (ips >= 3.5) {
//                    maksSks = 24;
//                } else if (ips >= 3.0) {
//                    maksSks = 21;
//                } else if (ips >= 2.5) {
//                    maksSks = 18;
//                } else {
//                    maksSks = 15;
//                }
//
//                System.out.println("\nMaksimal SKS yang dapat diambil: " + maksSks);
//
//                // Proses input data mata kuliah
//                String[][] dataMataKuliah = new String[maksSks][4];
//                int totalSks = 0;
//
//                while (totalSks < maksSks) {
//                    System.out.println("\nInput data Mata Kuliah ke-" + (totalSks+1));
//                    System.out.print("Nama MK: ");
//                    dataMataKuliah[totalSks][0] = reader.readLine();
//                    System.out.print("SKS MK: ");
//                    int sksMk = Integer.parseInt(reader.readLine());
//                    dataMataKuliah
//
//                }
//            }
//        }
//    }
