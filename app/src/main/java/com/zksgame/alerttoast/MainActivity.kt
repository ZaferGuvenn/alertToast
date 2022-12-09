package com.zksgame.alerttoast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.app.ShareCompat
import com.zksgame.alerttoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)




    }

    fun start(view: View){
        if (binding.editTextTextPersonName.text.length in 3..14){
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("playername",binding.editTextTextPersonName.text.toString())
            startActivity(intent)
        }else{
            Toast.makeText(this,"Lütfen sadece isminizi girin!",Toast.LENGTH_LONG).show()

        }

    }
}