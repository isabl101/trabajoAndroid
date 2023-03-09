package com.example.ejer4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombre1, nombre2, nombre3, edad1, edad2, edad3;
    TextView nombreHermanos, promedioInput;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        nombre1= findViewById(R.id.nombre1);
        nombre2= findViewById(R.id.nombre2);
        nombre3= findViewById(R.id.nombre3);
        edad1= findViewById(R.id.edad1);
        edad2= findViewById(R.id.edad2);
        edad3= findViewById(R.id.edad3);
        nombreHermanos= findViewById(R.id.nombreHermanos);
        promedioInput= findViewById(R.id.promedioInput);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hermano1 = nombre1.getText().toString();
                String hermano2 = nombre2.getText().toString();
                String hermano3 = nombre3.getText().toString();

                float ed1 = Float.parseFloat(edad1.getText().toString());
                float ed2 = Float.parseFloat(edad2.getText().toString());
                float ed3 = Float.parseFloat(edad3.getText().toString());

                float promedio = ((ed1 + ed2 + ed3) / 3);
                String r = String.valueOf(promedio);

                nombreHermanos.setText("Nombres ingresados: "+ hermano1 + ", " + hermano2 + ", " +hermano3 );
                promedioInput.setText("El promedio de sus edades es: " + promedio);

            }
        });
    }
}