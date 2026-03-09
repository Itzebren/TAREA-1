package com.example.tarea1_apmn

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentEstado : Fragment(R.layout.fragment_estado) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val pb = view.findViewById<ProgressBar>(R.id.pb_energy)
        view.findViewById<Button>(R.id.btn_refresh).setOnClickListener {
            pb.progress = (10..100).random()
            Toast.makeText(context, "Datos actualizados", Toast.LENGTH_SHORT).show()
        }
    }
}