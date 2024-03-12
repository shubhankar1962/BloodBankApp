package com.example.bloodbankapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bloodbankapp.R
import com.example.bloodbankapp.adapter.UserAdapter
import com.example.bloodbankapp.databinding.ActivityDonorBinding
import com.example.bloodbankapp.model.User

class DonorActivity : AppCompatActivity() {

    lateinit var binding:ActivityDonorBinding
    lateinit var aposList:ArrayList<User>
    lateinit var anegList:ArrayList<User>
    lateinit var bposList:ArrayList<User>
    lateinit var bnegList:ArrayList<User>
    lateinit var oposList:ArrayList<User>
    lateinit var onegList:ArrayList<User>
    lateinit var abposList:ArrayList<User>
    lateinit var abnegList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        aposList = ArrayList()
        anegList = ArrayList()
        bposList = ArrayList()
        bnegList = ArrayList()
        oposList = ArrayList()
        onegList = ArrayList()
        abposList = ArrayList()
        abnegList = ArrayList()

        binding.aPos.setOnClickListener{
            aposList.add(User("steave","8005040485","A+",R.drawable.p1))
            aposList.add(User("hardy jhones","4545440485","A+",R.drawable.p1))
            aposList.add(User("Mathew smith","8554540485","A+",R.drawable.p1))
            aposList.add(User("Marry Mathew","7895040485","A+",R.drawable.p1))

            binding.donorRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.donorRecyclerView.adapter = UserAdapter(this,aposList)
        }


        binding.aNeg.setOnClickListener{
            anegList.add(User("Ramesh","84743830485","A-",R.drawable.p2))
            anegList.add(User("Suresh","32647340485","A-",R.drawable.p2))
            anegList.add(User("Jignesh","88383930485","A-",R.drawable.p2))
            anegList.add(User("Rakesh","93938485","A-",R.drawable.p2))

            binding.donorRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.donorRecyclerView.adapter = UserAdapter(this,anegList)
        }

        binding.bPos.setOnClickListener{
            bposList.add(User("V.I.D.I.P","8484830485","B+",R.drawable.p1))
            bposList.add(User("Shubhankar ","4545440485","B+",R.drawable.p1))
            bposList.add(User("Himanshu","8554540485","B+",R.drawable.p1))
            bposList.add(User("Rohit","7895040485","B+",R.drawable.p1))

            binding.donorRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.donorRecyclerView.adapter = UserAdapter(this,bposList)
        }
        binding.bNeg.setOnClickListener{
            bnegList.add(User("kalu","8005040485","B-",R.drawable.p1))
            bnegList.add(User("Lalu","4545440485","B-",R.drawable.p1))
            bnegList.add(User("Pappu","8554540485","B-",R.drawable.p1))
            bnegList.add(User("Golu","7895040485","B-",R.drawable.p1))

            binding.donorRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.donorRecyclerView.adapter = UserAdapter(this,bnegList)
        }
        binding.oPos.setOnClickListener{
            oposList.add(User("Virat","393940485","O+",R.drawable.p1))
            oposList.add(User("Dhoni","040444440485","O+",R.drawable.p1))
            oposList.add(User("Rohit","5433430485","O+",R.drawable.p1))
            oposList.add(User("Sachin","959440485","O+",R.drawable.p1))

            binding.donorRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.donorRecyclerView.adapter = UserAdapter(this,oposList)
        }
        binding.oNeg.setOnClickListener{
            onegList.add(User("Raghu","8005040485","O-",R.drawable.p1))
            onegList.add(User("Katrina","4545440485","O-",R.drawable.p1))
            onegList.add(User("Tripti","8554540485","O-",R.drawable.p1))
            onegList.add(User("Perry","7895040485","O-",R.drawable.p1))

            binding.donorRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.donorRecyclerView.adapter = UserAdapter(this,onegList)
        }
        binding.abPos.setOnClickListener{
            abposList.add(User("Rishi","839340485","AB+",R.drawable.p1))
            abposList.add(User("Vaibhav","9434340485","AB+",R.drawable.p1))
            abposList.add(User("Dishant","8554540485","AB+",R.drawable.p1))
            abposList.add(User("Vishal","65748340485","AB+",R.drawable.p1))

            binding.donorRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.donorRecyclerView.adapter = UserAdapter(this,abposList)
        }
        binding.abNeg.setOnClickListener{
            abnegList.add(User("Akshat","6575040485","AB-",R.drawable.p1))
            abnegList.add(User("Modi","847493440485","AB-",R.drawable.p1))
            abnegList.add(User("Amit Shah","3243540485","AB-",R.drawable.p1))
            abnegList.add(User("Jayshankar","25545040485","AB-",R.drawable.p1))

            binding.donorRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.donorRecyclerView.adapter = UserAdapter(this,abnegList)
        }
    }
}