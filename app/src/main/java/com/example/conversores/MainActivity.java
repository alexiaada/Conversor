package com.example.conversores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabHost tbh;
    TextView tempVal;
    Spinner spn;
    Button btn;
    conversores miObj = new conversores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh = findViewById(R.id.tbhConversor);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec("LONGITUD").setContent(R.id.Longitud).setIndicator("LONGITUD", null));
        tbh.addTab(tbh.newTabSpec("ALMACENAMIENTO").setContent(R.id.Almacenamiento).setIndicator("ALMACENAMIENTO", null));
        tbh.addTab(tbh.newTabSpec("MONEDAS").setContent(R.id.Monedas).setIndicator("MONEDAS", null));
        tbh.addTab(tbh.newTabSpec("MASA").setContent(R.id.Masa).setIndicator("MASA", null));
        tbh.addTab(tbh.newTabSpec("TRANSFERENCIA").setContent(R.id.Transferencia).setIndicator("TRANSFERENCIA", null));
        tbh.addTab(tbh.newTabSpec("TIEMPO").setContent(R.id.Tiempo).setIndicator("TIEMPO", null));
        tbh.addTab(tbh.newTabSpec("VOLUMEN").setContent(R.id.Volumen).setIndicator("VOLUMEN", null));
        btn = findViewById(R.id.btnConvertirLongitud);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn = findViewById(R.id.spnDeLongitud);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnALongitud);
                int a = spn.getSelectedItemPosition();


                tempVal = findViewById(R.id.txtCantidadLongitud);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(0, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: "+ resp, Toast.LENGTH_LONG).show();
            }
        });

        btn = findViewById(R.id.btnConvertirAlmacenamiento);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeAlmacenamiento);
                int de = spn.getSelectedItemPosition();
                spn = findViewById(R.id.spnAAlmacenamiento);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadAlmacenamiento);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(1, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: "+ resp, Toast.LENGTH_LONG).show();
            }
        });

        btn = findViewById(R.id.btnConvertirMonedas);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeMonedas);
                int de = spn.getSelectedItemPosition();
                spn = findViewById(R.id.spnAMonedas);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadMonedas);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(2, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: "+ resp, Toast.LENGTH_LONG).show();
            }
        });

        btn = findViewById(R.id.btnConvertirMasa);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeMasa);
                int de = spn.getSelectedItemPosition();
                spn = findViewById(R.id.spnAMasa );
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadMasa);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(3, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: "+ resp, Toast.LENGTH_LONG).show();
            }
        });

        btn = findViewById(R.id.btnConvertirTransferencia);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeTransferencia);
                int de = spn.getSelectedItemPosition();
                spn = findViewById(R.id.spnATransferencia);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadTransferencia);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(4, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: "+ resp, Toast.LENGTH_LONG).show();
            }
        });

        btn = findViewById(R.id.btnConvertirTiempo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeTiempo);
                int de = spn.getSelectedItemPosition();
                spn = findViewById(R.id.spnATiempo);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadTiempo);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(5, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: "+ resp, Toast.LENGTH_LONG).show();
            }
        });

        btn = findViewById(R.id.btnConvertirVolumen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeVolumen);
                int de = spn.getSelectedItemPosition();
                spn = findViewById(R.id.spnAVolumen);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadVolumen);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(6, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: "+ resp, Toast.LENGTH_LONG).show();
            }
        });

    }
}

class conversores{
    double[][] valores={
            {1, 100, 39.3701, 3.28084, 1.193, 1.09361, 0.001, 0.000621371},//Longitud
            {1, 8, 1000 * 8, Math.pow(1000, 2) * 8, Math.pow(1000, 3) * 8, Math.pow(1000, 4) * 8, Math.pow(1000, 5) * 8, Math.pow(1000, 6) * 8, Math.pow(1000, 7) * 8,
                    1024 * 8, Math.pow(1024, 2) * 8, Math.pow(1024, 3) * 8, Math.pow(1024, 4) * 8, Math.pow(1024, 5) * 8, Math.pow(1024, 6) * 8, Math.pow(1024, 7) * 8,},//Almacenamiento
            {1, 0.93, 7.81, 17.14, 149.27, 0.79, 24.73, 36.78, 1.35, 3946.75, 965.92, 830.67, 8.76},//Monedas
            {1,1000,1000000,1000000000,5000,0.15747304,2.20462262,0.001,35.273962, 0.01},//Masa
            {1, 1000000,125000,1000,125, 0.125, 0.001, 0.000125, 0.000125, 0.000000125},//Transferencia de datos
            {1,60,3600,3600000,3600000000.0,1.0/24.0,1.0/168.0, 1.0/(30.417*24.0),1.0/(24.0*365.0),1/(24.0*3650.0)},//Tiempo
            {1,4,8,128,256,768,3785.41,3.78541,15.7725, 0.00378541},//Volumen
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a]/valores[opcion][de]*cantidad;
    }
}
