package com.example.recycleview

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.image_item_layout.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //image:

        val data = mutableListOf<ImageData>()
        var contactImage = ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693)
        var contactImage2 =ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092)
        



        // this if statement changes Drawable? to Drawable
        if(contactImage != null) {
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            data.add(ImageData("title", "description", contactImage))
            if(contactImage2 != null)
            data.add(ImageData("title", "description", contactImage2))
        }



        //populate data
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ImageAdapter(data)
        recycle.layoutManager = manager
        recycle.adapter = adapter

    }
}
