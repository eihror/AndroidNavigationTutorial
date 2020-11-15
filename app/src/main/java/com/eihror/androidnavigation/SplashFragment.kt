package com.eihror.androidnavigation

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class SplashFragment : Fragment(R.layout.fragment_splash) {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
    }

    override fun onResume() {
        super.onResume()

        Handler(Looper.getMainLooper()).postDelayed({
            val action = SplashFragmentDirections.actionSplashScreenFragmentToLoginFragment()
            navController.navigate(action)
        }, 3000)
    }
}