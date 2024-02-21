package com.example.messageapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import java.text.FieldPosition

class MyAdapter(val context:Activity,val arrayList: ArrayList<user>):
  ArrayAdapter<user>(context,R.layout.eachitem,arrayList){

    override fun getView(position: Int, convertView: View?,parent: ViewGroup):View{

        val inflater=LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.eachitem,null)
        val image=view.findViewById<CircleImageView>(R.id.profile_image)
        val name=view.findViewById<TextView>(R.id.tvName)
        val lastMsg=view.findViewById<TextView>(R.id.tvLastMessage)
        val lastMsgTime=view.findViewById<TextView>(R.id.tvLastMsgTime)
         name.text=arrayList[position].name
        lastMsg.text=arrayList[position].lastMsg
        lastMsgTime.text=arrayList[position].lastMsgTime
       image.setImageResource(arrayList[position].imageId)


        return view
    }
}