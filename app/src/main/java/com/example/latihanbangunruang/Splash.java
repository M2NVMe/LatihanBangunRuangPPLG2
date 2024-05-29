package com.example.latihanbangunruang;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    private static int TIMEOUT = 2000;
    private static final String SharedPref = "mypref";
    private static final String usernm = "name";
    private static final String PWs = "paswod";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences sharepref = getSharedPreferences(SharedPref, Context.MODE_PRIVATE);
        String naem = sharepref.getString(usernm, null);

        if (naem != null) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Splash.this, utama.class);
                    startActivity(intent);
                    finish();
                }
            }, TIMEOUT);
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, TIMEOUT);
        }
    }
}