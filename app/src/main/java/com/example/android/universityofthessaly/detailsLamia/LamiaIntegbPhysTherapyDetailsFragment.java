package com.example.android.universityofthessaly.detailsLamia;

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

public class LamiaIntegbPhysTherapyDetailsFragment extends Fragment {


    public LamiaIntegbPhysTherapyDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.integb_lamia_physical_therapy);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(false);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(requireActivity().getIntent().hasExtra("LamiaIntegbPhysTherapyTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(110);
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"page-title-wrap\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"footer\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"contact-form\").setAttribute(\"style\",\"display:none;\");");
                    //view.loadUrl("javascript:document.getElementsByClassName(\"mod_navigation mainmenu block\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://phys.teiste.gr/?page_id=530&lang=en");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("LamiaIntegbPhysTherapyAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"page-title-wrap\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"footer\").setAttribute(\"style\",\"display:none;\");");
                    //view.loadUrl("javascript:document.getElementsByClassName(\"mod_navigation mainmenu block\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://phys.teiste.gr/?cat=41");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}