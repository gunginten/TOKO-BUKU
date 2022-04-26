package com.example.toko_buku;

import static android.text.TextUtils.isEmpty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        EditText etRegisterUsername = (EditText) findViewById(R.id.etRegisterUsername);
        EditText etRegisterName = (EditText) findViewById(R.id.etRegisterName);
        EditText etRegisterPassword = (EditText) findViewById(R.id.etRegisterPassword);
        Button btnRegister = (Button) findViewById(R.id.btnRegister);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Registrasi.this, MainActivity.class);
                startActivity(intent2);

            }
        });




    }
}