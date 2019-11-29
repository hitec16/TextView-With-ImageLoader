package com.hitec16.textviewwithimageloader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
/* Author : Hitesh Bisht*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextViewWithImageLoader>(R.id.tv_with_image_loader)
        tv.setupImageLoader(50, 50, TextViewWithImageLoader.Direction.START)

        tv.compoundDrawablePadding = 10

        Picasso.get().load("https://img.icons8.com/dusk/64/000000/delete-link.png")
            .placeholder(R.drawable.ic_launcher_foreground).into(tv)
    }
}
