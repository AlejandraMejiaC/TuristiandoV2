package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //Zona de los atributos
    Button hoteles;
    Button restaurantes;
    Button sitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        hoteles=findViewById(R.id.botonhoteles);
        restaurantes=findViewById(R.id.botonrestaurantes);
        sitios=findViewById(R.id.botonsitios);

        //detectando eventos
        hoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "UwU", Toast.LENGTH_SHORT).show();
            }
        });
    }
}