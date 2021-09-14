package com.example.android.universityofthessaly.detailsVolos;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.android.universityofthessaly.R;

public class VolosElectricalCsDetailsFragment extends Fragment {

    public VolosElectricalCsDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.volos_elec_computer_engineers);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptThirdPartyCookies(webView,true);

        if(requireActivity().getIntent().hasExtra("VolosElectricalCsTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"logo\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"mega-menu-wrap-main_menu\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"breadcrumbs\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"header-aside\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"page-featured-img\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"footer\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"sidebar-box widget_search clearfix\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"sidebar-box widget_recent_entries clearfix\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"sidebar-box widget_text_icl clearfix\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://www.e-ce.uth.gr/department/faculty/");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("VolosElectricalCsAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setHorizontalScrollBarEnabled(false);
                    view.loadUrl("javascript:document.getElementById(\"logo\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"mega-menu-wrap-main_menu\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"breadcrumbs\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"header-aside\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"page-featured-img\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"footer\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"sidebar-box widget_search clearfix\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"sidebar-box widget_recent_entries clearfix\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"sidebar-box widget_text_icl clearfix\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://www.e-ce.uth.gr/category/announcements/general-announcements/");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}