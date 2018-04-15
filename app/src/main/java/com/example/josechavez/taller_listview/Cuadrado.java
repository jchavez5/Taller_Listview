package com.example.josechavez.taller_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
    private EditText txtLadoCuadrado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        txtLadoCuadrado=findViewById(R.id.txtLadoCuadrado);
         }
        public void calcular(View  v){
        double l=Double.parseDouble(txtLadoCuadrado.getText().toString());
        double resultado=new Metodos().areaCuadrado(l);
        Figura f=new Figura("Area del Cuadrado","Lado: "+l,resultado);
        f.guardar();
        Toast.makeText(getApplicationContext(),"Resultado "+resultado,Toast.LENGTH_SHORT).show();
        borrar();
        }
        public void borrar(){
            txtLadoCuadrado.setText("");
        }
        }



