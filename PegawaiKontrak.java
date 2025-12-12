//file PegawaiKontrak.java

class PegawaiKontrak extends Pegawai implements Kinerja {

    public PegawaiKontrak(String nama, int usia, String jabatan) {
        super(nama, usia, jabatan);
    }

    @Override
    public void deskripsiKerja() {
        System.out.println("Pegawai kontrak bekerja sesuai durasi perjanjian.");
    }
}