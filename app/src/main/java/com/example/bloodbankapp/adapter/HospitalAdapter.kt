package com.example.bloodbankapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bloodbankapp.activity.UserDetailActivity
import com.example.bloodbankapp.databinding.HospitalItemLayoutBinding
import com.example.bloodbankapp.model.Hospital

class HospitalAdapter(var context: Context,var list:ArrayList<Hospital>):RecyclerView.Adapter<HospitalAdapter.HospitalViewHolder>() {

    inner class HospitalViewHolder(val binding:HospitalItemLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalViewHolder {
        val binding  = HospitalItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return HospitalViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HospitalViewHolder, position: Int) {
        val data = list[position]
        holder.binding.imageView.setImageResource(data.image)
        holder.binding.contactNo.text = data.address
        holder.binding.hospitalNameTv.text = data.name

        holder.binding.donateBtn.setOnClickListener {
            context.startActivity(Intent(context,UserDetailActivity::class.java))
        }
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,UserDetailActivity::class.java))
        }
    }
}