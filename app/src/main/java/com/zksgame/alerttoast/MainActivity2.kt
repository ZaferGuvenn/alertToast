package com.zksgame.alerttoast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.zksgame.alerttoast.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)

        val name=intent.getStringExtra("playername")
        binding.textView.text="Welcome "+name


    }

    fun save(view: View){
        val alert= AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are you sure for save?")

        alert.setPositiveButton("Yes") {dialog, whitch ->

            Toast.makeText(this,"saved",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No"){dialog, whitch ->
            Toast.makeText(this,"Not Saved",Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}