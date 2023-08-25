package com.example.clasesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.clasesqlite.clases.cProducto;
import com.example.clasesqlite.controladores.ctlProducto;

public class crearPersona extends AppCompatActivity {
    Button btnView;

    EditText nombre;
    EditText precio;
    EditText stock;
    TextView vista;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_persona);
        nombre = findViewById(R.id.txtnombre);
        precio = findViewById(R.id.txtprecio);
        stock = findViewById(R.id.txtstock);
        vista = findViewById(R.id.txtvista);

    }

    public void crearProducto(View view) {
        Button txt =(Button) view;
        ctlProducto pt = new ctlProducto(getApplicationContext());
        int st = Integer.parseInt(stock.getText().toString());
        double pc = Double.parseDouble(precio.getText().toString());
        cProducto pr = new cProducto(nombre.getText().toString(),pc,st);
         long id = pt.crearProducto(pr);
         vista.setText("nuro"+id);
    }
}