public class Main {
    public static void main(String[] args) throws Exception {

        Produk produk1 = new Produk("P0001", "Macbook", 20000000, 10);
        Pelanggan pelanggan1 = new Pelanggan("C0001", "Nina", "nina@email.com", 100000000);

        System.out.println("\nINFO PRODUK");
        produk1.tampilkanInfoProduk();

        System.out.println("\nINFO PELANGGAN");
        pelanggan1.tampilkanInfoPelanggan();

        Transaksi transaksi1 = new Transaksi("T0001", pelanggan1, produk1, 1,0.0);
        transaksi1.prosesTransaksi();

        System.out.println("\nINFO PRODUK SETELAH TRANSAKSI");
        produk1.tampilkanInfoProduk();

        System.out.println("\nINFO PELANGGAN SETELAH TRANSAKSI");
        pelanggan1.tampilkanInfoPelanggan();
    }
}
