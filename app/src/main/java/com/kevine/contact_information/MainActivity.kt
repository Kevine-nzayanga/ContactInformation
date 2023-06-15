package com.kevine.contact_information

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kevine.contact_information.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button = findViewById<FloatingActionButton>(R.id.fab)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, Add_contact::class.java)
            startActivity(intent)
        }

    }



    override fun onResume() {
        super.onResume()
        DisplayContacts()
    }

    fun DisplayContacts(){
        var contact1=ContactData("https://media.istockphoto.com/id/1437816897/photo/business-woman-manager-or-human-resources-portrait-for-career-success-company-we-are-hiring.jpg?s=612x612&w=0&k=20&c=tyLvtzutRh22j9GqSGI33Z4HpIwv9vL_MZw_xOE19NQ=","Eunice","072345678","eunice@gmail.com")
        var contact2=ContactData("https://media.istockphoto.com/id/1411772543/photo/side-profile-of-african-woman-with-afro-isolated-against-a-white-background-in-a-studio.jpg?s=612x612&w=0&k=20&c=-Fnq_8HB32jJdeYxaXGjUhQP-SwwVLDGlq2WM2SvwtU=","Nyce","072345678","nyce@gmail.com")
        var contact3=ContactData("https://media.istockphoto.com/id/1351285381/photo/happy-young-african-american-woman-looking-at-camera.jpg?s=612x612&w=0&k=20&c=e6sawVkyC7t_NTsFb13RWnLq4b9CYon4TJODpS2WU4I=","Brian","072345678","brian@gmail.com")
        var contact4=ContactData("https://media.istockphoto.com/id/1401177341/photo/beautiful-african-woman-wearing-fashion-makeup-in-a-studio-against-a-grey-background-side.jpg?s=612x612&w=0&k=20&c=HcpI5FcWy9SGhbe0nzaqZe6efB-TFih8-p3n85tVbpM=","Kemunto","072345678","kemunto@gmail.com")
        var contact5=ContactData("https://media.istockphoto.com/id/1277113035/photo/young-black-beauty-with-afro-hairstyle.jpg?s=612x612&w=0&k=20&c=3D0qd9UXx5FXTtfo8N8jpIyxzBGVFiA7SlJym0e257Q=","Fifi","072345678","fifi@gmail.com")
        var contact6=ContactData("https://media.istockphoto.com/id/1387228080/photo/beauty-profile-of-african-american-woman-with-white-chamomile-flowers-in-black-hair-braids.jpg?s=612x612&w=0&k=20&c=3Tw8sunimOSZv86G8txSooAY9PcdMfW2FRrm8Jy4JLc=","Nessie","072345678","nessie@gmail.com")
        var contact7=ContactData("https://media.istockphoto.com/id/1395486977/photo/profile-view-portrait-of-young-handsome-black-businessman.jpg?s=612x612&w=0&k=20&c=JZmP7sSGKFdWzt-x44j2SD-M4DmwhR5iEmH5rzkWd4M=","Israel","072345678","israel@gmail.com")
        var contact8=ContactData("https://media.istockphoto.com/id/1407283770/photo/headshot-webcam-portrait-successful-african-businessman-make-video-call.jpg?s=612x612&w=0&k=20&c=aMJuLeg8NmqSc6zH9U_oxpRLUkr3BdVm8xqRpmBs1ik=","Mark","072345678","mark@gmail.com")
        var contact9=ContactData("https://media.istockphoto.com/id/1277309059/photo/think-carefully-about-the-choices-you-make.jpg?s=612x612&w=0&k=20&c=674xHeKf0HxK2cSVTaP6aqj-ZgDPfBVN2SWsNFcCpcg=","Mary","072345678","mary@gmail.com")
        var contact10=ContactData("https://media.istockphoto.com/id/174615296/photo/smiling-young-african-american-male.jpg?s=612x612&w=0&k=20&c=6bvRhsAHY1YiocUGS7jQfcr1KaLU4l42M6RqNpmdYZs=","Yannick","072345678","yannick@gmail.com")
        var contact11=ContactData("https://media.istockphoto.com/id/1178536445/photo/profile-portrait-of-serious-businesswoman-studio-shot-panorama.jpg?s=612x612&w=0&k=20&c=K21Le62NZMLmvQvi0MTGjUjfqszgPjpPEqJrC7u1fOs=","Denise","072345678","denise@gmail.com")
        var contact12=ContactData("https://media.istockphoto.com/id/471109789/photo/confident-smiling-businessman.jpg?s=612x612&w=0&k=20&c=j9MQtb0_YooYOcPpWrmkhFr0JI17w-cRHqpd6A4wA8g=","Bob","072345678","bob@gmail.com")
var contactList= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,
    contact7,contact8,contact9,contact10,contact11,contact12)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        var contactAdapter=ContactrvAdapter(contactList)
        binding.rvcontacts.adapter=contactAdapter

    }

}