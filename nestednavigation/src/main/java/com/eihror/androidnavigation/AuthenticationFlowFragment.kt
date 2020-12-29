package com.eihror.androidnavigation

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.eihror.androidnavigation.util.FlowType
import kotlinx.android.synthetic.main.fragment_authentication_flow.*

class AuthenticationFlowFragment : Fragment(R.layout.fragment_authentication_flow) {

    private lateinit var mainNavController: NavController
    private lateinit var authenticationFlowNavController: NavController

    private val authenticationContainer get() = authentication_flow_fragment_container

    private val args: AuthenticationFlowFragmentArgs by navArgs()
    private val flowType: FlowType by lazy { args.flowType }

    override fun onResume() {
        super.onResume()
        setupNavControllers()

        if (flowType == FlowType.FLOW_LOGIN) {
            startCodeNavigation()
        }
    }

    private fun setupNavControllers() {
        mainNavController = findNavController()
        authenticationFlowNavController = Navigation.findNavController(authenticationContainer)
    }

    private fun startCodeNavigation() {
        val authNavGraph = authenticationFlowNavController.graph
        authNavGraph.startDestination = R.id.registerCodeFragment
        authenticationFlowNavController.graph = authNavGraph
    }
}