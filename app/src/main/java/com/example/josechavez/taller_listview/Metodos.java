package com.example.josechavez.taller_listview;

import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Josechavez on 15/04/2018.
 */

public class Metodos {
    public static double areaCuadrado(double lado){return lado*lado;}
    public static double areaCirculo(double radio){return(radio*radio)*Math.PI;}
    public static double areaTriangulo(double base, double altura){return  (base*altura)/2;    }
    public static double areaRectangulo(double base, double altura){return  base*altura;    }
    public static double volumen_esfera(double radio){return (Math.pow(radio,3)*Math.PI*4)/3;  }
    public static double volumen_cilindro(double radio, double altura){ return (Math.pow(radio,2)*Math.PI*altura);    }
    public static double volumen_cono(double radio, double altura){ return (Math.pow(radio,2)*Math.PI*altura)/3;   }
    public static double volumen_cubo(double arista){return Math.pow(arista,3);  }

}
