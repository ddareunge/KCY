package com.example.ddareunge

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ddareunge.data.GetPlaceItem

class PlaceViewHolder (view : View) : RecyclerView.ViewHolder(view){
    val PlaceName: TextView = view.findViewById(R.id.PlaceName)
    val PlaceAddress: TextView = view.findViewById(R.id.PlaceAddress)
    val PlaceMeter: TextView = view.findViewById(R.id.PlaceMeter)
    fun bind(data : GetPlaceItem){
            PlaceName.text = data.PlaceName
            PlaceAddress.text = data.PlaceAddress
            PlaceMeter.text = data.PlaceMeter

    }
}