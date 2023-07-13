package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText cajaNombreUsuario;
    EditText cajaNombreContrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.usuario);
        cajaNombreContrasena=findViewById(R.id.contraseña);

        //capturando datos del type
        String nombreUsuario=cajaNombreUsuario.getText().toString();
        String contrasena=cajaNombreContrasena.getText().toString();
    }
}