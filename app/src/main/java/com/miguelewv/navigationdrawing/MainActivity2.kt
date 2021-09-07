package com.miguelewv.navigationdrawing

import android.app.ActionBar
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.miguelewv.navigationdrawing.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity () {

//====Palavra reservada 'lateinit' para declaracao das variaveis depois

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

       // setSupportActionBar(binding.contenedorDeFragmentLayoutActivityMain2.toolbar)

        val drawerLayout: DrawerLayout = binding.layoutPrincipalActivityMain2
        val navView: NavigationView = binding.vistadenavegacionLayoutActivityMain2
        val navController = findNavController(R.id.contenedor_layout_contenido_principal2)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.fragment2k2, R.id.fragment4k2, R.id.fragment8k2
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //==================================================================================================


    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.contenedor_layout_contenido_principal2)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}