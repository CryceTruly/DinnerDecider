package com.crycetruly.trulykotlinstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList= arrayListOf("Chinese","Humberger","Pizza","MacDonalds","Barrows Pizza","Pizza Hut")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       addclick.setOnClickListener {
           val food=restinput.text.toString()
           if (food.length>0){
               foodList.add(food)
               restinput.text.clear()
               Toast.makeText(this,"New Item Added",Toast.LENGTH_LONG).show()
           }else{
               Toast.makeText(this,"Please add something",Toast.LENGTH_LONG).show()
           }
       }

        decide.setOnClickListener({
            val random= Random()
            val randomFood=random.nextInt(foodList.count())
            whereto.text=foodList[randomFood]

        })
    }
}
