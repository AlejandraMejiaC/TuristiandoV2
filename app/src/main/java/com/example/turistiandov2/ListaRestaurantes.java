package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.Moldes.MoldeRestaurantes;
import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList <MoldeRestaurantes> listarestaurantes = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView=findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListasConDatos();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(listarestaurantes);
        recyclerView.setAdapter(adaptadorRestaurante);


    }

    private void llenarListasConDatos() {
        listarestaurantes.add(new MoldeRestaurantes("Café De Lithos",R.drawable.cafe,"319 2346558","$5.000-$15.000","Pizza Todo Terreno"));
        listarestaurantes.add(new MoldeRestaurantes("El caporal",R.drawable.restauranteelcaporal,"313 4990196","$20.000-$40.000","Punta de anca"));
        listarestaurantes.add(new MoldeRestaurantes("Calle Cuarta",R.drawable.callecuarta,"300 2659620","$25.000-$35.000","Chorizo"));
        listarestaurantes.add(new MoldeRestaurantes("Llano Y Leyenda",R.drawable.llano,"319 2545860","$35.000-$55.000","Carne Asada"));
        listarestaurantes.add(new MoldeRestaurantes("Playa Alta-Bar",R.drawable.playaalta,"310 7847043","$55.000-$100.000","Coctel De camarones"));

    }
}