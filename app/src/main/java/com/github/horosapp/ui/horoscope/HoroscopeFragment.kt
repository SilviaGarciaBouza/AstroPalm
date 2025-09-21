package com.github.horosapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.State
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.*
import com.github.horosapp.databinding.FragmentHoroscopeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kotlin.math.log

//Para que reciba cosas inyectadas
@AndroidEntryPoint
class HoroscopeFragment : Fragment() {
  private val horoscopeViewModel by viewModels<HoroscopeViewModel>()
    private var _binding: FragmentHoroscopeBinding?=null
    private val binding get()= _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initUIState()
    }

    private fun initUIState() {
        //la sig coruutina va como la vida del fragment ste
        lifecycleScope.launch {
            //siempre q se modifiq el viewModel se llamar a a esa linea

            repeatOnLifecycle(Lifecycle.State.STARTED){
                horoscopeViewModel.horoscope.collect{

                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHoroscopeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}