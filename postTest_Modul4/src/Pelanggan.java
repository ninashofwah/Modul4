public class Pelanggan {

    String nama;
    int noKTP;
    int noHP;

    Pelanggan(String nama, int noKTP, int noHP) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.noHP = noHP;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor KTP: " + noKTP);
        System.out.println("Nomor HP: " + noHP);
        System.out.println();
    }
}
