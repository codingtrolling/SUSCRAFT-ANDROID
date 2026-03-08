package com.launcher.core;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MicrosoftLoginActivity extends AppCompatActivity {
    private static final String LOGIN_URL = "https://login.live.com/oauth20_authorize.srf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        setContentView(webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();
                if (url.contains("code=")) {
                    // Extract code and return to launcher
                    finish();
                    return true;
                }
                return false;
            }
        });
        webView.loadUrl(LOGIN_URL + "?client_id=YOUR_ID&response_type=code&scope=XboxLive.signin");
    }
}
