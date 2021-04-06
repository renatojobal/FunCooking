package com.indev.funcooking.mainactivity.fauth.flogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
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

    /**
     * Main function to set up all the functionality of this fragment
     */
    private fun setUpFunctionality() {

        // When register button clicked
        binding.flBtnRegister.setOnClickListener {
           findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegisterFragment())
        }

    }


}