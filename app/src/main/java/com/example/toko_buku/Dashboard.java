package com.example.toko_buku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView hello = findViewById(R.id.hello);
        LinearLayout linierbuku = findViewById(R.id.linierbuku);
        LinearLayout linierpembelian = findViewById(R.id.linierpembelian);
        LinearLayout liniercontac = findViewById(R.id.liniercontac);



        Intent gunginten = getIntent();
        String nama_dari_intent = gunginten.getStringExtra("nama");
        String sukses = gunginten.getStringExtra("sukses_pesan");
//        hello.setText(sukses + nama_dari_intent);
        Toast.makeText(getApplicationContext(), "Hallo " + nama_dari_intent+"!!! Selamat datang di Aplikasi kami:)", Toast.LENGTH_SHORT).show();

        linierbuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linierbuku = new Intent(Dashboard.this, Buku.class);
                startActivity(linierbuku);
            }
        });


        linierpembelian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linierpembelian = new Intent(Dashboard.this, pembelian.class);
                startActivity(linierpembelian);
            }
        });

        liniercontac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent liniercontac = new Intent(Dashboard.this, contac.class);
                startActivity(liniercontac);
            }
        });
    }

}