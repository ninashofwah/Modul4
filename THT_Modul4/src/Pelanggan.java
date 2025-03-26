public class Pelanggan {

    String idPelanggan;
    String nama;
    String email;
    double saldo;

    Pelanggan(String idPelanggan, String nama, String email, double saldo) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    void tampilkanInfoPelanggan() {
        System.out.println("ID Pelanggan   : " + idPelanggan);
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Email          : " + email);
        System.out.println("Saldo          : " + saldo);
    }

    void topUpSaldo(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Saldo berhasil ditambahkan. Jumlah saldo: Rp" + saldo);
        } else {
            System.out.println("Jumlah top up harus lebih dari 0");
        }
    }

    boolean kurangiSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi!");
            return false;
        }
    }
}