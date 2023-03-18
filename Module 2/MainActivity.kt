package com.example.dialogtoast

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity()
{
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var dialogInterface: DialogInterface

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)



        btn1.setOnClickListener {

            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design,null)

            var alertDialog = AlertDialog.Builder(this)
            //alertDialog.set
            var button:Button = view.findViewById(R.id.btn1)

            alertDialog.setPositiveButton("YES",{ dialogInterface: DialogInterface, i: Int -> })

            button.setOnClickListener {
                

                dialogInterface.cancel()


            }
            alertDialog.setView(view)
            alertDialog.show()


        }
        btn2.setOnClickListener {

            var layout = LayoutInflater.from(applicationContext)
            var view = layout.inflate(R.layout.design2,null)

            var toast = Toast(this)
            toast.view=view
            toast.duration=Toast.LENGTH_LONG
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()

        }

    }
}