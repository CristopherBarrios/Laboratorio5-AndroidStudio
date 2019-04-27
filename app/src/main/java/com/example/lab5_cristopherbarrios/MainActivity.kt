package com.example.lab5_cristopherbarrios

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var button3: Button? = null
    private var textView: TextView? = null
    private var contador: Int= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3 = findViewById(R.id.button3) as Button
        textView = findViewById(R.id.textView2) as TextView



    }
    fun onClick(v: View?) {
        if(contador>=0){
            contador++
            textView?.setText(Integer.toString(contador))
        }else{
            Toast.makeText(this,"No se puede disminuir", Toast.LENGTH_LONG).show()

        }
    }
    fun onClick2(v: View?) {
        if(contador>0){
            contador--
            textView?.setText(Integer.toString(contador))
        }else{
            Toast.makeText(this,"No se puede disminuir", Toast.LENGTH_LONG).show()
        }
    }

}
