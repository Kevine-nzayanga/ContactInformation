package com.kevine.contact_information

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.kevine.contact_information.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        DisplayContacts()
    }

    fun DisplayContacts(){
        var contact1=ContactData("Eunice","Eunice","072345678","eunice@gmail.com")
        var contact2=ContactData("Nyce","Nyce","072345678","nyce@gmail.com")
        var contact3=ContactData("Brian","Brian","072345678","brian@gmail.com")
        var contact4=ContactData("Kemunto","Kemunto","072345678","kemunto@gmail.com")
        var contact5=ContactData("Fifi","Fifi","072345678","fifi@gmail.com")
        var contact6=ContactData("Nessie","Nessie","072345678","nessie@gmail.com")
        var contact7=ContactData("Israel","Israel","072345678","israel@gmail.com")
        var contact8=ContactData("Mark","Mark","072345678","mark@gmail.com")
        var contact9=ContactData("Mary","Mary","072345678","mary@gmail.com")
        var contact10=ContactData("Yannick","Yannick","072345678","yannick@gmail.com")
        var contact11=ContactData("Denise","Denise","072345678","denise@gmail.com")
        var contact12=ContactData("Bob","Bob","072345678","bob@gmail.com")
var contactList= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,
    contact7,contact8,contact9,contact10,contact11,contact12)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        var contactAdapter=ContactrvAdapter(contactList)
        binding.rvcontacts.adapter=contactAdapter

    }

}