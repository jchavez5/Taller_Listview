package com.example.josechavez.taller_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cilindro extends AppCompatActivity {
    private EditText txtRadio,txtAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        txtRadio=findViewById(R.id.txtCilindro);
        txtAltura=findViewById(R.id.txtAltura);
    }
        public void calcular(View v){
            if ((Metodos.valida(txtRadio,getResources().getString(R.string.error),
                    getResources().getString(R.string.error_1)))&&(Metodos.valida(txtAltura,getResources().getString(R.string.error),
                    getResources().getString(R.string.error_1)))){
                double R=Double.parseDouble(txtRadio.getText().toString());
                double A=Double.parseDouble(txtAltura.getText().toString());
                double resultado=new Metodos().volumen_cilindro(R,A);
                Figura f=new Figura(getResources().getString(com.example.josechavez.taller_listview.R.string.area_circulo),getResources().getString(com.example.josechavez.taller_listview.R.string.radio)+R
                        +"\n"+getResources().getString(com.example.josechavez.taller_listview.R.string.altura)+A,resultado);
                f.guardar();
                Toast.makeText(getApplicationContext(),getResources().getString(com.example.josechavez.taller_listview.R.string.resultado)+""+resultado,Toast.LENGTH_SHORT).show();
                }

    }
    public void borrar(View v){
        txtRadio.setText("");
        txtAltura.setText("");}
}
