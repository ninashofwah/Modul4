public class Mahasiswa {

    String nama;
    String nim;
    String jurusan;
    double ipk;
    boolean isLulus;

    Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
    }

    boolean cekLulus() {
        if (ipk >= 3.0) {
            isLulus = true;
        } else {
            isLulus = false;
        }
        return isLulus;
    }
}
