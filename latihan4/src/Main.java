public class Main {
    public static void main(String[] args) throws Exception {

        Mahasiswa mhs1 = new Mahasiswa("Nina", "105223040", "Teknik Informatika", 4.0);
        mhs1.tampilkanInfo();
        System.out.println("Lulus:" + mhs1.cekLulus());

        Mahasiswa mhs2 = new Mahasiswa("Rippun", "105223027", "Teknik Informatika", 4.0);
        mhs2.tampilkanInfo();
        System.out.println("Lulus:" + mhs2.cekLulus());
    }
}
