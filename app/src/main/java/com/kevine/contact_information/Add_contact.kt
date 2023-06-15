package com.kevine.contact_information

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import com.kevine.contact_information.databinding.ActivityAddContactBinding
import com.kevine.contact_information.databinding.ActivityMainBinding

class Add_contact : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clearErrorsOnType()
    }

    fun clearErrorsOnType() {
        binding.tinameentry.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                binding.tinameentry.error=null
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })

    }


}