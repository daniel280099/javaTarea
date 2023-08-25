package com.example.clasesqlite;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;


import com.example.clasesqlite.controladores.ctlProducto;
import com.example.clasesqlite.databinding.ActivityInicioBinding;

public class inicio extends AppCompatActivity {

    private ActivityInicioBinding binding;
    TextView consola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInicioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //ctlProducto control = new ctlProducto(getApplicationContext());
      //cProducto prod= new cProducto(0,"pepsi",2.5,50);
     // long id= crearProducto(prod);
      //consola.append("\nse agrego el producto con id="+id);
        //listar();
    }


    public void saltarCrearPersona(View view) {
        Intent i = new Intent(this, crearPersona.class);
        startActivity(i);
    }

    public void mostarVistas(View view) {
        Intent i = new Intent(this, mostrarVistas.class);
        startActivity(i);
    }
}