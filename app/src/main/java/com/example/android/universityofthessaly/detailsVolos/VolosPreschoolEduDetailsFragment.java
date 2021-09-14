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

public class VolosPreschoolEduDetailsFragment extends Fragment {

    public VolosPreschoolEduDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.volos_preschool_education);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(false);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(requireActivity().getIntent().hasExtra("VolosPreschoolEduTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(125);
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"front-left-column\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"region region-sidebar-second column sidebar\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"region region-sidebar-first column sidebar\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://www.ece.uth.gr/main/el/meli-dep-el");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("VolosPreschoolEduAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(100);
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"front-image\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"front-left-column\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"region region-sidebar-second column sidebar\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"region region-sidebar-first column sidebar\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://www.ece.uth.gr/main/el");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}