package com.example.ivanovky.tututestapp

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.customtabs.CustomTabsIntent
import com.example.ivanovky.tututestapp.presentation.common.customtabs.CustomTabsHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onChromeTabsModeStart("https://story.tutu.ru")
    }

    private fun onChromeTabsModeStart(url: String) {
        val customTabsIntent = CustomTabsIntent.Builder().build()
        CustomTabsHelper.addKeepAliveExtra(this, customTabsIntent.intent)
        CustomTabsHelper.openCustomTab(
            this,
            customTabsIntent,
            Uri.parse(url),
            { _, _ -> initWebView(url) })
    }

    private fun initWebView(url : String) {
        // Реализовать показ WebView в случае отсутствия ChromeCustomTabs
    }
}
