package com.example.josechavez.taller_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Esfera extends AppCompatActivity {
    private EditText txtEsfera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        txtEsfera=findViewById(R.id.txtEsfera);
    }
    public void calcular(View v){

        double E=Double.parseDouble(txtEsfera.getText().toString());
        double resultado=new Metodos().volumen_esfera(E);
        Figura f=new Figura(getString(R.string.esfera_area),getString(R.string.radio)+E,resultado);
        f.guardar();
        Toast.makeText(getApplicationContext(),getString(R.string.resultado)+""+resultado,Toast.LENGTH_SHORT).show();

    }
    public void borrar(View v){
        txtEsfera.setText("");}
}
