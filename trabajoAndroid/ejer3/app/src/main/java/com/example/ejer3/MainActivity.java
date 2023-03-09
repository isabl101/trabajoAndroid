package com.example.ejer3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText iptParticular, iptBus, iptTaxi, iptMoto;
    TextView totalBus, totalTaxi, totalPart,totalMoto;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iptParticular = findViewById(R.id.iptParticular);
        iptBus = findViewById(R.id.iptBus);
        iptTaxi = findViewById(R.id.iptTaxi);
        iptMoto = findViewById(R.id.iptMoto);

        totalBus = findViewById(R.id.totalBus);
        totalTaxi = findViewById(R.id.totalTaxi);
        totalPart = findViewById(R.id.totalPart);
        totalMoto = findViewById(R.id.totalMoto);

        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float cantParticular = Float.parseFloat(iptParticular.getText().toString());
                float cantBus  = Float.parseFloat(iptBus .getText().toString());
                float cantTaxi = Float.parseFloat(iptTaxi.getText().toString());
                float cantMoto = Float.parseFloat(iptMoto.getText().toString());

                float totParticular = cantParticular * 5000;
                float totBus  = cantBus  * 10000;
                float totTaxi = cantTaxi * 3000;
                float totMoto = cantMoto * 2000;

                String r = String.valueOf(totParticular);
                String rs = String.valueOf(totBus);
                String s = String.valueOf(totTaxi);
                String t = String.valueOf(totMoto);

                totalPart.setText("Recolectado de particulares: " + totParticular + "COP");
                totalBus.setText("Recolectado de buses: " + totBus + "COP");
                totalTaxi.setText("Recolectado de taxis: " + totTaxi + "COP");
                totalMoto.setText("Recolectado de motos: " + totMoto + "COP");
            }
        });
    }
}