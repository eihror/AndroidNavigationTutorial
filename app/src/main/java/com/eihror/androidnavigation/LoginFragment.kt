package com.eihror.androidnavigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var navController: NavController
    private val buttonHome get() = button_go_to_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

        setupActions()
    }

    private fun setupActions() {
        buttonHome.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment()
            navController.navigate(action)
        }
    }
}