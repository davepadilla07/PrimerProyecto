package com.example.android.primerproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;



public class MainActivity extends AppCompatActivity {
    private EditText cajaCantidad;
    private Intent i;
    private Bundle b;
    private RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10;
    private ArrayAdapter<String> adapter;
    private String[] opc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaCantidad = (EditText)findViewById(R.id.txtCantidad);

        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);
        r3 = (RadioButton)findViewById(R.id.r3);
        r4 = (RadioButton)findViewById(R.id.r4);
        r5 = (RadioButton)findViewById(R.id.r5);
        r6 = (RadioButton)findViewById(R.id.r6);
        r7 = (RadioButton)findViewById(R.id.r7);
        r8 = (RadioButton)findViewById(R.id.r8);
        r9 = (RadioButton)findViewById(R.id.r9);
        r10 = (RadioButton)findViewById(R.id.r10);

        i = new Intent(this,ProductActivity.class);

        b = new Bundle();




    }

    public void pedido(View v){
        int cant;
        double precio;
        if(validar()) {

            cant = Integer.parseInt(cajaCantidad.getText().toString());

            if (r1.isChecked() && r3.isChecked() && r5.isChecked() && r9.isChecked()){
                precio = cant * 100 * 3200;
                b.putDouble("precio", precio);
                i.putExtras(b);
                startActivity(i);
            }
            if (r1.isChecked() && r3.isChecked() && r5.isChecked() && r10.isChecked()){
                precio = cant * 100;
                b.putDouble("precio", precio);
                i.putExtras(b);
                startActivity(i);
            }
            if (r2.isChecked() && r3.isChecked() && r5.isChecked() && r9.isChecked()){
                precio = cant * 100 * 3200;
                b.putDouble("precio", precio);
                i.putExtras(b);
                startActivity(i);
            }
            if (r2.isChecked() && r3.isChecked() && r5.isChecked() && r10.isChecked()){
                precio = cant * 100;
                b.putDouble("precio", precio);
                i.putExtras(b);
                startActivity(i);
            }


        }


    }


    public void borrar(View v){
        cajaCantidad.setText("");
        r1.setChecked(true);
        r3.setChecked(true);
        r5.setChecked(true);
        r9.setChecked(true);

    }

    public boolean validar(){
        if(cajaCantidad.getText().toString().isEmpty()){
            cajaCantidad.setError(getResources().getString(R.string.error1));
            // Toast.makeText(this,"Digite por favor el nombre",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }


}
