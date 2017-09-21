package com.example.narc.rtikapu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class NewsView extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_view);

        webView=(WebView)findViewById(R.id.webview);
//        if(WebViewStateHolder.INSTANCE.getBundle() == null) { //this works only on single instance of webview, use a map with TAG if you need more
//            webView.loadUrl("file:///android_asset/html/index.html");
//        } else {
//            webView.restoreState(WebViewStateHolder.INSTANCE.getBundle());
//        }
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
            webSettings.setAllowFileAccessFromFileURLs(true);
            webSettings.setAllowUniversalAccessFromFileURLs(true);
        }

        webView.loadUrl("file:///android_asset/temp.html");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
