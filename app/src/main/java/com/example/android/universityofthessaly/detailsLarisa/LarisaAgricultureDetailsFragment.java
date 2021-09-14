package com.example.android.universityofthessaly.detailsLarisa;

import android.annotation.SuppressLint;
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

import java.util.Objects;

public class LarisaAgricultureDetailsFragment extends Fragment {

    public LarisaAgricultureDetailsFragment() {
        // Required empty public constructor
    }


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.larisa_agriculture_agrotechnology);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setSupportZoom(true);

        if(requireActivity().getIntent().hasExtra("LarisaAgricultureTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementsByClassName(\"mobile-header-bar\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://agrtec.uth.gr/members/");
            progressBar.setVisibility(View.GONE);
        } else if(requireActivity().getIntent().hasExtra("LarisaAgricultureAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementsByClassName(\"mobile-header-bar\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"rev_slider_3_1_forcefullwidth\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"vc_column-inner\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://agrtec.uth.gr/");
            progressBar.setVisibility(View.GONE);
        }
        return rootView;
    }
}