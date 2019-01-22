package com.example.android.zenonrental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class PricelistActivity extends AppCompatActivity {

WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricelist);

        WebView myWebView = (WebView) findViewById(R.id.WebView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://docs.google.com/spreadsheets/d/1gULdsvHsnneZRrpfZVO6gHI1YXpYAkZc3Y7XKMu4RYI/edit#gid=0");


    }


}