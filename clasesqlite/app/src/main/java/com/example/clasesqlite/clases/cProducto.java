package com.example.clasesqlite.clases;

public class cProducto {
    private int idProd;
    private String nombProd;
    private double precioProd;
    private int stockProd;

    public cProducto(int idProd, String nombProd, double precioProd, int stockProd) {
        this.idProd = idProd;
        this.nombProd = nombProd;
        this.precioProd = precioProd;
        this.stockProd = stockProd;
    }
    public cProducto( String nombProd, double precioProd, int stockProd) {
        this.nombProd = nombProd;
        this.precioProd = precioProd;
        this.stockProd = stockProd;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombProd() {
        return nombProd;
    }

    public void setNombProd(String nombProd) {
        this.nombProd = nombProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

    public int getStockProd() {
        return stockProd;
    }

    public void setStockProd(int stockProd) {
        this.stockProd = stockProd;
    }

    @Override
    public String toString() {
        return "cProducto{" +
                "idProd=" + idProd +
                ", nombProd='" + nombProd + '\'' +
                ", precioProd=" + precioProd +
                ", stockProd=" + stockProd +
                '}';
    }
}
