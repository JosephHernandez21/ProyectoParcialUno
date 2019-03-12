package com.example.hernandez.proyectoparcialuno;

import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PagInicio extends AppCompatActivity {

    private static final String TAG = PagInicio.class.getSimpleName();

    private ImageButton ps;
    private ImageButton dl;

    public void controlador() {
        Intent Mexico = new Intent(getApplicationContext(), principalesmexico.class);
        startActivity(Mexico);
    }
    public void controlador2() {
        Intent Mexico = new Intent(getApplicationContext(), principales_us.class);
        startActivity(Mexico);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag_inicio);

        ps = (ImageButton)findViewById(R.id.peso);
        dl = (ImageButton)findViewById(R.id.dolar);

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador();
            }
        });

        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador2();
            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"onStart()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    @Override
    protected  void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveIntanceState()");
    }
}
