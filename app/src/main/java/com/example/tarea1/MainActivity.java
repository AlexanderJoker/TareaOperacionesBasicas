package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
EditText nume1,nume2;
Button btnsuma,btnresta,btnmulti,btndivision;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     nume1=(EditText) findViewById(R.id.num1);
     nume2=(EditText) findViewById(R.id.num2);
     btnsuma=(Button) findViewById(R.id.btnsuma);

     btnsuma.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if (!nume1.getText().toString().isEmpty() && !nume2.getText().toString().isEmpty()) {
                 Intent intent = new Intent(getApplicationContext(), pantalla.class);
                 String mensaje = "Resultado de la suma";
                 intent.putExtra("num1", nume1.getText().toString());
                 intent.putExtra("num2", nume2.getText().toString());

                 intent.putExtra(EXTRA_MESSAGE, mensaje);
                 startActivity(intent);
             } else {
                 Toast mensaje = Toast.makeText(getApplicationContext(),"Hay campos vacios", Toast.LENGTH_SHORT);
                 mensaje.show();
             }
         }
     });
        btnresta=(Button) findViewById(R.id.btnresta);
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nume1.getText().toString().isEmpty() && !nume2.getText().toString().isEmpty()) {
                    Intent intent = new Intent(getApplicationContext(), pantalla.class);
                    String mensaje = "Resultado de la resta";
                    intent.putExtra("num1", nume1.getText().toString());
                    intent.putExtra("num2", nume2.getText().toString());

                    intent.putExtra(EXTRA_MESSAGE, mensaje);
                    startActivity(intent);
                } else {
                    Toast mensaje = Toast.makeText(getApplicationContext(),"Hay campos vacios", Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }
        });
        btnmulti=(Button) findViewById(R.id.btnmulti);
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nume1.getText().toString().isEmpty() && !nume2.getText().toString().isEmpty()) {
                    Intent intent = new Intent(getApplicationContext(), pantalla.class);
                    String mensaje = "Resultado de la multiplicacion";
                    intent.putExtra("num1", nume1.getText().toString());
                    intent.putExtra("num2", nume2.getText().toString());

                    intent.putExtra(EXTRA_MESSAGE, mensaje);
                    startActivity(intent);
                } else {
                    Toast mensaje = Toast.makeText(getApplicationContext(),"Hay campos vacios", Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }
        });
        btndivision=(Button) findViewById(R.id.btndivision);
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nume1.getText().toString().isEmpty() && !nume2.getText().toString().isEmpty()) {
                    Intent intent = new Intent(getApplicationContext(), pantalla.class);
                    String mensaje = "Resultado de la division";
                    intent.putExtra("num1", nume1.getText().toString());
                    intent.putExtra("num2", nume2.getText().toString());

                    intent.putExtra(EXTRA_MESSAGE, mensaje);
                    startActivity(intent);
                } else {
                    Toast mensaje = Toast.makeText(getApplicationContext(),"Hay campos vacios", Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }
        });
    }
}