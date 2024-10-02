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

public class Homepage extends AppCompatActivity implements View.OnClickListener {

    private EditText Role1;
    private EditText Perusahaan1;
    private EditText lokasi1;
    private EditText rincian1;
    private EditText Role2;
    private EditText Perusahaan2;
    private EditText lokasi2;
    private EditText rincian2;
    private EditText Role3;
    private EditText Perusahaan3;
    private EditText lokasi3;
    private EditText rincian3;
    private Button btUnggahLowongan;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        this.Role1 = this.findViewById(R.id.Role1);
        this.Perusahaan1 = this.findViewById(R.id.Perusahaan1);
        this.lokasi1 = this.findViewById(R.id.lokasi1);
        this.rincian1 = this.findViewById(R.id.rincian1);
        this.Role2 = this.findViewById(R.id.Role2);
        this.Perusahaan2 = this.findViewById(R.id.Perusahaan2);
        this.lokasi2 = this.findViewById(R.id.lokasi2);
        this.rincian2 = this.findViewById(R.id.rincian2);
        this.Role3 = this.findViewById(R.id.Role3);
        this.Perusahaan3 = this.findViewById(R.id.Perusahaan3);
        this.lokasi3 = this.findViewById(R.id.lokasi3);
        this.rincian3 = this.findViewById(R.id.rincian3);
        this.btUnggahLowongan = this.findViewById(R.id.UnggahLowongan);

        this.btUnggahLowongan.setOnClickListener(Homepage.this);

        TextView role1 = findViewById(R.id.Role1);
        TextView perusahaan1 = findViewById(R.id.Perusahaan1);
        TextView lokasi1 = findViewById(R.id.lokasi1);
        TextView rincian1 = findViewById(R.id.rincian1);
        TextView role2 = findViewById(R.id.Role2);
        TextView perusahaan2 = findViewById(R.id.Perusahaan2);
        TextView lokasi2 = findViewById(R.id.lokasi2);
        TextView rincian2 = findViewById(R.id.rincian2);
        TextView role3 = findViewById(R.id.Role3);
        TextView perusahaan3 = findViewById(R.id.Perusahaan3);
        TextView lokasi3 = findViewById(R.id.lokasi3);
        TextView rincian3 = findViewById(R.id.rincian3);


        Intent homepage = getIntent();

        String teksRole1 = homepage.getStringExtra("Role1");
        String teksPerusahaan1 = homepage.getStringExtra("Perusahaan1");
        String teksLokasi1 = homepage.getStringExtra("lokasi1");
        String teksRincian1 = homepage.getStringExtra("rincian1");
        String teksRole2 = homepage.getStringExtra("Role2");
        String teksPerusahaan2 = homepage.getStringExtra("Perusahaan2");
        String teksLokasi2 = homepage.getStringExtra("lokasi2");
        String teksRincian2 = homepage.getStringExtra("rincian2");
        String teksRole3 = homepage.getStringExtra("Role3");
        String teksPerusahaan3 = homepage.getStringExtra("Perusahaan3");
        String teksLokasi3 = homepage.getStringExtra("lokasi3");
        String teksRincian3 = homepage.getStringExtra("rincian3");

        role1.setText(teksRole1);
        perusahaan1.setText(teksPerusahaan1);
        lokasi1.setText(teksLokasi1);
        rincian1.setText(teksRincian1);
        role2.setText(teksRole2);
        perusahaan2.setText(teksPerusahaan2);
        lokasi2.setText(teksLokasi2);
        rincian2.setText(teksRincian2);
        role3.setText(teksRole3);
        perusahaan3.setText(teksPerusahaan3);
        lokasi3.setText(teksLokasi3);
        rincian3.setText(teksRincian3);

    }

    @Override
    public void onClick(View view) {
        Intent Homepage = new Intent(this, Applyjobs1.class);
        String teksRole1 = this.Role1.getText().toString();
        Homepage.putExtra("Role1", teksRole1);

        String teksPerusahaan1 = this.Perusahaan1.getText().toString();
        Homepage.putExtra("Perusahaan1", teksPerusahaan1);

        String teksLokasi1 = this.lokasi1.getText().toString();
        Homepage.putExtra("lokasi1", teksLokasi1);

        String teksRincian1 = this.rincian1.getText().toString();
        Homepage.putExtra("rincian1", teksRincian1);

        String teksRole2 = this.Role2.getText().toString();
        Homepage.putExtra("Role2", teksRole2);

        String teksPerusahaan2 = this.Perusahaan2.getText().toString();
        Homepage.putExtra("Perusahaan2", teksPerusahaan2);

        String teksLokasi2 = this.lokasi2.getText().toString();
        Homepage.putExtra("lokasi2", teksLokasi2);

        String teksRincian2 = this.rincian2.getText().toString();
        Homepage.putExtra("rincian2", teksRincian2);

        String teksRole3 = this.Role3.getText().toString();
        Homepage.putExtra("Role3", teksRole3);

        String teksPerusahaan3 = this.Perusahaan3.getText().toString();
        Homepage.putExtra("Perusahaan3", teksPerusahaan3);

        String teksLokasi3 = this.lokasi3.getText().toString();
        Homepage.putExtra("lokasi3", teksLokasi3);

        String teksRincian3 = this.rincian3.getText().toString();
        Homepage.putExtra("rincian3", teksRincian3);
        startActivity(Homepage);
    }


}