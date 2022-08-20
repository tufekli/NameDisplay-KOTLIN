package com.bedirhan.NameDisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bedirhan.uygulama2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buradan itibaren programımızın kodlarını oluşturuyoruz.
        btn1.setOnClickListener{
            gostertext.text = adSoyad.text
            adSoyad.text.clear()
        }

    }
}