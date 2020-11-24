package com.eihror.androidnavigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.eihror.androidnavigation.util.FlowType
import kotlinx.android.synthetic.main.fragment_auth.*

class AuthFragment : Fragment(R.layout.fragment_auth) {

    private lateinit var navController: NavController

    private val editTextEmail get() = edit_text_email
    private val editTextPassword get() = edit_text_password

    private val buttonRegister get() = button_register
    private val buttonLogin get() = button_login

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

        setupActions()
    }

    private fun setupActions() {
        buttonRegister.setOnClickListener {
            val action =
                AuthFragmentDirections.actionAuthFragmentToAuthenticationFlowFragment(FlowType.FLOW_REGISTER)
            navController.navigate(action)
        }
        buttonLogin.setOnClickListener {
            val action =
                AuthFragmentDirections.actionAuthFragmentToAuthenticationFlowFragment(FlowType.FLOW_LOGIN)
            navController.navigate(action)
        }
    }
}