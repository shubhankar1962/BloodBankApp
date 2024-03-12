package com.example.bloodbankapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bloodbankapp.R
import com.example.bloodbankapp.databinding.ActivityCampaignBinding
import com.example.bloodbankapp.databinding.ActivityUserDetailBinding

class UserDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityUserDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener {
            Toast.makeText(this,"Your data is Saved We will Notify the Date",Toast.LENGTH_SHORT).show()
        }
    }
}