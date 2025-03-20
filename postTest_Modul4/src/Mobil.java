public class Mobil {

    String noPlat;
    String merek;
    double hargaPerHari;
    boolean status;

    Mobil(String noPlat, String merek, double hargaPerHari, boolean status) {
        this.noPlat = noPlat;
        this.merek = merek;
        this.hargaPerHari = hargaPerHari;
        this.status = status;
    }

    Mobil() {
        this("X-XXX-XX", "Tidak diketahui", 0.0, true);
    }

    String getNomorPlat() {
        return noPlat;
    }

    String getMerek() {
        return merek;
    }

    double getHargaPerHari() {
        return hargaPerHari;
    }

    boolean isTersedia() {
        return status;
    }

    void setTersedia(boolean status) {
        this.status = status;
    }

    void tampilkanInfo() {
        System.out.println("Nomor Plat: " + noPlat);
        System.out.println("Merek: " + merek);
        System.out.println("Harga sewa per hari: " + hargaPerHari);
        System.out.println("Status: " + (status ? "Tersedia" : "Tidak Tersedia"));
        System.out.println();
    }
}
