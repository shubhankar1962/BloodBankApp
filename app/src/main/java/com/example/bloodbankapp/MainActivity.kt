package com.example.bloodbankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bloodbankapp.adapter.UserAdapter
import com.example.bloodbankapp.databinding.ActivityMainBinding
import com.example.bloodbankapp.model.User

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        val navController = navHostFragment!!.findNavController()

        val popupMenu = PopupMenu(this, null)
        popupMenu.inflate(R.menu.bottom_menu)
        binding.bottomNav.setupWithNavController(navController)

        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.Home -> {
                    navHostFragment.findNavController().navigate(R.id.Home)
                    return@setOnItemSelectedListener true
                }

                R.id.donate -> {
                    navHostFragment.findNavController().navigate(R.id.donate)
                    return@setOnItemSelectedListener true
                }

                R.id.profile -> {
                    navHostFragment.findNavController().navigate(R.id.profile)
                    return@setOnItemSelectedListener true
                }

                else -> {
                    return@setOnItemSelectedListener false
                }

            }
        }
    }
}