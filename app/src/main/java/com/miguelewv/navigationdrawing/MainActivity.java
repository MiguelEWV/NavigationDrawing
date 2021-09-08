package com.miguelewv.navigationdrawing;


import androidx.appcompat.app.AppCompatActivity;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.miguelewv.navigationdrawing.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    //@SuppressWarnings("StatementWithEmptyBody")
   // @Override
    public boolean onNavigationItemSelected (MenuItem item){
        int id = item.getItemId();
        FragmentManager fm = getSupportFragmentManager(); //llamada del suporte del gestor de fragment
        if (id == R.id.webmenu){
            fm.beginTransaction().replace(R.id.escenario,new miguel_fragment()).commit();//opcion para hacer la transferencia
        } else if (id == R.id.k2){
            fm.beginTransaction().replace(R.id.escenario,new tania_fragment()).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.layout_principal_activity_main);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenido_principal);





        //==================Creacion de las variables internas de los layout============================
    //==========Advertencia el menu drawer funciona sin estas opciones =============================
   // DrawerLayout drawerLayout;
   // ActionBarDrawerToggle actionBarDrawerToggle;
   // Toolbar toolbar;
   // NavigationView navigationView;
    //==============================================================================================
    //================== Varivel de boton de teste==================
    //Button button;
//===============




  //  @Override
  //  protected void onCreate(Bundle savedInstanceState) {
   //     super.onCreate(savedInstanceState);
   //     setContentView(R.layout.activity_main);
//===============================Referenciar los objetos de otras classes===========================

/*=========================Advertencia el menu Drawer funciona sin estas opciones ==================
=======Llamada y creacion del boton superior de tres lineas de la barra superior customizada======*/
 /*       toolbar = findViewById(R.id.barrasuperior_layout_activity_main);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.layout_principal_activity_main);
        navigationView = findViewById(R.id.vistadenavegacion_layout_activity_main);
/*===========================Aqui se hizo la llamada de la barra superior ==========================
=======Advertencia para funcionar deve ser retiradq la barra superior por defecto ================
==============Sera quitada en el manifest o thema general en opcion de thema NoActtionBar=========*/
 /*      actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();                              */
//==================================================================================================
/*
        Button button = findViewById(R.id.botonprueva_layout_contenido_principal);
        button.setOnClickListener(v -> {

            Toast.makeText(MainActivity.this, "Boton de Prueva", Toast.LENGTH_SHORT).show();
        }
        );

        Button button2 = findViewById(R.id.boton_flotante_layout_barra_superior);
        button2.setOnClickListener(v -> {

            Toast.makeText(MainActivity.this, "Boton de Prueva Flotante", Toast.LENGTH_SHORT).show();
        }
        );
*/

    }

}