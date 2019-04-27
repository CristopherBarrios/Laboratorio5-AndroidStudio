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
    private var textView1: TextView? = null
    private var textView2: TextView? = null
    private var contador: Int= 0
    private var contador1: Int= 0
    private var contador2: Int= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView = findViewById(R.id.textView2) as TextView
        textView1 = findViewById(R.id.textView4) as TextView
        textView2 = findViewById(R.id.textView6) as TextView



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

    fun onClick3(v: View?) {
        if(contador1>=0){
            contador1++
            textView1?.setText(Integer.toString(contador))
        }else{
            Toast.makeText(this,"No se puede disminuir", Toast.LENGTH_LONG).show()

        }
    }
    fun onClick4(v: View?) {
        if(contador1>0){
            contador1--
            textView1?.setText(Integer.toString(contador))
        }else{
            Toast.makeText(this,"No se puede disminuir", Toast.LENGTH_LONG).show()
        }
    }

    fun onClick5(v: View?) {
        if(contador2>=0){
            contador2++
            textView2?.setText(Integer.toString(contador))
        }else{
            Toast.makeText(this,"No se puede disminuir", Toast.LENGTH_LONG).show()

        }
    }
    fun onClick6(v: View?) {
        if(contador2>0){
            contador2--
            textView2?.setText(Integer.toString(contador))
        }else{
            Toast.makeText(this,"No se puede disminuir", Toast.LENGTH_LONG).show()
        }
    }



}
