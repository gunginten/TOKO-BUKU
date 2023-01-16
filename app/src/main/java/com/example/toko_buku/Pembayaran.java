package com.example.toko_buku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pembayaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        EditText edtnamabuku = findViewById(R.id.namabuku);
        EditText edtjumlahbeli = findViewById(R.id.jumlahbeli);
        EditText edtharga = findViewById(R.id.harga);
        EditText edtuangbayar = findViewById(R.id.uangbayar);
        Button btnproses = findViewById(R.id.tombol1);
        Button btnhapus = findViewById(R.id.tombol2);
        Button btnexit = findViewById(R.id.tombol3);
        TextView txtnamabuku = findViewById(R.id.namabuku);
        TextView txtjumlahbeli = findViewById(R.id.jumlahbeli);
        TextView txtharga = findViewById(R.id.harga);
        TextView txtuangbayar = findViewById(R.id.uangbayar);
        TextView txttotalbelanja = findViewById(R.id.totalbelanja);
        TextView txtuangkembali = findViewById(R.id.uangkembali);

        //memberikan action pada tombol proses

        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namabarang = edtnamabuku.getText().toString().trim();
                String jumlahbeli = edtjumlahbeli.getText().toString().trim();
                String harga = edtharga.getText().toString().trim();
                String uangbayar = edtuangbayar.getText().toString().trim();

                double jb = Double.parseDouble(jumlahbeli);
                double h = Double.parseDouble(harga);
                double ub = Double.parseDouble(uangbayar);
                double total = (jb * h);
                txttotalbelanja.setText("Total Belanja : " + total);

                double uangkembalian = (ub - total);

                if (ub < total) {
                    txtuangkembali.setText("Uang Kembali : Rp ");
                } else {
                    txtuangkembali.setText("Uang Kembali : " + uangkembalian);
                }
            }

        });

        //memberikan action pada tombol reset data
        btnhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnamabuku.setText(" ");
                txttotalbelanja.setText(" Total Belanja : Rp 0");
                txtharga.setText(" ");
                txtuangbayar.setText(" ");
                txtuangkembali.setText("Uang Kembali : Rp 0");
                txtjumlahbeli.setText(" ");

                Toast.makeText(getApplicationContext(), "Data sudah direset", Toast.LENGTH_SHORT).show();
            }
        });

        // memberikan action pada tombol keluar

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pembayaran = new Intent(Pembayaran.this, Dashboard.class);
                startActivity(pembayaran);
            }
        });



    }
}