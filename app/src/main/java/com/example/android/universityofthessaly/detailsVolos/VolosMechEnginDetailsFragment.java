package com.example.android.universityofthessaly.detailsVolos;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.android.universityofthessaly.R;

public class VolosMechEnginDetailsFragment extends Fragment {

    public VolosMechEnginDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.volos_mechanical_engineering);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(false);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(requireActivity().getIntent().hasExtra("VolosMechEnginTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(120);
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"top_nav_menu\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://www.mie.uth.gr/n_staff_ereynhtiko.asp");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("VolosMechEnginAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(140);
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"top_nav_menu\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://www.mie.uth.gr/n_anakoinwseis.asp");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}