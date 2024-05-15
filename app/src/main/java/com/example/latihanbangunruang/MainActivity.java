package com.example.latihanbangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Username,PW;
    Button Login, RGR;
    SharedPreferences sharedPreferences;
    private static final String SharedPref = "mypref";
    private static final String usernm = "name";
    private static final String PWs = "paswod";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = findViewById(R.id.txtUSR);
        RGR = findViewById(R.id.btnRGR);
        PW = findViewById(R.id.txtPW);
        Login = findViewById(R.id.btnLGN);
        sharedPreferences = getSharedPreferences(SharedPref,MODE_PRIVATE);
        String nama = sharedPreferences.getString(usernm,null);
        if (nama != null) {
            Intent sukses = new Intent(MainActivity.this,utama.class);
            startActivity(sukses);
        }

        Login.setOnClickListener(new View.OnClickListener() {
            String Nama = "m2sjmail@gmail.com";
            String PWS = "Bagus";
            @Override
            public void onClick(View view) {
                if (Username.getText().toString().equals(Nama) && PW.getText().toString().equals(PWS)) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(usernm,Username.getText().toString());
                    editor.putString(PWs,PW.getText().toString());
                    editor.apply();

                    Intent intent = new Intent(MainActivity.this, utama.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login Gagal!", Toast.LENGTH_LONG).show();
                }
            }
        });
        RGR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Belom ada bro, nanti dulu", Toast.LENGTH_LONG).show();
            }
        });
    }
}