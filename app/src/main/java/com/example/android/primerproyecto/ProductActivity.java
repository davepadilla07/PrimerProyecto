package com.example.android.primerproyecto;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {
    private TextView pagar;
    private Bundle b;
    private String aux, precio;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        pagar = (TextView)findViewById(R.id.txtPagar);
        b = getIntent().getExtras();
        precio = b.getString("precio");
        res = this.getResources();

        aux = res.getString(R.string.p1)+" "+precio;
    }
}
