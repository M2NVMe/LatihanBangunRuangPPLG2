package com.example.latihanbangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Username,PW;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = findViewById(R.id.txtUSR);
        PW = findViewById(R.id.txtPW);
        Login = findViewById(R.id.btnLGN);


        Login.setOnClickListener(new View.OnClickListener() {
            String Nama = "m2sjmail@gmail.com";
            String PWS = "Bagus";
            @Override
            public void onClick(View view) {
                if (Username.getText().toString().equals(Nama) && PW.getText().toString().equals(PWS)) {
                    Intent intent = new Intent(MainActivity.this, utama.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login Gagal!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}