package com.example.projectone

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Gravity
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yearlyCheckbox: CheckBox = findViewById(R.id.yearlyCheckbox)
        val weeklyCheckbox: CheckBox = findViewById(R.id.weeklyCheckbox)
        val weeklyLinearLayout: LinearLayout = findViewById(R.id.weeklyLinearLayout)
        val yearlyLinearLayout: LinearLayout = findViewById(R.id.yearlyLinearLayout)

        yearlyCheckbox.setOnClickListener {
            if (yearlyCheckbox.isChecked){
                weeklyCheckbox.isChecked = false
                weeklyLinearLayout.setBackgroundResource(0)
                yearlyLinearLayout.setBackgroundResource(R.drawable.yearly_outer_line)
            }else{
                yearlyLinearLayout.setBackgroundResource(0)
            }
        }
        weeklyCheckbox.setOnClickListener {
            if (weeklyCheckbox.isChecked){
                yearlyCheckbox.isChecked = false
                yearlyLinearLayout.setBackgroundResource(0)
                weeklyLinearLayout.setBackgroundResource(R.drawable.yearly_outer_line)
            }else{
                weeklyLinearLayout.setBackgroundResource(0)
            }
        }

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(
                this@MainActivity,
                MainActivity2::class.java
            ))
        }

        /* bold the pro */
        val appCompatTextView = findViewById<TextView>(R.id.appCompatTextView)
        val text = "Upgrade your photos to <b>PRO</b> quality!"
        appCompatTextView.text = Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY)
        appCompatTextView.textSize = 30f
        appCompatTextView.gravity = Gravity.CENTER
        appCompatTextView.setTextColor(Color.parseColor("#0B0B0B"))

    }
}