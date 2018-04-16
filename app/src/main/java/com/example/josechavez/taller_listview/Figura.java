package com.example.josechavez.taller_listview;

/**
 * Created by Josechavez on 15/04/2018.
 */

public class Figura {
    private String operacion;
    private String dato;
    private Double resultado;

    public Figura(String operacion, String dato, Double resultado) {
        this.operacion = operacion;
        this.dato = dato;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    public void guardar(){
        Dato.guardar(this);
    }

}
