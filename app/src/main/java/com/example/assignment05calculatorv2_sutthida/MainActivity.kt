package com.example.assignment05calculatorv2_sutthida

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var newopera = true
    var oldnum = ""
    var op = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var str: String
        var temp: String


        n1.setOnClickListener {
            temp = "1"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }

        }
        clear.setOnClickListener {
            tp.setText("0")
        }
        n2.setOnClickListener {
            temp = "2"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        n3.setOnClickListener {
            temp = "3"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        n0.setOnClickListener {
            temp = "0"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        n4.setOnClickListener {
            temp = "4"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        n5.setOnClickListener {
            temp = "5"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        n6.setOnClickListener {
            temp = "6"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        n7.setOnClickListener {
            temp = "7"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        n8.setOnClickListener {
            temp = "8"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        n9.setOnClickListener {
            temp = "9"
            if (tp.text.toString().toInt() == 0) {
                tp.setText(temp)
            } else {
                str = tp.text.toString().plus(temp)
                tp.setText(str)
            }
        }
        delete.setOnClickListener{
            if (tp.text.length !=1) {
                str = tp.text.toString().dropLast(1)
                tp.setText(str)
            }
            else{
                str = "0"
                tp.setText(str)
            }

        }

    }

    fun operater(view: View) {
    newopera = true
        oldnum = tp.text.toString()
        var select : Button = view as Button
        when(select.id){
            multiply.id -> {op ="*"}
            plus.id -> {op ="+"}
            minus.id -> {op ="-"}
            divide.id -> {op ="/"}
        }
    }

    fun equal(view: View) {
        var newnum :String = tp.text.toString()
        var result = 0.00
        when(op){
            "+" -> {result = oldnum.toDouble() + newnum.toDouble()}
            "*" -> {result = oldnum.toDouble() * newnum.toDouble()}
            "/" -> {result = oldnum.toDouble() / newnum.toDouble()}
            "-" -> {result = oldnum.toDouble() - newnum.toDouble()}
        }
        tp.setText(result.toString())
    }

    fun deleteopera(view: View) {
        tp.setText("0")
        newopera = true
    }

    fun percent(view: View) {
        var no: Double = tp.text.toString().toDouble()/100
        tp.setText(no.toString())
        newopera = true
    }


}