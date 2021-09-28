package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class pantalla extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);
        Intent intent = getIntent();
        String mensaje = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        // Capture the layout's TextView and set the string as its text
        TextView titulo = findViewById(R.id.titulo);
        TextView resulta=findViewById(R.id.resultado);
        titulo.setText("");
        titulo.setText(mensaje);
        if(mensaje.equals("Resultado de la suma")){
String txtnume1=getIntent().getStringExtra("num1");
String txtnume2=getIntent().getStringExtra("num2");
Double resultados;
resultados=Double.parseDouble(txtnume1)+Double.parseDouble(txtnume2);
resulta.setText("");
resulta.setText(resultados.toString());

}
if(mensaje.equals("Resultado de la multiplicacion")){
    String txtnume1=getIntent().getStringExtra("num1");
    String txtnume2=getIntent().getStringExtra("num2");
    Double resultados;
    resultados=Double.parseDouble(txtnume1)*Double.parseDouble(txtnume2);
    resulta.setText("");
    resulta.setText(resultados.toString());

}
if(mensaje.equals("Resultado de la resta")){
    String txtnume1=getIntent().getStringExtra("num1");
    String txtnume2=getIntent().getStringExtra("num2");
    Double resultados;
    resultados=Double.parseDouble(txtnume1)-Double.parseDouble(txtnume2);
    resulta.setText("");
    resulta.setText(resultados.toString());

 }
if(mensaje.equals("Resultado de la division")){
    String txtnume1=getIntent().getStringExtra("num1");
    String txtnume2=getIntent().getStringExtra("num2");
    Double resultados;
    resultados=Double.parseDouble(txtnume1)/Double.parseDouble(txtnume2);
    resulta.setText("");
    resulta.setText(resultados.toString());

}
}
    }
