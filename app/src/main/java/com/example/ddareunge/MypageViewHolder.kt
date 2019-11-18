package com.example.ddareunge

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MypageViewHolder (view: View):RecyclerView.ViewHolder(view){
    var title :TextView = view.findViewById(R.id.mypage_text)
    fun mypage_bind(data:MypageItem){
        title.text=data.title
    }
}