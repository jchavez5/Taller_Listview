package com.example.josechavez.taller_listview;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void calculo_Area_rectangulo(){
        double  base =2, altura=4;
        double resultado= Metodos.areaRectangulo(base,altura);
        assertEquals(8,resultado,0);
    }
    @Test
    public void calculo_Area_circulo(){
        double  radio=4;
        double resultado= Metodos.areaCirculo(radio);
        assertEquals(50.265482457436691815402294132472,resultado,0);
    }
    @Test
    public void calculo_volumen_esfera(){
        double  radio =2;
        double resultado= Metodos.volumen_esfera(radio);
        assertEquals(33.510321638291124,resultado,0);
    }
    @Test
    public void calculo_volumen_cubo(){
        double  arista =2;
        double resultado= Metodos.volumen_cubo(arista);
        assertEquals(8,resultado,0);
    }
}