package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = this.findViewById<TextView>(R.id.myLabel)

        val button = this.findViewById<Button>(R.id.button)

        val strings: Array<String> = arrayOf("abc", "def", "ghi")
        println(strings[1])

        val n: Int = 15
        println(n)

        val nArray: IntArray = intArrayOf(1, 2, 3, 4, 5)

        // 型推論可能
        val nArray2 = intArrayOf(5, 6, 7, 8)

        val a = 10
        // if は式として使える(式として使うならelse必須)
        val ret = if(a >= 10) "Big" else "Small"

        button.setOnClickListener { v ->
            textView.text = "Clicked2."
        }


    }
}