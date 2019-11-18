package com.example.ddareunge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_mypage.*

class MypageActivity : AppCompatActivity() {

    private lateinit var MypageAdapter:MypageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        MypageAdapter=MypageAdapter(this)
        mypage_rc.adapter=MypageAdapter
        mypage_rc.layoutManager = LinearLayoutManager(this)

        MypageAdapter.data = listOf(
            MypageItem(
                title = "공지사항"
            ),
            MypageItem(
                title = "사업소개"
            ),
            MypageItem(
                title = "보험안내"
            ),
            MypageItem(
                title = "안전수칙/FAQ"
            ),
            MypageItem(
                title = "고장(장애)신고"
            ),
            MypageItem(
                title = "시민의견수렴"
            )
            )
        MypageAdapter.notifyDataSetChanged()
    }
}
