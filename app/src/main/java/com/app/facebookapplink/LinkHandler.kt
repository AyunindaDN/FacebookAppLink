package com.app.facebookapplink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bolts.AppLinks
import kotlinx.android.synthetic.main.activity_main.*

class LinkHandler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.text = "intent data = ${intent.data.toString()}"

        val targetUrl = AppLinks.getTargetUrlFromInboundIntent(this, intent)
        if (targetUrl != null) {
            text2.text = "target url = ${targetUrl}"
        }
    }
}