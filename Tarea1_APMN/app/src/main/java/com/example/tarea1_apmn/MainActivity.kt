package com.example.tarea1_apmn

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar la Toolbar personalizada
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "" // Quita el título de la barra (TAREA 1)

        val navView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        if (savedInstanceState == null) {
            loadFragment(FragmentConfig())
        }

        navView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_config -> loadFragment(FragmentConfig())
                R.id.nav_control -> loadFragment(FragmentControl())
                R.id.nav_ambient -> loadFragment(FragmentAmbiente())
                R.id.nav_devices -> loadFragment(FragmentListaDispositivos())
                R.id.nav_status -> loadFragment(FragmentEstado())
            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_info -> {
                Toast.makeText(this, "App Smart Home - Versión 1.0", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_help -> {
                Toast.makeText(this, "Sección de ayuda en construcción", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_logout -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}