package com.example.projectone

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.Gravity
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /* Underline in cancelTextView */
        val cancelTextView: TextView = findViewById(R.id.cancelTextView)
        val content: SpannableString = SpannableString("Cancel Subscription")
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        cancelTextView.text = content

        /* bold the pro */
        val pixelGoTv = findViewById<TextView>(R.id.pixelGoTv)
        val text = "You are an <b>PixelGo PRO</b> Member"
        pixelGoTv.text = Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY)
        pixelGoTv.textSize = 30f
        pixelGoTv.gravity = Gravity.CENTER
        pixelGoTv.setTextColor(Color.parseColor("#0B0B0B"))
    }
}