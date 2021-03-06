package com.greenlabs.crudsample.entity;

/**
 * Created by kristiawan on 10/7/17.
 */
public class Mahasiswa extends BaseEntity{

    private String nim;
    private String nama;
    private String alamat;

    public Mahasiswa() {
    }

    public Mahasiswa(long id) {
        super(id);
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
