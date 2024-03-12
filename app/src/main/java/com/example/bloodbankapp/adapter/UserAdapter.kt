package com.example.bloodbankapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.example.bloodbankapp.databinding.UserLayoutBinding
import com.example.bloodbankapp.model.User

class UserAdapter(var context:Context,var userList:ArrayList<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(val binding:UserLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val data = userList[position]
        holder.binding.imagView.setImageResource(data.image)
        Glide.with(context).load(data.image).into(holder.binding.imagView)
        holder.binding.userNameTv.text = data.name
        holder.binding.bloodType.text = data.BloodType
        holder.binding.contactNo.text = data.ContactNo


}

}