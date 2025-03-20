public class Main {
    public static void main(String[] args) throws Exception {
        
        Mobil mobil1 = new Mobil("B 1234 XY", "Toyota Avanza", 300000, true);
        Mobil mobil2 = new Mobil("B 5678 CT", "Honda BRV", 350000, true);
        Mobil mobil3 = new Mobil("B 9101 SR", "Mitsubishi Xpander", 400000, true);
        
        System.out.println("=== Daftar Mobil Tersedia ===");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        mobil3.tampilkanInfo();
        
        Pelanggan pelanggan1 = new Pelanggan("Andi", 1234567890,876543210);
        
    
        System.out.println("=== Transaksi Penyewaan ===");
        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 7);
        
               
        System.out.println("=== Status Mobil Setelah Penyewaan ===");
        mobil1.tampilkanInfo();
    }
}
        
    
    

