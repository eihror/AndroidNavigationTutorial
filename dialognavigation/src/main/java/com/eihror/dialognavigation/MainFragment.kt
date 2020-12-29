package com.eihror.dialognavigation

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var navController: NavController

    private val buttonTopDialog: AppCompatButton get() = button_dialog_top
    private val buttonLeftDialog: AppCompatButton get() = button_dialog_left
    private val buttonRightDialog: AppCompatButton get() = button_dialog_right
    private val buttonBottomDialog: AppCompatButton get() = button_dialog_bottom

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        setupActions()
    }

    private fun setupActions() {
        buttonTopDialog.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToTopDialogFragment()
            navController.navigate(action)
        }

        buttonLeftDialog.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToLeftDialogFragment()
            navController.navigate(action)
        }

        buttonRightDialog.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToRightDialogFragment()
            navController.navigate(action)
        }

        buttonBottomDialog.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToBottomDialogFragment()
            navController.navigate(action)
        }
    }
}