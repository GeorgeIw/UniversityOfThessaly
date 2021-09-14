package com.example.android.universityofthessaly.DetailsKarditsa;

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

public class KarditsaIntegbWoodDesignDetailsFragment extends Fragment {


    public KarditsaIntegbWoodDesignDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);
        department.setText(R.string.integb_karditsa_wood_design);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(false);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(false);

        if(requireActivity().getIntent().hasExtra("KarditsaIntegbWoodDesignTeachers")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(100);
                }
            });
            webView.loadUrl("http://www.wfdt.teilar.gr/people.php");
            progressBar.setVisibility(View.GONE);

        } else if(requireActivity().getIntent().hasExtra("KarditsaIntegbWoodDesignAnnouncements")){
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView.setInitialScale(130);
                }
            });
            webView.loadUrl("http://www.wfdt.teilar.gr/news.php");
            progressBar.setVisibility(View.GONE);
        }

        return rootView;
    }
}