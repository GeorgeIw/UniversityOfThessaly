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

public class LarisaBiochemistryDetailsFragment extends Fragment {

    public LarisaBiochemistryDetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.department_details, container, false);

        TextView department = rootView.findViewById(R.id.department);

        ProgressBar progressBar = rootView.findViewById(R.id.progress_bar);

        final WebView webView = rootView.findViewById(R.id.webview);

        if(getActivity().getIntent().hasExtra("LarisaBiochemistryTeachers")){

            department.setText(R.string.larisa_biochemistry_biotechnology);
            webView.getSettings().setJavaScriptEnabled(true);
            //webView.getSettings().setLoadWithOverviewMode(true);
            //webView.getSettings().setUseWideViewPort(true);
            //webView.getSettings().setSupportZoom(true);
            //webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"main-header\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"top-header\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("https://ds.uth.gr/staff/faculty/");
            progressBar.setVisibility(View.GONE);

        } else if (getActivity().getIntent().hasExtra("LarisaBiochemistryAnnouncements")) {
            department.setText(R.string.larisa_biochemistry_biotechnology);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onPageFinished(WebView view, String url) {
                    view.loadUrl("javascript:document.getElementById(\"top-bar\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"header-bar\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"leftcol\").setAttribute(\"style\",\"display:none;\");");
                    view.loadUrl("javascript:document.getElementById(\"leftcol-bg\").setAttribute(\"style\",\"display:none;\");");
                }
            });
            webView.loadUrl("http://www.bio.uth.gr/index.php?Itemid=89");
            progressBar.setVisibility(View.GONE);
        }

        return  rootView;
    }
}