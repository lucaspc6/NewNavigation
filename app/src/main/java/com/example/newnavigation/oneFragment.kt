package com.example.newnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class oneFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        view.findViewById<Button>(R.id.btnTwo).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_oneFragment_to_twoFragment)
        }

        view.findViewById<Button>(R.id.btnThree).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_oneFragment_to_threeFragment)
        }
        return view
    }
    }