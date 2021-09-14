package com.example.android.universityofthessaly.detailsLarisa;

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

public class LarisaIntegbCivilEnginDetailsFragment extends Fragment {

    public LarisaIntegbCivilEnginDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.integb_larisa_civil_engineering);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(requireActivity().getIntent().hasExtra("LarisaIntegbCivilEnginTeachers")){
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementsByClassName(\"header\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"aside\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"footer\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://www.civil.teilar.gr/new/index.php/stuff/perm-staff");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("LarisaIntegbCivilEnginAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementsByClassName(\"content\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"containerheaderfull\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"system-messages clearfix\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"taxonomy-term vocabulary-uth-tax-akademaike-dome\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"clearfix header-top__container\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://www.uth.gr/spoydes/proptychiakes/schools-departments/symboylio-entaxis/programma-spoydon-tmimatos-politikon-mihanikon-te-tei-thessalias-larisa");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}