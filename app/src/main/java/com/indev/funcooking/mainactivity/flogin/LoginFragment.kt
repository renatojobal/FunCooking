package com.indev.funcooking.mainactivity.flogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.indev.funcooking.R
import com.indev.funcooking.databinding.FragmentLoginBinding


/**
 * Login fragment.
 */
class LoginFragment : Fragment() {

    // Data binding
    private lateinit var binding : FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout with data binding
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login,
            container,
            false
        )



        // Bind data


        // Set up functionality
        setUpFunctionality()

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun setUpFunctionality() {


    }


}