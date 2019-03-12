package com.example.hernandez.proyectoparcialuno;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class principalesmexico extends AppCompatActivity {

    private ViewPager viewPager;
    private int[] layouts;
    private Button ropa;
    private Button cell;
    private Button juegos;
    private PrefManager PrefManager;

    public void controlador() {
        Intent Mexico = new Intent(getApplicationContext(), ropa_mx.class);
        startActivity(Mexico);
    }
    public void controlador2() {
        Intent Mexico = new Intent(getApplicationContext(), cell_mx.class);
        startActivity(Mexico);
    }

    public void controlador3() {
        Intent Mexico = new Intent(getApplicationContext(), juegos_mx.class);
        startActivity(Mexico);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principales);

        ropa = (Button)findViewById(R.id.ropa_mx);
        cell = (Button)findViewById(R.id.telefonos_mx);
        juegos = (Button)findViewById(R.id.videojuegos_mx);

        ropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador();
            }
        });
        cell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador2();
            }
        });
        juegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador3();
            }
        });

    }

}
