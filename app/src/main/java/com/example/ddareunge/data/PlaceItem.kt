package com.example.ddareunge.data

import com.google.gson.annotations.SerializedName

data class PlaceItem(
    @SerializedName("data")
    val data:DetailDesc,
    @SerializedName("success")
    val success:Boolean
)
data class DetailDesc(
    @SerializedName("station")
    val station:List<GetPlaceItem>,
    @SerializedName("location")
    val nowPlace:String
)
data class GetPlaceItem(
    @SerializedName("name")
    val PlaceName:String,
    @SerializedName("location")
    val PlaceAddress:String,
    @SerializedName("distance")
    val PlaceMeter:String
)