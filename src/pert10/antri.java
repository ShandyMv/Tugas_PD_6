package pert10;
import java.util.LinkedList;

class Antrian {
    private LinkedList<Object> antrian;

    public Antrian() {
        antrian = new LinkedList<>();
    }

    public void masukkan(Object item) {
        antrian.addLast(item);
    }

    public Object keluarkan() {
        if (kosong()) {
            System.out.println("Antrian kosong");
            return null;
        }
        return antrian.removeFirst();
    }

    public boolean kosong() {
        return antrian.isEmpty();
    }

    public int ukuran() {
        return antrian.size();
    }

    public Object lihatDepan() {
        if (kosong()) {
            System.out.println("Antrian kosong");
            return null;
        }
        return antrian.getFirst();
    }
}

public class antri {
    public static void main(String[] args) {
        Antrian antrian = new Antrian();

        antrian.masukkan("Org 1");
        antrian.masukkan("Org 2");
        antrian.masukkan("Org 3");

        System.out.println("Ukuran antrian: " + antrian.ukuran());

        System.out.println("Keluar: " + antrian.keluarkan());
        System.out.println("Keluar: " + antrian.keluarkan());
        System.out.println("Keluar: " + antrian.keluarkan());

        System.out.println("Apakah antrian kosong? " + antrian.kosong());

        antrian.masukkan("Org 4");
        antrian.masukkan("Org 5");

        System.out.println("Lihat Depan: " + antrian.lihatDepan());
        System.out.println("Ukuran antrian: " + antrian.ukuran());
    }
}
