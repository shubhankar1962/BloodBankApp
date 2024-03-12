package com.example.bloodbankapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bloodbankapp.R
import com.example.bloodbankapp.adapter.HospitalAdapter
import com.example.bloodbankapp.databinding.FragmentDonateBinding
import com.example.bloodbankapp.model.Hospital


class Donate : Fragment() {

    lateinit var binding:FragmentDonateBinding
    lateinit var list:ArrayList<Hospital>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDonateBinding.inflate(layoutInflater)

        list = ArrayList()
        list.add(Hospital("Evergreen Medical Center","456 Wellness Avenue, Townsville, State ",R.drawable.hospital1))
        list.add(Hospital("Unity General Hospital","123 Health Street, Cityville, State",R.drawable.hospital2))
        list.add(Hospital("Pinnacle Regional Hospital","789 Healing Boulevard, Metropolis, State",R.drawable.hospital3))
        list.add(Hospital("NIMS","Delhi Road Kuskas,Rajasthan, Metropolis, State",R.drawable.hospital1))
        list.add(Hospital("AIMS","125,Patel Road,jamnager ,Gujrat",R.drawable.hospital2))
        list.add(Hospital("Taj Memorial Hospital","90 Heritage Road, Majestic City, Agra, 282001",R.drawable.hospital6))
        list.add(Hospital("Himalaya Health Institute"," 56 Mountain View Lane, Peaceful Valley, Shimla, 171001",R.drawable.hospital3))

        binding.hospitalRecyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        binding.hospitalRecyclerView.adapter =  HospitalAdapter(requireContext(),list)


        return binding.root
    }


}