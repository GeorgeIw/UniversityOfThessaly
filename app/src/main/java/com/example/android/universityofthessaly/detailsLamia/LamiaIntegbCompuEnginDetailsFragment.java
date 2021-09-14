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

public class LamiaIntegbCompuEnginDetailsFragment extends Fragment {

    public LamiaIntegbCompuEnginDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.integb_lamia_computer_engineering);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(false);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(requireActivity().getIntent().hasExtra("LamiaIntegbCompuEnginTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"slider-section\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"header-container row\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"col-md-4 col-sm-4 \")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"footer\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://inf.teiste.gr/?page_id=85");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("LamiaIntegbCompuEnginAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"slider-section\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"col-md-4 col-sm-4 \")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://inf.teiste.gr/?page_id=1524");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}