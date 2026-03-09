package com.example.tarea1_apmn

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentControl : Fragment(R.layout.fragment_control) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.btn_lock).setOnClickListener {
            Toast.makeText(context, "Puerta bloqueada con éxito", Toast.LENGTH_SHORT).show()
            
            // Navegar a la pantalla de Estado para verificar seguridad
            val navView = activity?.findViewById<BottomNavigationView>(R.id.bottom_navigation)
            navView?.selectedItemId = R.id.nav_status
        }

        view.findViewById<ImageButton>(R.id.btn_cam).setOnClickListener {
            Toast.makeText(context, "Abriendo stream de video...", Toast.LENGTH_SHORT).show()
        }
    }
}