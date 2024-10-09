package com.example.freels.ListPelamarPekerjaan;

public class ListPelamar {
    public String nama;
    public int imageProfile;
    public String pendidikan;;
    public  boolean terpilih = false;

    public ListPelamar(String nama, int imageProfile, String pendidikan) {
        this.nama = nama;
        this.imageProfile = imageProfile;
        this.pendidikan = pendidikan;
    }
}
