//file PegawaiTetap.java

class PegawaiTetap extends Pegawai implements Kinerja {

    public PegawaiTetap(String nama, int usia, String jabatan) {
        super(nama, usia, jabatan);
    }

    @Override
    public void deskripsiKerja() {
        System.out.println("Pegawai tetap bekerja full-time dan memiliki tunjangan.");
    }
}