package com.marisma.ejemplonav20204

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class PrimerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val root = inflater.inflate(R.layout.fragment_primer, container, false)

       val btn1 = root.findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener{
            findNavController().navigate(R.id.action_primerFragment_to_segundoFragment)
        }
        val btn3 = root.findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener{
            findNavController().navigate(R.id.action_primerFragment_to_tercerFragment)
        }
        return root
    }
}