package com.indev.funcooking.mainactivity.fauth.fregister

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.indev.funcooking.R
import com.indev.funcooking.databinding.FragmentRegisterBinding


/**
 * A simple [Fragment] subclass.
 */
class RegisterFragment : Fragment() {

    // Data binding
    private lateinit var binding : FragmentRegisterBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate with data binding
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_register,
            container,
            false
        )


        // View model


        // Bind data


        // Set up functionality
        setUpFunctionality()

        // Inflate the layout for this fragment
        return binding.root
    }

    /**
     * Main function to set up all the functionality of this fragment
     */
    private fun setUpFunctionality() {




    }





}