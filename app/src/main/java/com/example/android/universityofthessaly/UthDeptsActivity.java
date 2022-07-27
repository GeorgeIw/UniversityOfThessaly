package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class UthDeptsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uth_depts);

        //this if-else statement handles the Intents sent from MainActivity.java
        //depending on the Intent, a corresponding Fragment with its List will open
        if(getIntent().hasExtra("larisaExtra")){
            //create the object for fragment
            LarisaDepartmentsFragment larisaDeptsFragment = new LarisaDepartmentsFragment();
            //call getSupportFragmentManager to start the fragment transaction
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            //add the frame to the fragment
            transaction.add(R.id.fragment_holder, larisaDeptsFragment);
            //execute the transaction
            transaction.commit();
        } else if(getIntent().hasExtra("volosExtra")){
            VolosDepartmentsFragment volosDeptsFragment = new VolosDepartmentsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_holder, volosDeptsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("lamiaExtra")){
            LamiaDepartmentsFragment lamiaDeptsFragment = new LamiaDepartmentsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_holder,lamiaDeptsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("trikalaExtra")){
            TrikalaDepartmentsFragment trikalaDeptsFragment = new TrikalaDepartmentsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_holder,trikalaDeptsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("karditsaExtra")){
            KarditsaDepartmentsFragment karditsaDeptsFragment = new KarditsaDepartmentsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_holder,karditsaDeptsFragment);
            transaction.commit();
        }
    }

    public void updateStatusBarColor(String color){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor(color));
        }
    }
}