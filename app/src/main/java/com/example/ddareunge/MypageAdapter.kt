package com.example.ddareunge

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ddareunge.data.MypageItem

class MypageAdapter (private val context:Context):RecyclerView.Adapter<MypageViewHolder>(){
    var data = listOf<MypageItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MypageViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.mypage_item,parent,false)
        return MypageViewHolder(view)
    }
    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MypageViewHolder, position: Int) {
        holder.mypage_bind(data[position])
    }
}