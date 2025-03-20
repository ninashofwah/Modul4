public class Sewa {
    Pelanggan pelanggan;
    Mobil mobil;
    int durasiSewa;
    double totalBiaya;

    Sewa(Pelanggan pelanggan, Mobil mobil, int durasiSewa) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasiSewa = durasiSewa;
    
        if (mobil.isTersedia()) {
            mobil.setTersedia(false);
            totalBiaya = durasiSewa * mobil.getHargaPerHari();
            totalBiaya = Utility.hitungDiskon(totalBiaya, durasiSewa);
            tampilkanStruk();
        } else {
            System.out.println(mobil.getMerek() + " tidak tersedia.");
        }
    }

    void tampilkanStruk() {
        System.out.println("===== Struk Penyewaan =====");
        pelanggan.tampilkanInfo();
        System.out.println("Mobil yang Disewa: " + mobil.getMerek() + " (" + mobil.getNomorPlat() + ")");
        System.out.println("Lama Sewa: " + durasiSewa + " hari");
        System.out.println("Total Biaya: Rp" + Utility.formatMataUang(totalBiaya));
        System.out.println("Status: Berhasil Disewa");
    }
}