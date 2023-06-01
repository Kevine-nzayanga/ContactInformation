package com.kevine.contact_information

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kevine.contact_information.databinding.ContactListBinding

class ContactrvAdapter (var contactList: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList[position]

        holder.binding.apply {
            tvname.text=currentContact.name
            tvemail.text=currentContact.email
            tvphone.text=currentContact.phoneNum
        }
    }


}

class ContactViewHolder(var binding: ContactListBinding):RecyclerView.ViewHolder(binding.root){

}