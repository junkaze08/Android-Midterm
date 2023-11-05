package com.URSORA.animal.midterm.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.URSORA.animal.midterm.R
import com.URSORA.animal.midterm.dataModels.emailData

class animalListAd(private val emailList: List<emailData>) : BaseAdapter() {

    override fun getCount(): Int = emailList.size

    override fun getItem(position: Int): Any = emailList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)

        val senderName = view.findViewById<TextView>(R.id.animalNameList)
        val emailSubject = view.findViewById<TextView>(R.id.emailSubject)

        val email = emailList[position]
        senderName.text = email.senderName
        emailSubject.text = email.emailSubject

        return view
    }
}
//<!--Identification Check: Binmcfmz Izcqza YY Affine Cipher Encoded a = 3 b = 0>