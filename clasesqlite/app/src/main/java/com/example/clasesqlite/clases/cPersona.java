package com.example.clasesqlite.clases;

public class cPersona {
    private int idPersona;
    private String nomPersona;
    private String dniPersona;

    public cPersona(int idPersona, String nomPersona, String dniPersona) {
        this.idPersona = idPersona;
        this.nomPersona = nomPersona;
        this.dniPersona = dniPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(String dniPersona) {
        this.dniPersona = dniPersona;
    }
}
