package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeRestaurantes;
import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList <MoldeRestaurantes> listarestaurantes = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView=findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreRestaurante=document.getString("nombre");
                                String rangoPreciosRestaurantes=document.getString("rango precios");
                                String telefonoRestaurantes=document.getString("telefono");
                                String platoRecomendadoRestaurantes=document.getString("plato recomendado");
                                String descripcionRestaurantes=document.getString("descripcion");
                                Toast.makeText(ListaRestaurantes.this, nombreRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, rangoPreciosRestaurantes, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, telefonoRestaurantes, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, platoRecomendadoRestaurantes, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, descripcionRestaurantes, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });


        llenarListasConDatos();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(listarestaurantes);
        recyclerView.setAdapter(adaptadorRestaurante);


    }

    private void llenarListasConDatos() {
        listarestaurantes.add(new MoldeRestaurantes("Café De Lithos",R.drawable.cafe,R.drawable.cafe2,"319 2346558","$5.000-$15.000","Pizza Todo Terreno",4.3f,"TIPOS DE COMIDA\n" +
                "Italiana, Peruana, Café, Sudamericana\n" +
                "COMIDAS\n" +
                "Desayuno, Almuerzo, Cena, Brunch, Abierto hasta tarde, Bebidas\n" +
                "CARACTERÍSTICAS\n" +
                "Entrega a domicilio, Comida para llevar, Asientos al aire libre, Estacionamiento en la calle, Sirve alcohol, Vino y cerveza, Solo pago en efectivo, Wi-Fi gratis, Servicio de mesa, Apto para perros, Estilo familiar","Un lugar único. Aunque no tenían ningún tipo de café, pedimos limonada de coco y agua de hierbas y estaba demasiado rico. Si van a La Macarena, este sitio es de paso obligado"));
        listarestaurantes.add(new MoldeRestaurantes("El caporal",R.drawable.restauranteelcaporal,R.drawable.elcapporal2,"313 4990196","$20.000-$40.000","Punta de anca",2.5f,"Aquí sirven un tierno asado. Un gran número de clientes se han dado cuenta de que el personal es bueno en este restaurante. La mayoría de críticos encuentran que el servicio es apropiado. Según el criterio de los usuarios, su mayor problema son sus satisfactorios precios. Tan pronto como entras en este establecimiento","Restaurante asadero, las carnes son sabrosas aunque porciones pequeñas, platos de acuerdo al precio, atención rápida, lugar ordenado y limpio, amplio, tiene convenio con parqueadero"));
        listarestaurantes.add(new MoldeRestaurantes("Calle Cuarta",R.drawable.callecuarta,R.drawable.callecuarta2,"300 2659620","$25.000-$35.000","Chorizo",1.5f,"Creado para ser un espacio que nos permita salir de la rutina del día a día. Un ambiente diferente","buena atención y ambiente agradable"));
        listarestaurantes.add(new MoldeRestaurantes("Llano Y Leyenda",R.drawable.llano,R.drawable.llano2,"319 2545860","$35.000-$55.000","Carne Asada",4.8f,"Restaurante Llano Y Leyenda se encuentra en La Macarena (Meta). Restaurante Llano Y Leyenda está trabajando en actividades de Restaurantes.","Gran lugar para comer y compartir la cultura llanera de la Macarena como sitio turístico de los más importantes de Colombia"));
        listarestaurantes.add(new MoldeRestaurantes("Playa Alta-Bar",R.drawable.playaalta,R.drawable.playaalta2,"310 7847043","$55.000-$100.000","Coctel De camarones",4.9f,"Playa Alta Restaurante - Bar te da la bienvenida a su restaurante temático, donde podrás encontrar comida colombiana y mucho mas\n" +
                "Abierto hoy hasta las 23:30","Super delicioso, las porciones son muy buenas, el lugar está muy bien ambientado, buena música y comida deliciosa."));

    }
}