package com.example.estudiante.myapplication;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; //Es necesario importer las librerias
//VIEW e INTENT
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCosta(View v){
        final TextView descripcion = (TextView) findViewById(R.id.txtDescrip);
        final ImageView img = (ImageView) findViewById(R.id.ImgLugar);
        img.setImageResource(R.drawable.costa);
        descripcion.setText("Lugar turístico de la Costa");
        Toast toast1 =  Toast.makeText(getApplicationContext(),"Conozca este lugar en: https://ec.viajandox.com/costa-R11", Toast.LENGTH_SHORT);
        toast1.show();
    }

    public void showSierra(View v){
        final TextView descripcion = (TextView) findViewById(R.id.txtDescrip);
        final ImageView img = (ImageView) findViewById(R.id.ImgLugar);
        img.setImageResource(R.drawable.sierra);
        descripcion.setText("Lugar turístico de la Sierra");
        Toast toast1 =  Toast.makeText(getApplicationContext(),"Conozca este lugar en: https://www.goraymi.com/es-ec/ecuador/lugares-turisticos-sierra-aqrn4eimq", Toast.LENGTH_SHORT);
        toast1.show();
    }
    public void showOriente(View v){
        final TextView descripcion = (TextView) findViewById(R.id.txtDescrip);
        final ImageView img = (ImageView) findViewById(R.id.ImgLugar);
        img.setImageResource(R.drawable.oriente);
        descripcion.setText("Lugar turístico del Oriente");
        Toast toast1 =  Toast.makeText(getApplicationContext(),"Conozca este lugar en: https://www.goraymi.com/es-ec/ecuador/lugares-turisticos-oriente-ecuatoriano-arpstjsy0", Toast.LENGTH_SHORT);
        toast1.show();
    }
    public void showGalapagos(View v){
        final TextView descripcion = (TextView) findViewById(R.id.txtDescrip);
        final ImageView img = (ImageView) findViewById(R.id.ImgLugar);
        img.setImageResource(R.drawable.galapagos);
        descripcion.setText("Lugar turístico de Galapagos");
        Toast toast1 =  Toast.makeText(getApplicationContext(),"Conozca este lugar en: https://naturegalapagos.com/es/lugares-turisticos-de-galapagos", Toast.LENGTH_SHORT);
        toast1.show();
    }
}