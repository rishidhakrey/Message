package com.example.messageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView
import com.example.messageapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    lateinit var userArrayList:ArrayList<user>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val name= arrayOf("Rishi Dhakrey","Prashant Yadav","Nayab Khan","Pankaj Yadav","Cool Guys")
        val lastMsg= arrayOf("Hey buddy! How are you?","why you are not responds on the message that i have sent on MessageApp","Which webseries You are watching right now?","Hey buddy! I have marked a proxy in Analog-2","You deleted this message")
        val lastMsgTime= arrayOf("5:13 PM","6:51 PM","7:29 AM","9:19 PM","1:55 AM")
        val phoneNumber= arrayOf("9389984393","8303616366","8576876512","8619965010","9999999999")
        val imgId= intArrayOf(R.drawable.rishi,R.drawable.prashant,R.drawable.nabbu,R.drawable.pankaj,R.drawable.coolguys)

        userArrayList= ArrayList()

      for(eachIndex in name.indices){
          val User=user(name[eachIndex],lastMsg[eachIndex],lastMsgTime[eachIndex],phoneNumber[eachIndex],imgId[eachIndex])

          userArrayList.add(User)
      }

       val listView=binding.listView
        listView.isClickable=true
        listView.adapter=MyAdapter(this,userArrayList)

    }
}