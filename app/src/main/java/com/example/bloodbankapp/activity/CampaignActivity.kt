package com.example.bloodbankapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bloodbankapp.R
import com.example.bloodbankapp.adapter.CampaignAdapter
import com.example.bloodbankapp.databinding.ActivityCampaignBinding
import com.example.bloodbankapp.databinding.CampaignItemLayoutBinding
import com.example.bloodbankapp.model.Campaign

class CampaignActivity : AppCompatActivity() {
    lateinit var binding: ActivityCampaignBinding
    lateinit var list: ArrayList<Campaign>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCampaignBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()
        list.add(Campaign("Give Blood Save Life","EHCC hospital Near Jawahar Circle",R.drawable.campaign6,"Let's unite for a cause that truly matters! Whether you're a first-time donor or a seasoned veteran, your contribution is invaluable."))
        list.add(Campaign("Give Blood Save Life","EHCC hospital Near Jawahar Circle",R.drawable.campaign4,"Let's unite for a cause that truly matters! Whether you're a first-time donor or a seasoned veteran, your contribution is invaluable."))
        list.add(Campaign("Give Blood Save Life","EHCC hospital Near Jawahar Circle",R.drawable.campaign6,"Let's unite for a cause that truly matters! Whether you're a first-time donor or a seasoned veteran, your contribution is invaluable."))
        list.add(Campaign("Give Blood Save Life","EHCC hospital Near Jawahar Circle",R.drawable.campaign3,"Let's unite for a cause that truly matters! Whether you're a first-time donor or a seasoned veteran, your contribution is invaluable."))
        list.add(Campaign("Give Blood Save Life","EHCC hospital Near Jawahar Circle",R.drawable.campaign5,"Let's unite for a cause that truly matters! Whether you're a first-time donor or a seasoned veteran, your contribution is invaluable."))
        list.add(Campaign("Give Blood Save Life","EHCC hospital Near Jawahar Circle",R.drawable.campaign6,"Let's unite for a cause that truly matters! Whether you're a first-time donor or a seasoned veteran, your contribution is invaluable."))
        list.add(Campaign("Give Blood Save Life","EHCC hospital Near Jawahar Circle",R.drawable.campaign4,"Let's unite for a cause that truly matters! Whether you're a first-time donor or a seasoned veteran, your contribution is invaluable."))

        binding.campaignRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.campaignRecyclerView.adapter = CampaignAdapter(this,list)

    }
}