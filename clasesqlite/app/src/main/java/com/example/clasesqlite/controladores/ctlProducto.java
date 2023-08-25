package com.example.clasesqlite.controladores;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;

import com.example.clasesqlite.clases.cProducto;

import java.util.ArrayList;

public class ctlProducto {
    dbLite db;
    Context context;
    SQLiteDatabase sqlite;
    TextView consola;
    public ctlProducto(Context context) {
        this.context = context;
        this.db = new dbLite(context.getApplicationContext(), "productos",1);
    }


    public long crearProducto(cProducto prod){
        sqlite=db.getWritableDatabase();
        ContentValues elemento= new ContentValues();
        elemento.put("nombProd",prod.getNombProd());
        elemento.put("precioProd",prod.getPrecioProd());
        elemento.put("stockProd",prod.getStockProd());
        return sqlite.insert("productos",null,elemento);
    }
    public ArrayList<cProducto> Listar(){
        ArrayList<cProducto> datos= new ArrayList<>();
        SQLiteDatabase sqlite=db.getReadableDatabase();
        String[] columnas={"idProd","nombProd","precioProd","stockProd"};
        Cursor cursor=sqlite.query("productos",
                columnas,
                null,
                null,
                null,
                null,
                "idProd desc");
        if (cursor==null){
            consola.append("\n No se pudo leer realizar la consulta");
            return datos;
        }
        if(!cursor.moveToFirst()){
            consola.append("\n No existen elementos");
            return  datos;
        }
        do{
            cProducto prod= new cProducto(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getDouble(2),
                    cursor.getInt(3));
            consola.append("\n"+prod.toString());
            datos.add(prod);
        }while (cursor.moveToNext());
        cursor.close();
        return datos;
    }
}
