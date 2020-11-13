package pertemuan1;

public class Diskon {
    public static void main(String[] args) {
        int qty = 4;
        int hargaTiket = 50000;
        int sisa = qty / 3;
        int jumlahDiskon = qty - sisa;
        int jumlahBayar = jumlahDiskon * hargaTiket;
        System.out.println();
        System.out.println("Total Harga Tiket : " + jumlahBayar);
    }
}
