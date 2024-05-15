package com.example.latihanbangunruang;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {
    EditText name,password;
    Button register;
    SharedPreferences sharedPreferences;
    private static final String SharedPref = "mypref";
    private static final String usernm = "name";
    private static final String PW = "paswod";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.txtUSR);
        password = findViewById(R.id.txtPW);
        register = findViewById(R.id.btnRGR);
        sharedPreferences = getSharedPreferences(SharedPref,MODE_PRIVATE);

        String nama = sharedPreferences.getString(usernm,null);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(usernm,name.getText().toString());
                editor.putString(PW,password.getText().toString());
                editor.apply();
                Toast.makeText(Register.this,"Register success",Toast.LENGTH_SHORT).show();
            }
        });
    }

}