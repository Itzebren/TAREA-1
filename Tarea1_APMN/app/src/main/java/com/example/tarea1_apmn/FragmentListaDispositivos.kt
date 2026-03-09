package com.example.tarea1_apmn

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class FragmentListaDispositivos : Fragment(R.layout.fragment_lista) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val lv = view.findViewById<ListView>(R.id.lv_dispositivos)
        val datos = arrayOf("Sensor de Humo", "Termostato Nest", "Lámpara Philips Hue", "Cerradura Yale", "Persianas Somfy")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, datos)
        lv.adapter = adapter
    }
}