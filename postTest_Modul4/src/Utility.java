public class Utility {
    public static double hitungDiskon(double totalBiaya, int durasiSewa) {
        if (durasiSewa > 5) {
            totalBiaya *= 0.9; 
        }
        return totalBiaya;
    }

    public static String formatMataUang(double angka) {
        return String.format("%,.0f", angka);
    }
}
