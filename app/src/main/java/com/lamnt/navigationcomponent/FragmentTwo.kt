package com.lamnt.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class FragmentTwo : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            Toast.makeText(activity, "" + it["value"], Toast.LENGTH_SHORT).show()
        }
        view.findViewById<Button>(R.id.btnNavigate).setOnClickListener {
            val action = FragmentTwoDirections.actionFragmentTwoToFragmentThree()
            it.findNavController().navigate(action)
        }
    }
}