package com.example.freels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MembuatLowonganPekerjaan extends AppCompatActivity implements View.OnClickListener {


    private EditText namaPerusahaan;
    private EditText pekerjaan;
    private EditText lokasi;
    private EditText jenisPekerjaan;
    private EditText gajiMinimum;
    private EditText gajiMaksimum;
    private EditText ringkasanPekerjaan;
    private EditText kualifikasiPekerjaan;
    private Button btUnggahLowongan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membuat_lowongan_pekerjaan);

        this.namaPerusahaan = this.findViewById(R.id.InputNamaPerusahaan);
        this.pekerjaan = this.findViewById(R.id.InputPekerjaan);
        this.lokasi = this.findViewById(R.id.InputLokasi);
        this.jenisPekerjaan = this.findViewById(R.id.InputJenisPekerjaan);
        this.gajiMinimum = this.findViewById(R.id.InputGajiMinimum);
        this.gajiMaksimum = this.findViewById(R.id.InputGajiMaksimum);
        this.ringkasanPekerjaan = this.findViewById(R.id.InputRingkasanPekerjaan);
        this.kualifikasiPekerjaan = this.findViewById(R.id.InputKualifikasiPekerjaan);
        this.btUnggahLowongan = this.findViewById(R.id.UnggahLowongan);

        this.btUnggahLowongan.setOnClickListener(MembuatLowonganPekerjaan.this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, Homepage.class);
        String teksNamaPerusahaan = this.namaPerusahaan.getText().toString();
        i.putExtra("namaPerusahaan", teksNamaPerusahaan);

        String teksPekerjaan = this.pekerjaan.getText().toString();
        i.putExtra("pekerjaan", teksPekerjaan);

        String teksLokasi = this.lokasi.getText().toString();
        i.putExtra("lokasi", teksLokasi);

        String teksJenisPekerjaan = this.jenisPekerjaan.getText().toString();
        i.putExtra("jenisPekerjaan", teksJenisPekerjaan);

        String teksGajiMinimum = this.gajiMinimum.getText().toString();
        i.putExtra("gajiMinimum", teksGajiMinimum);

        String teksGajiMaksimum = this.gajiMaksimum.getText().toString();
        i.putExtra("gajiMaksimum", teksGajiMaksimum);

        String teksRingkasanPekerjaan = this.ringkasanPekerjaan.getText().toString();
        i.putExtra("ringkasanPekerjaan", teksRingkasanPekerjaan);

        String teksKualifikasiPekerjaan = this.kualifikasiPekerjaan.getText().toString();
        i.putExtra("kualifikasiPekerjaan", teksKualifikasiPekerjaan);
        startActivity(i);
    }
}