package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sitios_Home extends AppCompatActivity {

    Button botonVermas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_home);

        botonVermas=findViewById(R.id.botonsitios);

        botonVermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sitios_Home.this,ListaSitios.class);
                startActivity(intent);
            }
        });
    }
}