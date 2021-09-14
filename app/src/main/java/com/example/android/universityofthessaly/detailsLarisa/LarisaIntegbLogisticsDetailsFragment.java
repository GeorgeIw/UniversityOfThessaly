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

public class LarisaIntegbLogisticsDetailsFragment extends Fragment {

    public LarisaIntegbLogisticsDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.integb_larisa_logistics);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setSupportZoom(true);
        webView.setInitialScale(130);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(requireActivity().getIntent().hasExtra("LarisaIntegbLogisticsTeachers")){
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"menu\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"headerInc\").setAttribute(\"style\",\"display:none;\");");

                    //view.loadUrl("javascript:document.getElementsByClassName(\"mod-login mod-login__\")[0].setAttribute(\"style\",\"display:none;\");");
                   // view.loadUrl("javascript:document.getElementById(\"breadcrumbs-row\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://acc.teilar.gr/%CF%80%CF%81%CE%BF%CF%83%CF%89%CF%80%CE%B9%CE%BA%CF%8C/%CE%B4%CE%B9%CE%B4%CE%B1%CE%BA%CF%84%CE%B9%CE%BA%CF%8C-%CE%BA%CE%B1%CE%B9-%CE%B5%CF%81%CE%B5%CF%85%CE%BD%CE%B7%CF%84%CE%B9%CE%BA%CF%8C-%CF%80%CF%81%CE%BF%CF%83%CF%89%CF%80%CE%B9%CE%BA%CF%8C/");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("LarisaIntegbLogisticsAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"menu\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"headerInc\").setAttribute(\"style\",\"display:none;\");");
                  //  view.loadUrl("javascript:document.getElementById(\"header-top-wrapper\").setAttribute(\"style\",\"display:none;\");");
                  //  view.loadUrl("javascript:document.getElementById(\"aside-right\").setAttribute(\"style\",\"display:none;\");");
                   // view.loadUrl("javascript:document.getElementsByClassName(\"mod-login mod-login__\")[0].setAttribute(\"style\",\"display:none;\");");
                   // view.loadUrl("javascript:document.getElementById(\"breadcrumbs-row\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://acc.teilar.gr/%CE%BD%CE%AD%CE%B1-%CE%B1%CE%BD%CE%B1%CE%BA%CE%BF%CE%B9%CE%BD%CF%8E%CF%83%CE%B5%CE%B9%CF%82/");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}