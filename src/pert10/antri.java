package pert10;
import java.util.ArrayList;

class Antrian {
    private ArrayList<Object> antrian;
    private int depan;
    private int belakang;

    public Antrian() {
        antrian = new ArrayList<>();
        depan = 0;
        belakang = -1;
    }

    public void masukkan(Object item) {
        antrian.add(item);
        belakang++;
    }

    public Object keluarkan() {
        if (kosong()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Object item = antrian.get(depan);
        depan++;
        return item;
    }

    public boolean kosong() {
        return depan > belakang;
    }

    public int ukuran() {
        return belakang - depan + 1;
    }

    public Object lihatDepan() {
        if (kosong()) {
            System.out.println("Antrian kosong");
            return null;
        }
        return antrian.get(depan);
    }
}

public class antri {
    public static void main(String[] args) {
        Antrian antrian = new Antrian();

        antrian.masukkan("org 1");
        antrian.masukkan("org 2");
        antrian.masukkan("org 3");

        System.out.println("Ukuran antrian: " + antrian.ukuran());

        System.out.println("Keluar: " + antrian.keluarkan());
        System.out.println("Keluar: " + antrian.keluarkan());
        System.out.println("Keluar: " + antrian.keluarkan());

        System.out.println("Apakah antrian kosong? " + antrian.kosong());

        antrian.masukkan("org 4");
        antrian.masukkan("org 5");

        System.out.println("Lihat Depan: " + antrian.lihatDepan());
        System.out.println("Ukuran antrian: " + antrian.ukuran());
    }
}
