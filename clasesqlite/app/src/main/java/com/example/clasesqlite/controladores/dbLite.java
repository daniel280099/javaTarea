package com.example.clasesqlite.controladores;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbLite extends SQLiteOpenHelper {

    public dbLite(@Nullable Context context, @Nullable String name, int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table if not exists productos\n" +
                "(idProd Integer primary key AUTOINCREMENT ,\n" +
                "nombProd text not null,\n" +
                "precioProd double not null,\n" +
                "stockProd int not null);";
        db.execSQL(sql);
        sql = "create table if not exists personas\n" +
                "(idPers Integer primary key ,\n" +
                "nombPers text not null,\n" +
                "dniPers text not null );";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
