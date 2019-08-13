package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R.*
import kotlinx.android.synthetic.main.image_item_layout.view.*

class ImageAdapter(val data: MutableList<ImageData>):
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var name = view.image_title.toString()
        var description = view.image_description.toString()
        var image = view.image_view
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(layout.image_item_layout, parent, false)
           return ViewHolder(viewGroup)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    holder.name = data[position].name
    holder.description = data[position].description
    holder.image.setImageDrawable(data[position].image)

    }

    override fun getItemCount(): Int {
        return data.size

    }


}