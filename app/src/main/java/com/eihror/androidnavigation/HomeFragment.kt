package com.eihror.androidnavigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val buttonLogout get() = button_logout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupActions()
    }

    private fun setupActions() {
        buttonLogout.setOnClickListener {
            logoutUser()
        }
    }

    private fun logoutUser() {
        val intent: Intent? =
            requireContext().packageManager.getLaunchIntentForPackage(requireContext().packageName)
        intent?.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent?.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }
}