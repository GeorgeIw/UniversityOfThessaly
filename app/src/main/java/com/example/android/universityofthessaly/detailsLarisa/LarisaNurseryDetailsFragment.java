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

public class LarisaNurseryDetailsFragment extends Fragment {
    public LarisaNurseryDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.larisa_nursery);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(false);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setSupportZoom(true);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(requireActivity().getIntent().hasExtra("LarisaNurseryTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(100);
                    view.loadUrl("javascript:document.getElementsByClassName(\"mx_wrapper_adverts mx_section\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"mx_wrapper_header mx_section\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"mx_wrapper_copyright mx_section\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://nurs.uth.gr/index.php/mprosopiko/mmeli-dep");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("LarisaNurseryAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(100);
                    view.loadUrl("javascript:document.getElementsByClassName(\"mx_wrapper_adverts mx_section\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"mx_wrapper_header mx_section\")[0].setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementsByClassName(\"mx_wrapper_copyright mx_section\")[0].setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://nurs.uth.gr/index.php/manakoinoseis/manakoinoseis-tmimatos");
            progressBar.setVisibility(View.GONE);
        }
        return  rootView;
    }
}