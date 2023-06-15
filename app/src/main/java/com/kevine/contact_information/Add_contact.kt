package com.kevine.contact_information

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kevine.contact_information.databinding.ActivityAddContactBinding

class Add_contact : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val button2 = findViewById<Button>(R.id.btsave)
        button2.setOnClickListener {
            val intent = Intent(this@Add_contact, MainActivity::class.java)
            startActivity(intent)
        }
        onResume()
    }

    override fun onResume() {
        super.onResume()
        clearErrorOnType()
        validateRegisterContacts()
    }
    fun clearErrorOnType(){
        binding.tinameentry.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tlname.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
        binding.tinumber.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tlnum.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
        binding.tiemail.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tlemail.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
    }
    fun validateRegisterContacts(){
        val name =binding. tinameentry.text.toString()
        val contacts = binding.tinumber.text.toString()
        val email =binding. tiemail.text.toString()

        var error = false
        if (name.isBlank()){
            binding. tlname.error = "name is required"
            error = true
        }

        if (contacts.isBlank()){
            binding.tinumber.error = "contacts is required"
            error = true
        }

        if (email.isBlank()){
            binding.tiemail.error = "Email is required"
            error = true
        }


        if (!error){
            Toast.makeText(this,"$name,$contacts, $email", Toast.LENGTH_LONG).show()
        }

    }

}