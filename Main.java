//file Main.java

public class Main {
    public static void main(String[] args) {

        PegawaiTetap tetap = new PegawaiTetap("Budi", 30, "Manager");
        PegawaiKontrak kontrak = new PegawaiKontrak("Sari", 25, "Staff");

        System.out.println("=== Pegawai Tetap ===");
        System.out.println("Nama: " + tetap.getNama());
        System.out.println("Usia: " + tetap.getUsia());
        System.out.println("Jabatan: " + tetap.getJabatan());
        tetap.deskripsiKerja();

        System.out.println("\n=== Pegawai Kontrak ===");
        System.out.println("Nama: " + kontrak.getNama());
        System.out.println("Usia: " + kontrak.getUsia());
        System.out.println("Jabatan: " + kontrak.getJabatan());
        kontrak.deskripsiKerja();
    }
}
