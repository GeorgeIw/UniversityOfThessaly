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

public class LarisaBusinessAdminDetailsFragment extends Fragment {


    public LarisaBusinessAdminDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.larisa_business_administration);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setSupportZoom(true);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(getActivity().getIntent().hasExtra("LarisaBusinessAdminTeachers")){
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"mod_navigation mainmenu block\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://de.uth.gr/index.php/ep.html");
            progressBar.setVisibility(View.GONE);
        } else if(getActivity().getIntent().hasExtra("LarisaBusinessAdminAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"mod_navigation mainmenu block\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://de.uth.gr/index.php/olewoianakoinwseis.html");
            progressBar.setVisibility(View.GONE);
        }



        return rootView;
    }
}