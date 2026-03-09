package com.example.tarea1_apmn

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentConfig : Fragment(R.layout.fragment_config) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btn = view.findViewById<Button>(R.id.btn_conectar)
        val et = view.findViewById<EditText>(R.id.et_hub_name)
        
        btn.setOnClickListener {
            val hubName = et.text.toString()
            if (hubName.isNotEmpty()) {
                Toast.makeText(context, "Conectando a: $hubName", Toast.LENGTH_SHORT).show()
                
                // Navegar a la pantalla de Estado
                val navView = activity?.findViewById<BottomNavigationView>(R.id.bottom_navigation)
                navView?.selectedItemId = R.id.nav_status
            } else {
                Toast.makeText(context, "Por favor, ingresa el nombre del Hub", Toast.LENGTH_SHORT).show()
            }
        }
    }
}