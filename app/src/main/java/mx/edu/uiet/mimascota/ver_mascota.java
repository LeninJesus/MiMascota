package mx.edu.uiet.mimascota;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;

import static mx.edu.uiet.mimascota.R.id.rvMisMascotas;

public class ver_mascota extends AppCompatActivity {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaDeMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_mascota);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listaDeMascotas = (RecyclerView) findViewById(R.id.rvMisMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaDeMascotas.setLayoutManager(llm);
        inicializarListaDeMascotas();
        inicializaAdaptadorMascotas();
    }

    /*


    }
   */

    public  void inicializaAdaptadorMascotas (){
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaDeMascotas.setAdapter(adaptador);
    }


    public void inicializarListaDeMascotas (){
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas(R.drawable.perrito_1,"Procer"));
        mascotas.add(new Mascotas(R.drawable.perrito_2,"Paco"));
        mascotas.add(new Mascotas(R.drawable.perrito_3,"Huesos"));
        mascotas.add(new Mascotas(R.drawable.perrito_4,"Tina"));
        mascotas.add(new Mascotas(R.drawable.perrito_5,"Emilio"));
    }



}
