package com.example.ddareunge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var actionbar:ActionBar? = supportActionBar
        actionbar!!.setDisplayShowCustomEnabled(true)
        actionbar!!.setDisplayHomeAsUpEnabled(false)
        actionbar!!.setDisplayShowTitleEnabled(false)

        var mcustomView: View = LayoutInflater.from(this).inflate(R.layout.actionbar_top,null)
        actionbar.setCustomView(mcustomView)

        return true
    }
}
