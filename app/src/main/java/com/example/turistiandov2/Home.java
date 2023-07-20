package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class  Home extends AppCompatActivity {

    //Zona de los atributos
    Button hoteles;
    Button restaurantes;
    Button sitios;

    TextView bienvenido;

    public void cambiaridioma(String idioma){
        //configurar el lenguaje del telefono
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configuramos globalmente el telefono
        Configuration configTelefono= getResources().getConfiguration();

        configTelefono.locale=lenguaje;

        //ejecutamos la config
        getBaseContext().getResources().updateConfiguration(configTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String nombre=getIntent().getStringExtra("nombre");
        Toast.makeText(this, "Bienvenido: "+nombre, Toast.LENGTH_SHORT).show();

        hoteles=findViewById(R.id.botonhoteles);
        restaurantes=findViewById(R.id.botonrestaurantes);
        sitios=findViewById(R.id.botonsitios);
        bienvenido=findViewById(R.id.cliente);

        //uniendotexto del putextra CON EL TEXTVIEW
        bienvenido.setText(nombre);


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
               this.cambiaridioma("en");
               Intent intentingles=new Intent(Home.this, Home.class);
               startActivity(intentingles);
           break;

           case(R.id.opcion2):
               this.cambiaridioma("es");
               Intent intentes=new Intent(Home.this, Home.class);
               startActivity(intentes);
           break;

           case(R.id.opcion3):
               this.cambiaridioma("it");
               Intent intentItaliano=new Intent(Home.this, Home.class);
               startActivity(intentItaliano);
               break;


           case(R.id.opcion4):
                    Intent intent=new Intent(Home.this,AcercaSolucion.class);
                    startActivity(intent);
               break;

       }
       return super.onOptionsItemSelected(items);
    }


}