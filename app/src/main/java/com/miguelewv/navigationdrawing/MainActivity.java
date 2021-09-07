package com.miguelewv.navigationdrawing;


import androidx.appcompat.app.AppCompatActivity;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.os.Bundle;
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
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.miguelewv.navigationdrawing.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.contenedor_layout_contenido_principal);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //setSupportActionBar(binding.barraSuperiorLayoutActivityMain.toolbar);
      //  binding.barraSuperiorLayoutActivityMain.fab.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
      //  });
        DrawerLayout drawer = binding.layoutPrincipalActivityMain;
        NavigationView navigationView = binding.vistadenavegacionLayoutActivityMain;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.fragment2k, R.id.fragment4k, R.id.fragment8k)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.contenedor_layout_contenido_principal);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }




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
        Button button = findViewById(R.id.botonpruevafueradelfragment_layout_contenido_principal);
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

//}