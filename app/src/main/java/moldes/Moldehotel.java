package moldes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.turistiandov2.R;

public class Moldehotel extends AppCompatActivity {

    private String nombre;

    private String precio;

    private String telefono;

    private Integer foto;

    public Moldehotel (){
       //constructor vacio
    }

    public Moldehotel (String nombre, String precio,String telefono,Integer foto){
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
    }//constructor lleno

    public String getNombre (){return nombre;}

    
}