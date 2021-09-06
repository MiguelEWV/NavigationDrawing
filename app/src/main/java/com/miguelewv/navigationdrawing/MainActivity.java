package com.miguelewv.navigationdrawing;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    //==================Creacion de las variables internas de los layout============================
    //==========Advertencia el menu drawer funciona sin estas opciones =============================
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    //==============================================================================================
    //================== Varivel de boton de teste==================
    //Button button;
//===============




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//===============================Referenciar los objetos de otras classes===========================

/*=========================Advertencia el menu Drawer funciona sin estas opciones ==================
=======Llamada y creacion del boton superior de tres lineas de la barra superior customizada======*/
        toolbar = findViewById(R.id.barrasuperior);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.Layout_Principal_activity_main);
        navigationView = findViewById(R.id.vistaDeNavegacion);
/*===========================Aqui se hizo la llamada de la barra superior ==========================
=======Advertencia para funcionar deve ser retiradq la barra superior por defecto ================
==============Sera quitada en el manifest o thema general en opcion de thema NoActtionBar=========*/
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();
//==================================================================================================

        Button button = findViewById(R.id.botonpruevafueradelfragment);
        button.setOnClickListener(v -> {


            actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar, R.string.open, R.string.close);
            drawerLayout.addDrawerListener(actionBarDrawerToggle);
            Toast.makeText(MainActivity.this, "BEM-VINDO A MINHA REDE", Toast.LENGTH_SHORT).show();
                            }

        );

    }

}