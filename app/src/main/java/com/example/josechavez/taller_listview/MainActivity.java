package com.example.josechavez.taller_listview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;
    private EditText txtcaja;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lstOpciones);
        opc=getResources().getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,opc);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in=new Intent(MainActivity.this,Areas.class);
                        startActivity(in);
                        break;
                    case 1:
                        in=new Intent(MainActivity.this,Volumenes.class);
                        startActivity(in);
                        break;
                    case 2:
                        in=new Intent(MainActivity.this,Opciones_realizadas.class);
                        startActivity(in);
                        break;
                }

            }}


        );

   }


}
