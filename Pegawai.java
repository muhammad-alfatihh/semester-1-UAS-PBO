//file Pegawai.java

class Pegawai {

    private String nama;
    private int usia;
    private String jabatan;

    public Pegawai(String nama, int usia, String jabatan) {
        this.nama = nama;
        this.usia = usia;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}


