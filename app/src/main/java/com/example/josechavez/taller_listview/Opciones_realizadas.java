package com.example.josechavez.taller_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Opciones_realizadas extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Figura> figura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_realizadas);
        tabla = findViewById(R.id.tabla);
        figura= Dato.obtener();
        for (int i  = 0; i < figura.size(); i++) {
            TableRow fila = new TableRow(this    );
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+i+1);
            c2.setText(figura.get(i).getOperacion());
            c3.setText(figura.get(i).getDato());
            c4.setText(figura.get(i).getResultado().toString());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);





        }

    }
}
