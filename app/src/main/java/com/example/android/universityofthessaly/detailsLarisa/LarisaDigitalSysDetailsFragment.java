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

public class LarisaDigitalSysDetailsFragment extends Fragment {

    public LarisaDigitalSysDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        //get the view from layout
        TextView department = rootView.findViewById(R.id.department);
        //set the text of the view
        department.setText(R.string.larisa_digital_systems);

        //get the progressbar
        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        //get the WebView
        WebView webView = rootView.findViewById(R.id.webview);
        //enable the javascript options
        webView.getSettings().setJavaScriptEnabled(true);
        //resize the web page's content
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);


        //for the extra value that comes
        if(requireActivity().getIntent().hasExtra("LarisaDigitalSysTeachers")){
            //set the WebView client so that javasript injection becomes possible
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    //javascript injection so that some elements will be hidden or not displayed at all
                    view.loadUrl("javascript:document.getElementById(\"top-header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"main-header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"main-footer\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            //load the url
            webView.loadUrl("https://ds.uth.gr/staff/faculty/");
            //make the progressBar invisible
            progressBar.setVisibility(View.GONE);
            //else , if another extra value comes
        } else if(requireActivity().getIntent().hasExtra("LarisaDigitalSysAnnouncements")){
            //set the WebView client
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    //inject the javascript so that some elements will be hidden
                    view.loadUrl("javascript:document.getElementById(\"top-header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"main-header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"main-footer\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            //load the url
            webView.loadUrl("https://ds.uth.gr/announcements/");
            //make the progressBar invisible
            progressBar.setVisibility(View.GONE);
        }
        return  rootView;
    }
}