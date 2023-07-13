package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class  Home extends AppCompatActivity {

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
                Intent intenthoteles=new Intent(Home.this,Hoteles_Home.class);
                startActivity(intenthoteles);
            }
        });

        //detectando eventos
        restaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentrestaurantes=new Intent(Home.this,Restaurantes_Home.class);
                startActivity(intentrestaurantes);
            }
        });

        //detectando eventos
       sitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsitios=new Intent(Home.this,Sitios_Home.class);
                startActivity(intentsitios);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem items){
       int itemSeleccionado= items.getItemId();
       switch (itemSeleccionado){

           case(R.id.opcion1):

               break;

           case(R.id.opcion2):

               break;

           case(R.id.opcion3):

               break;

           case(R.id.opcion4):
                    Intent intent=new Intent(Home.this,AcercaSolucion.class);
                    startActivity(intent);
               break;

       }
       return super.onOptionsItemSelected(items);
    }

    public void cambiaridioma(String idioma){

    }
}