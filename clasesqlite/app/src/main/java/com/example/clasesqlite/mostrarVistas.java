package com.example.clasesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.clasesqlite.clases.cProducto;
import com.example.clasesqlite.controladores.ctlProducto;

public class mostrarVistas extends AppCompatActivity {
    TextView consola;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_vistas);
        consola = findViewById(R.id.vista2);

        listando();
    }
    public void listando(){
        ctlProducto pl = new ctlProducto(getApplicationContext());
        pl.Listar();

    }
}