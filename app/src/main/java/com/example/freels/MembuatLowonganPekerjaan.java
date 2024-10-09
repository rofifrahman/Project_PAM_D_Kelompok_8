package com.example.freels;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MembuatLowonganPekerjaan extends AppCompatActivity{

    private EditText namaPerusahaan;
    private EditText pekerjaan;
    private Spinner spinnerLokasi;
    private Spinner spinnerJenisPekerjaan;
    private EditText gajiMinimum;
    private EditText gajiMaksimum;
    private EditText ringkasanPekerjaan;
    private EditText kualifikasiPekerjaan;
    private Button btUnggahLogo;
    private Button btUnggahLowongan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membuat_lowongan_pekerjaan);

        this.namaPerusahaan = this.findViewById(R.id.InputNamaPerusahaan);
        this.pekerjaan = this.findViewById(R.id.InputPekerjaan);
        this.spinnerLokasi = this.findViewById(R.id.DropDownLokasi);
        this.spinnerJenisPekerjaan = this.findViewById(R.id.DropDownJenisPekerjaan);
        this.gajiMinimum = this.findViewById(R.id.InputGajiMinimum);
        this.gajiMaksimum = this.findViewById(R.id.InputGajiMaksimum);
        this.ringkasanPekerjaan = this.findViewById(R.id.InputRingkasanPekerjaan);
        this.kualifikasiPekerjaan = this.findViewById(R.id.InputKualifikasiPekerjaan);
        this.btUnggahLogo = this.findViewById(R.id.UnggahLogoPerusahaan);
        this.btUnggahLowongan = this.findViewById(R.id.UnggahLowongan);

        spinnerLokasi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String text = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayList<String> arrayListLokasi = new ArrayList<>();
        arrayListLokasi.add("Aceh");
        arrayListLokasi.add("Sumatera Utara");
        arrayListLokasi.add("Sumatera Barat");
        arrayListLokasi.add("Riau");
        arrayListLokasi.add("Jambi");
        arrayListLokasi.add("Sumatera Selatan");
        arrayListLokasi.add("Bengkulu");
        arrayListLokasi.add("Lampung");
        arrayListLokasi.add("Kepulauan Bangka Belitung");
        arrayListLokasi.add("Kepulauan Riau");
        arrayListLokasi.add("DKI Jakarta");
        arrayListLokasi.add("Jawa Barat");
        arrayListLokasi.add("Jawa Tengah");
        arrayListLokasi.add("DI Yogyakarta");
        arrayListLokasi.add("Jawa Timur");
        arrayListLokasi.add("Banten");
        arrayListLokasi.add("Bali");
        arrayListLokasi.add("Nusa Tenggara Barat");
        arrayListLokasi.add("Nusa Tenggara Timur");
        arrayListLokasi.add("Kalimantan Barat");
        arrayListLokasi.add("Kalimantan Tengah");
        arrayListLokasi.add("Kalimantan Selatan");
        arrayListLokasi.add("Kalimantan Timur");
        arrayListLokasi.add("Kalimantan Utara");
        arrayListLokasi.add("Sulawesi Utara");
        arrayListLokasi.add("Sulawesi Tengah");
        arrayListLokasi.add("Sulawesi Selatan");
        arrayListLokasi.add("Sulawesi Tenggara");
        arrayListLokasi.add("Gorontalo");
        arrayListLokasi.add("Sulawesi Barat");
        arrayListLokasi.add("Maluku");
        arrayListLokasi.add("Maluku Utara");
        arrayListLokasi.add("Papua Barat");
        arrayListLokasi.add("Papua");
        ArrayAdapter<String> adapterLokasi = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayListLokasi);
        adapterLokasi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLokasi.setAdapter(adapterLokasi);

        spinnerJenisPekerjaan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String text = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayList<String> arrayListJenisPekerjaan = new ArrayList<>();
        arrayListJenisPekerjaan.add("Full Time");
        arrayListJenisPekerjaan.add("Part Time");
        arrayListJenisPekerjaan.add("Intern");
        ArrayAdapter<String> adapterJenisPekerjaan = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayListJenisPekerjaan);
        adapterJenisPekerjaan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJenisPekerjaan.setAdapter(adapterJenisPekerjaan);

        this.btUnggahLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MembuatLowonganPekerjaan.this, "Unggah Logo Perusahaan", Toast.LENGTH_SHORT).show();
                Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivity(gallery);
            }
        });

        this.btUnggahLowongan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MembuatLowonganPekerjaan.this, BetaHomePage.class);
                String teksNamaPerusahaan = namaPerusahaan.getText().toString();
                i.putExtra("namaPerusahaan", teksNamaPerusahaan);

                String teksPekerjaan = pekerjaan.getText().toString();
                i.putExtra("pekerjaan", teksPekerjaan);

                String teksLokasi = spinnerLokasi.getSelectedItem().toString();
                i.putExtra("lokasi", teksLokasi);

                String teksJenisPekerjaan = spinnerJenisPekerjaan.getSelectedItem().toString();
                i.putExtra("jenisPekerjaan", teksJenisPekerjaan);

                String teksGajiMinimum = gajiMinimum.getText().toString();
                i.putExtra("gajiMinimum", teksGajiMinimum);

                String teksGajiMaksimum = gajiMaksimum.getText().toString();
                i.putExtra("gajiMaksimum", teksGajiMaksimum);

                String teksRingkasanPekerjaan = ringkasanPekerjaan.getText().toString();
                i.putExtra("ringkasanPekerjaan", teksRingkasanPekerjaan);

                String teksKualifikasiPekerjaan = kualifikasiPekerjaan.getText().toString();
                i.putExtra("kualifikasiPekerjaan", teksKualifikasiPekerjaan);
                startActivity(i);
            }
        });
    }
}