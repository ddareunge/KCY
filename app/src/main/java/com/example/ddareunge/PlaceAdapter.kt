package com.example.ddareunge

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ddareunge.data.GetPlaceItem

class PlaceAdapter (private val context :Context):RecyclerView.Adapter<PlaceViewHolder>(){
    var data = listOf<GetPlaceItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.place_item,parent,false)
        return PlaceViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(data[position])
    }
}