package com.example.tarea1_apmn

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment

class FragmentAmbiente : Fragment(R.layout.fragment_ambiente) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val sw = view.findViewById<SwitchCompat>(R.id.sw_lights)
        sw.setOnCheckedChangeListener { _, isChecked ->
            val msg = if (isChecked) "Luces Encendidas" else "Luces Apagadas"
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}