package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoteles_Home extends AppCompatActivity {

    Button botonVerMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_home);

        botonVerMas=findViewById(R.id.botonhoteles);

        botonVerMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Hoteles_Home.this,ListaHoteles.class);
                startActivity(intent);
            }
        });
    }
}