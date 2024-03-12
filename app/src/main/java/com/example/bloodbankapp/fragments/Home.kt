package com.example.bloodbankapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bloodbankapp.R
import com.example.bloodbankapp.activity.CampaignActivity
import com.example.bloodbankapp.activity.DonorActivity
import com.example.bloodbankapp.adapter.UserAdapter
import com.example.bloodbankapp.databinding.FragmentHomeBinding
import com.example.bloodbankapp.model.User


class Home : Fragment() {

    lateinit var binding:FragmentHomeBinding
    lateinit var userList:ArrayList<User>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)

        userList = ArrayList()
        userList = ArrayList()
        userList.add(User("shivam","839382839","A+",R.drawable.person))
        userList.add(User("rahul","436464549","O-",R.drawable.p1))
        userList.add(User("derik","574893955","B+",R.drawable.p2))
        userList.add(User("jack","784382839","AB+",R.drawable.p3))
        binding.mainUserRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.mainUserRecyclerView.adapter = UserAdapter(requireContext(),userList)

        binding.findDonor.setOnClickListener{
            startActivity(Intent(requireContext(),DonorActivity::class.java))
        }

        binding.donate.setOnClickListener{
            val donateFragment = Donate()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()

            transaction.replace(R.id.fragmentContainerView,donateFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        binding.campaign.setOnClickListener{
            startActivity(Intent(requireContext(),CampaignActivity::class.java))
        }
        return (binding.root)
    }


}