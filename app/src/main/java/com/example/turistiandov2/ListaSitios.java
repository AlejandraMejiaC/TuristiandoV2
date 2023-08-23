package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.Moldes.MoldeSitios;
import com.example.turistiandov2.adaptadores.AdaptadorSitios;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    ArrayList <MoldeSitios> listasitios=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclerView=findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorSitios adaptadorSitios=new AdaptadorSitios(listasitios);
        recyclerView.setAdapter(adaptadorSitios);
    }

    private void llenarListaConDatos() {
        listasitios.add(new MoldeSitios("Caño Cristales","Pepito Perez","325 5056829","$125.000",R.drawable.canocristales));
        listasitios.add(new MoldeSitios("Jardín Botánico De La Macarena","Samantha Jaramillo","328 5066850","$155.000",R.drawable.jardinbotanico));
        listasitios.add(new MoldeSitios("Madrevieja del Carmen","Juan jose","320 6066135","$135.000",R.drawable.carme));


    }
}