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

class MainActivity2 : AppCompatActivity () {

//====Palavra reservada 'lateinit' para declaracao das variaveis depois

    lateinit var toogle: ActionBarDrawerToggle
    val drawerKotlin = findViewById<DrawerLayout>(R.id.drawerKotlin)
    //val visualKotlin = findViewById<>(R.id.visual_de_navegacion_kotlin)

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //==================================================================================================

        toogle = ActionBarDrawerToggle(this, drawerKotlin, R.string.open, R.string.close)
        drawerKotlin.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        visualKotlin.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.k2 -> {supportFragmentManager.beginTransaction().apply { replace(R.id.contenedor_de_fragment_kotlin,fragment2k())}}
            }
            //otros aqui
            //ocultar el drawerlayout despues de clicar en la opcion escojida
            drawerKotlin.closeDrawer(GravityCompat.START)
        true
        }


    }
//Icono del menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }




}