package com.example.freels;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        TextView namaPerusahaan = findViewById(R.id.namaPerusahaan);
        TextView pekerjaan = findViewById(R.id.pekerjaan);
        TextView lokasi = findViewById(R.id.lokasi);
        TextView jenisPekerjaan = findViewById(R.id.jenisPekerjaan);
        TextView gajiMinimum = findViewById(R.id.gajiMinimum);
        TextView gajiMaksimum = findViewById(R.id.gajiMaksimum);
        TextView ringkasanPekerjaan = findViewById(R.id.ringkasanPekerjaan);
        TextView kualfikasiPekerjaan = findViewById(R.id.kualifikasiPekerjaan);

        Intent i = getIntent();

        String teksNamaPerusahaan = i.getStringExtra("namaPerusahaan");
        String teksPekerjaan = i.getStringExtra("pekerjaan");
        String teksLokasi = i.getStringExtra("lokasi");
        String teksJenisPekerjaan = i.getStringExtra("jenisPekerjaan");
        String teksGajiMinimum = i.getStringExtra("gajiMinimum");
        String teksGajiMaksimum = i.getStringExtra("gajiMaksimum");
        String teksRingkasanPekerjaan = i.getStringExtra("ringkasanPekerjaan");
        String teksKualifikasiPekerjaan = i.getStringExtra("kualifikasiPekerjaan");

        namaPerusahaan.setText(teksNamaPerusahaan);
        pekerjaan.setText(teksPekerjaan);
        lokasi.setText(teksLokasi);
        jenisPekerjaan.setText(teksJenisPekerjaan);
        gajiMinimum.setText(teksGajiMinimum);
        gajiMaksimum.setText(teksGajiMaksimum);
        ringkasanPekerjaan.setText(teksRingkasanPekerjaan);
        kualfikasiPekerjaan.setText(teksKualifikasiPekerjaan);


    }
}