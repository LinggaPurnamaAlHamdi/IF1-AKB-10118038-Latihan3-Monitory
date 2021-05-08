/**
 Tanggal pengerjaan : 07 Mei 2021
 Deskripsi Pekerjaan : Membuat tampilan untuk mengisi nama panggilan dan umur
 NIM : 10118038
 Nama : Lingga Purnama Al Hamdi
 Kelas : IF-1
 **/
package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {
    public static final String MSG = "com.example.monitory.MSG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }
    public void sayhai(View view){
        EditText edtNama = (EditText) findViewById(R.id.txteditnama);
        String nama = edtNama.getText().toString();
        Intent intent = new Intent(this, SayHai.class);
        intent.putExtra(MSG,nama);
        startActivity(intent);
    }
}