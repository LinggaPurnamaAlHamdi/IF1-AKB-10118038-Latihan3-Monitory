/**
 Tanggal pengerjaan : 07 Mei 2021
 Deskripsi Pekerjaan : Membuat tampilan bagian kode keluarga untuk bisa masuk kedalam aplikasi
 NIM : 10118038
 Nama : Lingga Purnama Al Hamdi
 Kelas : IF-1
 **/
package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
    }
    public void biodata(View view) {
        Intent intent1 = new Intent(this, Biodata.class );
        startActivity(intent1);
        finish();
    }
}