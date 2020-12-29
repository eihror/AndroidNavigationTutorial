package com.eihror.androidnavigation.register

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.eihror.androidnavigation.AuthenticationFlowFragmentDirections
import com.eihror.androidnavigation.R
import kotlinx.android.synthetic.main.fragment_register_code.*

class RegisterCodeFragment : Fragment(R.layout.fragment_register_code) {

    private lateinit var navController: NavController

    private val buttonNext get() = button_next

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = requireActivity().findNavController(R.id.nav_host_fragment_container)

        setupActions()
    }

    private fun setupActions() {
        buttonNext.setOnClickListener {
            val action =
                AuthenticationFlowFragmentDirections.actionAuthenticationFlowFragmentToHomeFragment()
            navController.navigate(action)
        }
    }
}