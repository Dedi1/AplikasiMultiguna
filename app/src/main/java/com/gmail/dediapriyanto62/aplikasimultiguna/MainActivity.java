package com.gmail.dediapriyanto62.aplikasimultiguna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inputdata(View view) {
        Intent intent = new Intent(MainActivity.this, input_data.class);
        startActivity(intent);
    }

    public void pencarianlokasi(View view) {
        Intent intent = new Intent(MainActivity.this, pencarian_lokasi.class);
        startActivity(intent);
    }

    public void kompas(View view) {
        Intent intent = new Intent(MainActivity.this, kompas.class);
        startActivity(intent);
    }
}
