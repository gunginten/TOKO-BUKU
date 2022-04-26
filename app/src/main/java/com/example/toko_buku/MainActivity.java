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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsername = (EditText) findViewById(R.id.etUsername);
        EditText etPassword = (EditText) findViewById(R.id.etPassword);
        Button login = (Button) findViewById(R.id.btnLogin);
        Button regis = (Button) findViewById(R.id.btnregis);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
//                String success_pesan = "Yeayyy aku berhasil login deh. Hallo ";

//                validasi
                if(isEmpty(username)){
                    Toast.makeText(getApplicationContext(), "Silahkan input data username Anda", Toast.LENGTH_SHORT).show();
                }else{
                    if(isEmpty(password)){
                        Toast.makeText(getApplicationContext(), "Silahkan input data password Anda", Toast.LENGTH_SHORT).show();
                    }else{
                        Intent intent = new Intent(MainActivity.this, Dashboard.class);
                        intent.putExtra("nama", username);
//                        intent.putExtra("sukses_pesan", success_pesan);
                        startActivity(intent);
                    }
                }
//                nama_class nama_variabel = new nama_class(paramater);

            }
        });

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Registrasi.class);
                startActivity(intent3);
            }
        });
    }
}