package com.example.freels;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Applyjobs1 extends AppCompatActivity implements View.OnClickListener {
    private  EditText Role_besar;
    private  EditText Perusahaan;
    private  EditText rating;
    private  EditText ulasan;
    private  EditText role_inti;
    private  EditText Lokasi;
    private  EditText kerja;
    private  EditText bayaran;
    private  EditText keterangan_pekerjaan;
    private  EditText syarat;
    private EditText syarat_rinci;
    private Button btUnggahLowongan;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applyjobs1);

        this.Role_besar = this.findViewById(R.id.Role_besar);
        this.Perusahaan = this.findViewById(R.id.Perusahaan);
        this.rating = this.findViewById(R.id.rating);
        this.ulasan = this.findViewById(R.id.ulasan);
        this.role_inti = this.findViewById(R.id.role_inti);
        this.Lokasi = this.findViewById(R.id.Lokasi);
        this.kerja = this.findViewById(R.id.kerja);
        this.bayaran = this.findViewById(R.id.bayaran);
        this.keterangan_pekerjaan = this.findViewById(R.id.keterangan_pekerjaan);
        this.syarat = this.findViewById(R.id.syarat);
        this.syarat_rinci = this.findViewById(R.id.syarat_rinci);
        this.btUnggahLowongan = this.findViewById(R.id.UnggahLowongan);

        this.btUnggahLowongan.setOnClickListener(Applyjobs1.this);

        TextView Role_besar = findViewById(R.id.Role_besar);
        TextView Perusahaaan = findViewById(R.id.Perusahaan);
        TextView Rating = findViewById(R.id.rating);
        TextView Ulasan = findViewById(R.id.ulasan);
        TextView role_inti = findViewById(R.id.role_inti);
        TextView Lokasi = findViewById(R.id.Lokasi);
        TextView Kerja = findViewById(R.id.kerja);
        TextView Bayaran = findViewById(R.id.bayaran);
        TextView keterangan_pekerjaan = findViewById(R.id.keterangan_pekerjaan);
        TextView syarat = findViewById(R.id.syarat);
        TextView syarat_rinci = findViewById(R.id.syarat_rinci);

        Intent apply1 = getIntent();

        String teksRole_besar = apply1.getStringExtra("Role_besar");
        String teksPerusahaan = apply1.getStringExtra("Perusahaan");
        String teksRating = apply1.getStringExtra("rating");
        String teksUlasan = apply1.getStringExtra("ulasan");
        String teksRole_inti = apply1.getStringExtra("role_inti");
        String teksLokasi = apply1.getStringExtra("Lokasi");
        String teksKerja = apply1.getStringExtra("kerja");
        String teksBayaran = apply1.getStringExtra("bayaran");
        String teksKeterangan_pekerjaan = apply1.getStringExtra("keterangan_pekerjaan");
        String teksSyarat = apply1.getStringExtra("syarat");
        String teksSyarat_rinci = apply1.getStringExtra("syarat_rinci");

        Role_besar.setText(teksRole_besar);
        Perusahaaan.setText(teksPerusahaan);
        Rating.setText(teksRating);
        Ulasan.setText(teksUlasan);
        role_inti.setText(teksRole_inti);
        Lokasi.setText(teksLokasi);
        Kerja.setText(teksKerja);
        Bayaran.setText(teksBayaran);
        keterangan_pekerjaan.setText(teksKeterangan_pekerjaan);
        syarat.setText(teksSyarat);
        syarat_rinci.setText(teksSyarat_rinci);

    }

    @Override
    public void onClick(View view) {
        Intent apply1 = new Intent(this, Applyjobs2.class);
        String teksRole_besar = this.Role_besar.getText().toString();
        apply1.putExtra("Role_besar", teksRole_besar);

        String teksPerusahaan = this.Perusahaan.getText().toString();
        apply1.putExtra("Perusahaan", teksPerusahaan);

        String teksRating = this.rating.getText().toString();
        apply1.putExtra("rating", teksRating);

        String teksUlasan = this.ulasan.getText().toString();
        apply1.putExtra("ulasan", teksUlasan);

        String teksRole_inti = this.role_inti.getText().toString();
        apply1.putExtra("role_inti", teksRole_inti);

        String teksLokasi = this.Lokasi.getText().toString();
        apply1.putExtra("Lokasi", teksLokasi);

        String teksKerja = this.kerja.getText().toString();
        apply1.putExtra("kerja", teksKerja);

        String teksBayaran = this.bayaran.getText().toString();
        apply1.putExtra("bayaran", teksBayaran);

        String teksKeterangan_pekerjaan = this.keterangan_pekerjaan.getText().toString();
        apply1.putExtra("keterangan_pekerjaan", teksKeterangan_pekerjaan);

        String teksSyarat = this.syarat.getText().toString();
        apply1.putExtra("syarat", teksSyarat);

        String teksSyarat_rinci = this.syarat_rinci.getText().toString();
        apply1.putExtra("syarat_rinci", teksSyarat_rinci);
        startActivity(apply1);
    }

}