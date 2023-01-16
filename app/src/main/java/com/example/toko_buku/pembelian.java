package com.example.toko_buku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pembelian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelian);
        Button btnPembayaran = findViewById(R.id.tblpembayaran);

        btnPembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pembayaran = new Intent(pembelian.this, Pembayaran.class);
                startActivity(pembayaran);
            }
        });





    }


}