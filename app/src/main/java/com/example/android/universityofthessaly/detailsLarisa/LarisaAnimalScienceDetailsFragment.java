package com.example.android.universityofthessaly.detailsLarisa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.android.universityofthessaly.R;


public class LarisaAnimalScienceDetailsFragment extends Fragment {


    public LarisaAnimalScienceDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.larisa_animal_production_science);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setDomStorageEnabled(true);

        if(getActivity().getIntent().hasExtra("LarisaAnimalScienceTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementsByClassName(\"elementor-section-wrap\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"elementor-section elementor-top-section elementor-element elementor-element-46f5bda1 elementor-section-boxed elementor-section-height-default elementor-section-height-default\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://as.uth.gr/tmima/dynamiko/");
            progressBar.setVisibility(View.GONE);
            //Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://as.uth.gr/tmima/dynamiko/"));
            //startActivity(browser);
            //progressBar.setVisibility(View.GONE);

        } else if(getActivity().getIntent().hasExtra("LarisaAnimalScienceAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                   view.loadUrl("javascript:document.getElementsByClassName(\"elementor-section-wrap\")[0].setAttribute(\"style\",\"display:none;\");");
                   view.loadUrl("javascript:document.getElementsByClassName(\"elementor-section elementor-top-section elementor-element elementor-element-46f5bda1 elementor-section-boxed elementor-section-height-default elementor-section-height-default\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://as.uth.gr/anakoinoseis/");
            progressBar.setVisibility(View.GONE);
        }
        return rootView;
    }
}