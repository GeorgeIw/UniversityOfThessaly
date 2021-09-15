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


public class LarisaEnviromentDetailsFragment extends Fragment {

    public LarisaEnviromentDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.larisa_environment);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setDomStorageEnabled(true);

        if(getActivity().getIntent().hasExtra("LarisaEnviromentTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementsByClassName(\"side-aligned-social guten-side-social-square\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"site-container\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"masthead\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://env.uth.gr/%cf%80%cf%81%ce%bf%cf%83%cf%89%cf%80%ce%b9%ce%ba%cf%8c/%ce%b1%ce%ba%ce%b1%ce%b4%ce%b7%ce%bc%ce%b1%cf%8a%ce%ba%cf%8c-%cf%80%cf%81%ce%bf%cf%83%cf%89%cf%80%ce%b9%ce%ba%cf%8c/%ce%bc%ce%b5%ce%bb%ce%b7-%ce%b4%ce%b5%cf%80/");
            progressBar.setVisibility(View.GONE);
        } else if(getActivity().getIntent().hasExtra("LarisaEnviromentAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementsByClassName(\"side-aligned-social guten-side-social-square\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"site-container\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"masthead\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://env.uth.gr/%ce%b4%ce%b9%ce%b1%ce%bb%ce%ad%ce%be%ce%b5%ce%b9%cf%82/");
            progressBar.setVisibility(View.GONE);
        }
        return rootView;
    }
}