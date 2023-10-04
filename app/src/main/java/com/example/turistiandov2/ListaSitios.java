package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.Moldes.MoldeSitios;
import com.example.turistiandov2.adaptadores.AdaptadorSitios;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    ArrayList <MoldeSitios> listasitios=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclerView=findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("sitios")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreSitios=document.getString("nombre");
                                String nombreGuiaSitios=document.getString("nombre guia");
                                String precioSitios=document.getString("precio");
                                String telefonoSitios=document.getString("telefono");
                                String descripcionSitios=document.getString("descripcion");
                                Toast.makeText(ListaSitios.this, nombreSitios, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitios.this, nombreGuiaSitios, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitios.this, precioSitios, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitios.this, telefonoSitios, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitios.this, descripcionSitios, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorSitios adaptadorSitios=new AdaptadorSitios(listasitios);
        recyclerView.setAdapter(adaptadorSitios);
    }

    private void llenarListaConDatos() {
        listasitios.add(new MoldeSitios("Caño Cristales","Pepito Perez","325 5056829","$125.000",R.drawable.canocristales,R.drawable.canocristalitos2,5.0f,"En el centro de Colombia reside un tesoro de incalculable riqueza natural, un territorio biodiverso enmarcado por ríos coloridos, bosques y vastas llanuras que se repliegan en el municipio de La Macarena, área protegida por Parques Naturales Nacionales de Colombia","Es un lugar increiblemente hermoso y los colores del rio paren irreales"));
        listasitios.add(new MoldeSitios("Jardín Botánico De La Macarena","Samantha Jaramillo","328 5066850","$155.000",R.drawable.jardinbotanico,R.drawable.jardin2,5.0f,"El jardín botánico tiene en sus 650 hectáreas más de 4% de la biodiversidad vegetal colombiana.\n" +
                "\n" +
                "Es una reserva ecológica, centro de estudio de flora y fauna.\n" +
                "\n" +
                "Centro de estudio de la relación entre el ser humano y la naturaleza.\n" +
                "\n" +
                "Centro agroecológico piloto con finca, ganadería, biofábrica, huerta y vivero.\n" +
                "\n" +
                "A través del turismo de naturaleza compartir y manejar la experiencia del jardín botánico y la región.","Tuve la oportunidad de viajar en familia al Meta para conocer Caño Cristales, me quede muy sorprendida de las maravillas de mi país y su gente, nuestra operadora turística Alejandra del Jardín Botánico de la Macarena, una mujer emprendedora y excelente anfitriona con una gran conciencia ecológica. Ella muy amable nos oriento en todo lo que fue nuestra travesía inolvidable. Muy recomendada. Gracias Alejandra por tu increíble hospitalidad"));
        listasitios.add(new MoldeSitios("Madrevieja del Carmen","Juan jose","320 6066135","$135.000",R.drawable.carme,R.drawable.madre2,3.5f,"Como reserva privada, La Madrevieja de El Carmen se propone la restauración ecológica del bosque amazónico que se encuentra en su jurisdicción tras una histórica intervención ganadera que le hizo perder buena parte de sus bosques, flora y fauna nativa.","Un lugar muy acojedor"));


    }
}