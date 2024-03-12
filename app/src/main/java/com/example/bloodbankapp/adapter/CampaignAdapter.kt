package com.example.bloodbankapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.bloodbankapp.R
import com.example.bloodbankapp.databinding.ActivityDonorBinding
import com.example.bloodbankapp.databinding.CampaignItemLayoutBinding
import com.example.bloodbankapp.model.Campaign

class CampaignAdapter(var context: Context,var campaignList:ArrayList<Campaign>) : RecyclerView.Adapter<CampaignAdapter.CampaignViewHolder>() {

    inner class CampaignViewHolder(val binding: CampaignItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CampaignViewHolder {
        val binding = CampaignItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return CampaignViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return campaignList.size
    }

    override fun onBindViewHolder(holder: CampaignViewHolder, position: Int) {

        val data = campaignList[position]
        holder.binding.imageView.setImageResource(data.Image)
        holder.binding.hospitalNameTv.text = data.name
        holder.binding.adress.text = data.place
        holder.binding.Description.text = data.Description
    }
}