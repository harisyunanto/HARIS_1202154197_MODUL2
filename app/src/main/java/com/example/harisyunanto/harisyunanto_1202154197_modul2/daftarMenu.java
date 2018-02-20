package com.example.harisyunanto.harisyunanto_1202154197_modul2;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class daftarMenu extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> dataGambar;

    //Daftar Judul
    private String[] Judul = {"Bubur Ayam", "NASI GORENG"};
    //Daftar Judul2
    private String[] test = {"Rp. 60.000", "Rp. 70.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.android1, R.drawable.android4};


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        dataGambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new rv_item(dataMenu, dataHarga, dataGambar);
        rvView.setAdapter(adapter);
    }

    private void DaftarItem() {
        for (int a=0; a<Judul.length; a++){
            dataMenu.add(Judul[a]);
            dataHarga.add(test[a]);
            dataGambar.add(Gambar[a]);
        }
    }
}