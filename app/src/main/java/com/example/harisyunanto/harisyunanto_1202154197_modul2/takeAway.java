package com.example.harisyunanto.harisyunanto_1202154197_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class takeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {

        //melakukan inisiasi TextInputLayout dengan menggunakan id
        EditText a = (EditText) findViewById(R.id.editText_nama);
        EditText b = (EditText) findViewById(R.id.editText_phone);
        EditText c = (EditText) findViewById(R.id.editText_alamat);
        EditText d = (EditText) findViewById(R.id.editText_catatan);

        //mengambil teks dari objek editText
        String nama = a.getText().toString();
        String telepon = b.getText().toString();
        String alamat = c.getText().toString();
        String catatan = d.getText().toString();

        //jika ada salah satu edittext yang tidak diisi maka akan menampilkan toast
        if (nama.isEmpty() || telepon.isEmpty() || alamat.isEmpty() || catatan.isEmpty()) {
            Toast.makeText(this, "Lengkapi data terlebih dahulu", Toast.LENGTH_LONG).show();

        } else {    //jika semua edit text telah diisi
            //Mengambil data dengan tipe integer dan merubah ke tipe data string agar dapat ditampilkan pada toast
            String month_string = Integer.toString(month + 1);
            String day_string = Integer.toString(day);
            String year_string = Integer.toString(year);

            //Menampilkan toast berisi pesanan
            String dateMessage = (month_string + "/" + day_string + "/" + year_string);
            Toast.makeText(this, "Take Away" + "\nAtas Nama : " + nama + "\nNo Telepon : " + telepon + "\nAkan Mengambil pada : " + getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
        }
    }

    public void processTimePickerResult(int hourOfDay, int minute) {

        //melakukan inisiasi TextInputLayout dengan menggunakan id
        EditText a = (EditText) findViewById(R.id.editText_nama);
        EditText b = (EditText) findViewById(R.id.editText_phone);
        EditText c = (EditText) findViewById(R.id.editText_alamat);
        EditText d = (EditText) findViewById(R.id.editText_catatan);

        //mengambil teks dari objek editText
        String nama = a.getText().toString();
        String telepon = b.getText().toString();
        String alamat = c.getText().toString();
        String catatan = d.getText().toString();

        //jika ada salah satu edittext yang tidak diisi maka akan menampilkan toast
        if (nama.isEmpty() || telepon.isEmpty() || alamat.isEmpty() || catatan.isEmpty()) {
            Toast.makeText(this, "Lengkapi data terlebih dahulu", Toast.LENGTH_LONG).show();

        } else {   //jika semua edit text telah diisi

            //Mengambil data dengan tipe integer dan merubah ke tipe data string agar dapat ditampilkan pada toast
            String hour_string = Integer.toString(hourOfDay);
            String minute_string = Integer.toString(minute);

            //Menampilkan toast berisi pesanan
            String timeMessage = (hour_string + ":" + minute_string);
            Toast.makeText(this, "Take Away" + "\nAtas Nama : " + nama + "\nNo Telepon : " + telepon + "\nAkan Mengambil pada : " + getString(R.string.date) + timeMessage, Toast.LENGTH_SHORT).show();
        }
    }


    public void daftar_menu(View view) {
        Intent intent = new Intent(this, daftarMenu.class);    //Membuat Intent untuk memulai aktivitas baru
        startActivity(intent);      //Menjalankan aktivitas
    }
}
