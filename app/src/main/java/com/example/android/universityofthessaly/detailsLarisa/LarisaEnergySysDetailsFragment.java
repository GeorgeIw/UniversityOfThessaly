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

public class LarisaEnergySysDetailsFragment extends Fragment {


    public LarisaEnergySysDetailsFragment() {
        // Required empty public constructor
    }
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.larisa_energy_systems);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setSupportZoom(true);

        if(getActivity().getIntent().hasExtra("LarisaEnergySysDetailsTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"banner\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"misc-wrapper\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"footer-wrapper\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://www.energy.uth.gr/index.php/prosopiko.html");
            progressBar.setVisibility(View.GONE);

        } else if(getActivity().getIntent().hasExtra("LarisaEnergySysDetailsAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"banner\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"misc-wrapper\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"footer-wrapper\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"cat-children\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://www.energy.uth.gr/index.php/anakoinoseis.html");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}