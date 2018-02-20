package com.example.harisyunanto.harisyunanto_1202154197_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class dineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private String mSpinnerLabel = "";  //mendefinisikan callback pilihan untuk spinner
    private static final String TAG = dineIn.class.getSimpleName();
    private Spinner c;
    private TextView a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        // Membuat Spinner
        Spinner spinner_meja = (Spinner) findViewById(R.id.label_spinner);           //Buat instance objek (spinner_meja) menggunakan elemen Spinner di layout (label_spinner)
        if (spinner_meja != null) {
            spinner_meja.setOnItemSelectedListener(this);                           //tetapkan listener-nya
        }

        // Membuat ArrayAdapter menggunakan string array dan layout spinner yang disediakan android
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.meja_array, android.R.layout.simple_spinner_item);

        // Menspesifikasikan layout yang digunakan saat terdapat daftar pilihan
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        c = (Spinner) findViewById(R.id.label_spinner);

        // Mengaplikasikan adapter ke spinner
        if (spinner_meja != null) {
            spinner_meja.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Log.d(TAG, "onNothingSelected: ");
    }


    public void daftar_menu(View view) {

        a = (TextView) findViewById(R.id.editText_nama);


        String test =  c.getSelectedItem().toString();


        if (a ==null){
            Toast.makeText(this,"Silahkan dilengkapi terlebih dahulu",Toast.LENGTH_LONG).show();
        }

        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = a.getText().toString();
            Toast.makeText(this,"Nama   : " + nama + "Nomor Meja: Meja 1",Toast.LENGTH_LONG).show();
        }

        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = a.getText().toString();
            Toast.makeText(this,"Dine In \n" + "Nama   : " + nama + "\nNomor Meja  : 2",Toast.LENGTH_LONG).show();
        }

        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = a.getText().toString();
            Toast.makeText(this,"Dine In \n" + "Nama   : " + nama + "\nNomor Meja  : 3",Toast.LENGTH_LONG).show();
        }

        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = a.getText().toString();
            Toast.makeText(this,"Dine In \n" + "Nama   : " + nama + "\nNomor Meja  : 4",Toast.LENGTH_LONG).show();
        }

        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = a.getText().toString();
            Toast.makeText(this,"Dine In \n" + "Nama   : " + nama + "\nNomor Meja  : 5",Toast.LENGTH_LONG).show();
        }

        Intent intent = new Intent(this, daftarMenu.class);   //Membuat Intent untuk memulai aktivitas baru
        startActivity(intent);
    }
}
