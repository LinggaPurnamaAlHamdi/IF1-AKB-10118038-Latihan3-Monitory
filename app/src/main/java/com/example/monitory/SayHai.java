/**
 Tanggal pengerjaan : 07 Mei 2021
 Deskripsi Pekerjaan : Membuat tampilan bagian SayHai dan melempar nilai dari Biodata ke SayHai
 NIM : 10118038
 Nama : Lingga Purnama Al Hamdi
 Kelas : IF-1
 **/
package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SayHai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);
        TextView txtNama = (TextView) findViewById(R.id.kamu1);
        Intent intent = getIntent();
        String nama = intent.getStringExtra(Biodata.MSG);
        txtNama.setText(nama);

        TextView txtNama2 = (TextView) findViewById(R.id.kamu2);
        txtNama2.setText(nama);
    }
}