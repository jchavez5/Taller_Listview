package com.example.josechavez.taller_listview;

import java.util.ArrayList;

/**
 * Created by Josechavez on 15/04/2018.
 */

public class Dato {
    private static ArrayList<Figura> figura = new ArrayList<>();
    public static void guardar (Figura p){
        figura.add(p);
    }
    public static ArrayList<Figura> obtener (){
        return figura;
    }
}
