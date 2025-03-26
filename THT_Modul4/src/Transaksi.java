public class Transaksi {
    
    String idTransaksi;
    Pelanggan pelanggan;
    Produk produk;
    int jumlahBeli;
    double totalHarga;

    Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli, double totalHarga) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.harga * jumlahBeli;
    }

    void prosesTransaksi() {
        if (produk.kurangiStok(jumlahBeli) && pelanggan.kurangiSaldo(totalHarga)) {
            tampilkanDetailTransaksi();
        } else {
            System.out.println("Transaksi gagal!");
        }
    }

    void tampilkanDetailTransaksi() {
        System.out.println("\n====== STRUK TRANSAKSI ======");
        System.out.println("ID Transaksi   : " + idTransaksi);
        System.out.println("Nama Pelanggan : " + pelanggan.nama);
        System.out.println("Produk         : " + produk.namaProduk);
        System.out.println("Jumlah Beli    : " + jumlahBeli);
        System.out.println("Total Harga    : Rp" + totalHarga);
        System.out.println("=============================");
    }
}
