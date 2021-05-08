/**
 Tanggal pengerjaan : 07 Mei 2021
 Deskripsi Pekerjaan : Membuat tampilan awal aplikasi Monitory
 NIM : 10118038
 Nama : Lingga Purnama Al Hamdi
 Kelas : IF-1
 **/
package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
        public void logincode(View view) {
            Intent intent1 = new Intent(this, LoginCode.class );
            startActivity(intent1);
            finish();
        }

    }