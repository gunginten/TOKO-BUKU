package com.example.toko_buku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView hello = findViewById(R.id.hello);

        Intent gunginten = getIntent();
        String nama_dari_intent = gunginten.getStringExtra("nama");
        String sukses = gunginten.getStringExtra("sukses_pesan");
//        hello.setText(sukses + nama_dari_intent);
        Toast.makeText(getApplicationContext(), "Hallo " + nama_dari_intent+"!!! Selamat datang di Aplikasi kami:)", Toast.LENGTH_SHORT).show();
    }
}