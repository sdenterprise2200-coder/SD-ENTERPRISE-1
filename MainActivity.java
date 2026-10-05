package com.sdenterprise.shop;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.view.Window;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    WebView web = new WebView(this);
    web.setWebViewClient(new WebViewClient());
    WebSettings s = web.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setDatabaseEnabled(true);
    s.setAllowFileAccess(true);
    s.setAllowContentAccess(true);
    web.loadUrl("file:///android_asset/index.html");
    setContentView(web);
  }
  @Override public void onBackPressed() {
    WebView w=(WebView)findViewById(android.R.id.content);
    super.onBackPressed();
  }
}
