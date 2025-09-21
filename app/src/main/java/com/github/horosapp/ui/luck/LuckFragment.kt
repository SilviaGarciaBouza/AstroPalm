package com.github.horosapp.ui.luck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.horosapp.databinding.FragmentLuckBinding
import dagger.hilt.android.AndroidEntryPoint

//Para que reciba cosas inyectadas
@AndroidEntryPoint
class LuckFragment : Fragment() {

    private var _binding: FragmentLuckBinding?=null
    private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentLuckBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}