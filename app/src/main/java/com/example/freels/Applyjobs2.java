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

public class Applyjobs2 extends AppCompatActivity implements View.OnClickListener {
    private EditText namaPelamar;
    private EditText usia;
    private EditText alamat;
    private EditText editTextText;
    private EditText editTextText2;
    private EditText editTextText3;
    private EditText editTextText4;
    private EditText editTextText5;
    private EditText editTextText6;
    private EditText editTextText7;
    private EditText editTextText8;
    private EditText editTextText9;
    private EditText keterangan_tambahan;
    private Button btUnggahLowongan;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applyjobs2);
        this.namaPelamar = this.findViewById(R.id.nama_pelamar);
        this.usia = this.findViewById(R.id.usia);
        this.alamat = this.findViewById(R.id.alamat);
        this.editTextText = this.findViewById(R.id.editTextText);
        this.editTextText2 = this.findViewById(R.id.editTextText2);
        this.editTextText3 = this.findViewById(R.id.editTextText3);
        this.editTextText4 = this.findViewById(R.id.editTextText4);
        this.editTextText5 = this.findViewById(R.id.editTextText5);
        this.editTextText6 = this.findViewById(R.id.editTextText6);
        this.editTextText7 = this.findViewById(R.id.editTextText7);
        this.editTextText8 = this.findViewById(R.id.editTextText8);
        this.editTextText9 = this.findViewById(R.id.editTextText9);
        this.keterangan_tambahan = this.findViewById(R.id.keterangan_tambahan);
        this.btUnggahLowongan = this.findViewById(R.id.UnggahLowongan);

        this.btUnggahLowongan.setOnClickListener(Applyjobs2.this);
    }

    @Override
    public void onClick(View view) {
        Intent apply2 = new Intent(this, Homepage.class);
        String TeksNamaPelamar = this.namaPelamar.getText().toString();
        apply2.putExtra("namaPelamar", TeksNamaPelamar);

        String TeksUsia = this.usia.getText().toString();
        apply2.putExtra("usia", TeksUsia);

        String TeksAlamat = this.alamat.getText().toString();
        apply2.putExtra("alamat", TeksAlamat);

        String TeksEditTextText = this.editTextText.getText().toString();
        apply2.putExtra("editTextText", TeksEditTextText);

        String TeksEditTextText2 = this.editTextText2.getText().toString();
        apply2.putExtra("editTextText2", TeksEditTextText2);

        String TeksEditTextText3 = this.editTextText3.getText().toString();
        apply2.putExtra("editTextText3", TeksEditTextText3);

        String TeksEditTextText4 = this.editTextText4.getText().toString();
        apply2.putExtra("editTextText4", TeksEditTextText4);

        String TeksEditTextText5 = this.editTextText5.getText().toString();
        apply2.putExtra("editTextText5", TeksEditTextText5);

        String TeksEditTextText6 = this.editTextText6.getText().toString();
        apply2.putExtra("editTextText6", TeksEditTextText6);

        String TeksEditTextText7 = this.editTextText7.getText().toString();
        apply2.putExtra("editTextText7", TeksEditTextText7);

        String TeksEditTextText8 = this.editTextText8.getText().toString();
        apply2.putExtra("editTextText8", TeksEditTextText8);

        String TeksEditTextText9 = this.editTextText9.getText().toString();
        apply2.putExtra("editTextText9", TeksEditTextText9);

        String TeksKeterangan_tambahan = this.keterangan_tambahan.getText().toString();
        apply2.putExtra("keterangan_tambahan", TeksKeterangan_tambahan);
        startActivity(apply2);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_applyjobs2);

        TextView namaPelamar = findViewById(R.id.nama_pelamar);
        TextView usia = findViewById(R.id.usia);
        TextView alamat = findViewById(R.id.alamat);
        TextView editTextText = findViewById(R.id.editTextText);
        TextView editTextText2 = findViewById(R.id.editTextText2);
        TextView editTextText3 = findViewById(R.id.editTextText3);
        TextView editTextText4 = findViewById(R.id.editTextText4);
        TextView editTextText5 = findViewById(R.id.editTextText5);
        TextView editTextText6 = findViewById(R.id.editTextText6);
        TextView editTextText7 = findViewById(R.id.editTextText7);
        TextView editTextText8 = findViewById(R.id.editTextText8);
        TextView editTextText9 = findViewById(R.id.editTextText9);
        TextView keterangan_tambahan = findViewById(R.id.keterangan_tambahan);

        Intent apply2 = getIntent();

        String teksNamaPelamar = apply2.getStringExtra("namaPelamar");
        String teksUsia = apply2.getStringExtra("usia");
        String teksAlamat = apply2.getStringExtra("alamat");
        String teksEditTextText = apply2.getStringExtra("editTextText");
        String teksEditTextText2 = apply2.getStringExtra("editTextText2");
        String teksEditTextText3 = apply2.getStringExtra("editTextText3");
        String teksEditTextText4 = apply2.getStringExtra("editTextText4");
        String teksEditTextText5 = apply2.getStringExtra("editTextText5");
        String teksEditTextText6 = apply2.getStringExtra("editTextText6");
        String teksEditTextText7 = apply2.getStringExtra("editTextText7");
        String teksEditTextText8 = apply2.getStringExtra("editTextText8");
        String teksEditTextText9 = apply2.getStringExtra("editTextText9");
        String teksKeterangan_tambahan = apply2.getStringExtra("keterangan_tambahan");

        namaPelamar.setText(teksNamaPelamar);
        usia.setText(teksUsia);
        alamat.setText(teksAlamat);
        editTextText.setText(teksEditTextText);
        editTextText2.setText(teksEditTextText2);
        editTextText3.setText(teksEditTextText3);
        editTextText4.setText(teksEditTextText4);
        editTextText5.setText(teksEditTextText5);
        editTextText6.setText(teksEditTextText6);
        editTextText7.setText(teksEditTextText7);
        editTextText8.setText(teksEditTextText8);
        editTextText9.setText(teksEditTextText9);
        keterangan_tambahan.setText(teksKeterangan_tambahan);

    }
}