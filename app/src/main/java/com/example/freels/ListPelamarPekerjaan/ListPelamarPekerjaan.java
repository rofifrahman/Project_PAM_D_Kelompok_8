package com.example.freels.ListPelamarPekerjaan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freels.R;

import java.util.*;

public class ListPelamarPekerjaan extends AppCompatActivity {

    private RecyclerView rvListPelamar;
    private ListPelamarAdapter listPelamarAdapter;
    int [] profilePicture = {R.drawable.profile_picture_1, R.drawable.profile_picture_2, R.drawable.profile_picture_3, R.drawable.profile_picture_4, R.drawable.profile_picture_5, R.drawable.profile_picture_6, R.drawable.profile_picture_8};
    private Spinner spFilterPendidikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pelamar_pekerjaan);

        this.rvListPelamar = this.findViewById(R.id.rvListPelamar);
        List<ListPelamar> dataListPelamar = new ArrayList<>();
        dataListPelamar.add(new ListPelamar("John Doe", profilePicture[0], "Sekolah Dasar"));
        dataListPelamar.add(new ListPelamar("Jane Smith", profilePicture[1], "Sekolah Menengah Pertama"));
        dataListPelamar.add(new ListPelamar("Bob Johnson", profilePicture[2], "Sekolah Menengah Atas"));
        dataListPelamar.add(new ListPelamar("Alice Brown", profilePicture[3], "Diploma"));
        dataListPelamar.add(new ListPelamar("Tom Wilson", profilePicture[4], "Sarjana"));
        dataListPelamar.add(new ListPelamar("Emily Davis", profilePicture[5], "Magister"));
        dataListPelamar.add(new ListPelamar("David Lee", profilePicture[6], "Doktor"));
        dataListPelamar.add(new ListPelamar("Sarah Miller", profilePicture[0], "Sekolah Dasar"));
        dataListPelamar.add(new ListPelamar("Mike Clark", profilePicture[1], "Sekolah Menengah Pertama"));
        dataListPelamar.add(new ListPelamar("Jessica Taylor", profilePicture[2], "Sekolah Menengah Atas"));

        listPelamarAdapter = new ListPelamarAdapter(this, dataListPelamar);
        rvListPelamar.setAdapter(listPelamarAdapter);
        rvListPelamar.setLayoutManager(new LinearLayoutManager(this));

        listPelamarAdapter.notifyDataSetChanged();

        this.spFilterPendidikan = findViewById(R.id.spFilterPendidikan);
        spFilterPendidikan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String text = adapterView.getItemAtPosition(i).toString();
                listPelamarAdapter.getFilter().filter(text);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayList<String> arrayFilterPendidikan = new ArrayList<>();
        arrayFilterPendidikan.add("Semua Pendidikan");
        arrayFilterPendidikan.add("Sekolah Dasar");
        arrayFilterPendidikan.add("Sekolah Menengah Pertama");
        arrayFilterPendidikan.add("Sekolah Menengah Atas");
        arrayFilterPendidikan.add("Diploma");
        arrayFilterPendidikan.add("Sarjana");
        arrayFilterPendidikan.add("Magister");
        arrayFilterPendidikan.add("Doktor");
        ArrayAdapter<String> adapterFilterPendidikan = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arrayFilterPendidikan);
        adapterFilterPendidikan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spFilterPendidikan.setAdapter(adapterFilterPendidikan);
    }
}