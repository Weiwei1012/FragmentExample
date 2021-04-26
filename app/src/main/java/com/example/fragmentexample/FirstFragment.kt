package com.example.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.fragmentexample.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater,container,false)

        binding.nextButton.setOnClickListener {
            it.findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment("Weiwei",18))

        }

        // Inflate the layout for this fragment
        return binding.root
    }

}