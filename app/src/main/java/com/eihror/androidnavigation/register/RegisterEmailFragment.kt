package com.eihror.androidnavigation.register

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.eihror.androidnavigation.R
import kotlinx.android.synthetic.main.fragment_register_email.*

class RegisterEmailFragment : Fragment(R.layout.fragment_register_email) {

    private lateinit var navController: NavController

    private val buttonNext get() = button_next

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

        setupActions()
    }

    private fun setupActions() {
        buttonNext.setOnClickListener {
            val action =
                RegisterEmailFragmentDirections.actionRegisterEmailFragmentToRegisterPasswordFragment()
            navController.navigate(action)
        }
    }
}