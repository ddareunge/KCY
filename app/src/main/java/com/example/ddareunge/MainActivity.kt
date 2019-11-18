package com.example.ddareunge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var PlaceAdapter : PlaceAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayOf("거리순","이름순")
        val myAapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)

        spinner.adapter = myAapter

        PlaceAdapter = PlaceAdapter(this)
        place_recyclerview.adapter=PlaceAdapter
        place_recyclerview.layoutManager = LinearLayoutManager(this)

        PlaceAdapter.data = listOf(
            PlaceItem(
                PlaceName = "한성대 입구",
                PlaceAddress = "서울시 성북구 성북동 177-31",
                PlaceMeter = "10m"
            ),
            PlaceItem(
                PlaceName = "성신여대 입구",
                PlaceAddress = "서울시 성북구 성북동 177-31",
                PlaceMeter = "10m"
            ),
            PlaceItem(
                PlaceName = "혜화역",
                PlaceAddress = "서울시 성북구 성북동 177-31",
                PlaceMeter = "10m"
            ),
            PlaceItem(
                PlaceName = "동대문역",
                PlaceAddress = "서울시 성북구 성북동 177-31",
                PlaceMeter = "10m"
            ),
            PlaceItem(
                PlaceName = "한성대 입구",
                PlaceAddress = "노원구 머시기",
                PlaceMeter = "10m"
            )
        )
        PlaceAdapter.notifyDataSetChanged()
    }

}
