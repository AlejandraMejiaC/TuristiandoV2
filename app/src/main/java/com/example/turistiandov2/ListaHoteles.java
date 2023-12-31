package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeHotel;
import com.example.turistiandov2.adaptadores.AdaptadorHoteles;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList <MoldeHotel> listadehoteles=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreHotel=document.getString("nombre");
                                String precioHotel=document.getString("precio");
                                String telefonoHotel=document.getString("telefono");
                                String descripcionHotel=document.getString("descripcion");
                                Toast.makeText(ListaHoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, telefonoHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, descripcionHotel, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listadehoteles);
        recyclerView.setAdapter(adaptadorHoteles);
        }

        public  void llenarListaConDatos (){
            listadehoteles.add(new MoldeHotel("Hostal Cano Nevera","$140.000","314 4626899",R.drawable.canonevera,R.drawable.hostalcanonevera2,"El Hostal Caño Nevera se encuentra en La Macarena y ofrece vistas al jardín, restaurante, recepción 24 horas, bar, jardín, zona de picnic y piscina al aire libre abierta todo el año. Algunos alojamientos tienen balcón y/o patio con vistas a la montaña o al lago.",4.5f,"El establecimiento sirve un desayuno americano, vegetariano o sin gluten. A las parejas les encanta la ubicación — Le han puesto un 9,3 para viajes de dos personas."));
            listadehoteles.add(new MoldeHotel("La Manigua Lodge","$622.000"," 314 7569808",R.drawable.manigua,R.drawable.lamanigualodge2,"En LA MANIGUA LODGE encontrarás un espacio para emocionarte, reactivar tus sentidos, relajarte y sorprenderte con lo que la naturaleza quiera mostrarte durante tu visita.  En este escenario natural tu eres nuestra mayor preocupación, tus sentidos y emociones son nuestra prioridad y tu experiencia es nuestro orgullo.",3.5f,"La ubicación, en mitad de la jungla, es espectacular con sus ventajas y sus inconvenientes. Hay mucha humedad y puedes escuchar los ruidos de la naturaleza en todo su esplendor."));
            listadehoteles.add(new MoldeHotel("Hotel La Fuente","$180.000","313 4967701",R.drawable.hotellafuente,R.drawable.hotellafuente2,"El Hotel la fuente se encuentra en La Macarena y ofrece piscina al aire libre, jardín, restaurante y WiFi gratuita. El hotel cuenta con bañera de hidromasaje y recepción 24 horas.El aeropuerto más cercano es el de La Macarena, ubicado a pocos pasos del hotel.",4.8f,"Es amplio,piscina fenomenal,accesible a la zona viva,limpieza total, personal con una excelente preparacion de atencion al cliente, te dicen si necesitas ayuda de ubicacion, te sugieren lugares que puedes visitar fuera de la ciudad"));
            listadehoteles.add(new MoldeHotel("Posada Los Cristales","$65.000","322 4228084",R.drawable.hotelposadacristales,R.drawable.posada2,"La Posada Los Cristales se encuentra en La Macarena y ofrece salón compartido, bar y WiFi gratuita. Hay aparcamiento privado gratuito y servicio gratuito de enlace con el aeropuerto. Todas las habitaciones de la posada incluyen armario, TV de pantalla plana, baño privado, ropa de cama y toallas.",2.5f,"“La anfitriona siempre fue atenta con nosotros, todo limpio, cama cómoda, y buen aire acondicionado, tiene refrigerador afuera para guardar alimentos y si alguien quiere se cocina ahi.”"));
            listadehoteles.add(new MoldeHotel("Hotel Ecologico Makalombia","$287.000","311 3741990",R.drawable.makalombia,R.drawable.makalombia2,"El Hotel Ecologico Makalombia se encuentra en La Macarena y ofrece vistas a la montaña, WiFi gratuita y aparcamiento privado gratuito.Algunos alojamientos tienen terraza y/o balcón con vistas al río o al jardín. El camping sirve un desayuno vegetariano o vegano.",3.1f,"“El entorno en el que está alojado.Todo muy limpio y bien cuidado La amabilidad del personal"));
        }
}