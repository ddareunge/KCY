package com.example.ddareunge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ddareunge.data.PlaceItem
import com.example.mysecondapp.server.GithubServicelmpl
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var PlaceAdapter : PlaceAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabbar.setOnClickListener {
            val intent = Intent(this,MypageActivity::class.java)
            startActivity(intent)
        }
        val items = arrayOf("거리순","이름순")
        val myAapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)

        spinner.adapter = myAapter


        myplace()
    }

    private fun myplace(){

        PlaceAdapter = PlaceAdapter(this)
        place_recyclerview.adapter=PlaceAdapter
        place_recyclerview.layoutManager = LinearLayoutManager(this)


        GithubServicelmpl.service.getPlaces().enqueue (
            onResponse = {
                if(it.isSuccessful){
                    val Places = it.body()!!
                    PlaceAdapter.data = Places.data.station
                    PlaceAdapter.notifyDataSetChanged()
                }
            }
        )

        val myplace: Call<PlaceItem> = GithubServicelmpl.service.getPlaces()

        myplace.enqueue(
            object: Callback<PlaceItem> {
                override fun onFailure(call: Call<PlaceItem>, t: Throwable) {
                    Log.e("error : ",t.toString())
                }

                override fun onResponse(
                    call: Call<PlaceItem>,
                    response: Response<PlaceItem>
                ) {
                    if(response.isSuccessful){
                        val gitRepos = response.body()!!

                        PlaceAdapter.data = gitRepos.data.station
                        PlaceAdapter.notifyDataSetChanged()
                    }
                }
            }
        )

//        PlaceAdapter.data = listOf(
//            PlaceItem(
//                PlaceName = "한성대 입구",
//                PlaceAddress = "서울시 성북구 성북동 177-31",
//                PlaceMeter = "10m"
//            ),
//            PlaceItem(
//                PlaceName = "성신여대 입구",
//                PlaceAddress = "서울시 성북구 성북동 177-31",
//                PlaceMeter = "10m"
//            ),
//            PlaceItem(
//                PlaceName = "혜화역",
//                PlaceAddress = "서울시 성북구 성북동 177-31",
//                PlaceMeter = "10m"
//            ),
//            PlaceItem(
//                PlaceName = "동대문역",
//                PlaceAddress = "서울시 성북구 성북동 177-31",
//                PlaceMeter = "10m"
//            ),
//            PlaceItem(
//                PlaceName = "한성대 입구",
//                PlaceAddress = "노원구 머시기",
//                PlaceMeter = "10m"
//            )
//        )
//        PlaceAdapter.notifyDataSetChanged()
    }
}
