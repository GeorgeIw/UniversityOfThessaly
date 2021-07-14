package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class TrikalaDeptsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depts_details);

        if(getIntent().hasExtra("TrikalaDiet")){
            TrikalaDietFragment trikalaDietFragment = new TrikalaDietFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,trikalaDietFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("TrikalaPhysicalEdu")){
            TrikalaPhysicalEduFragment trikalaPhysicalEduFragment = new TrikalaPhysicalEduFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,trikalaPhysicalEduFragment);
            transaction.commit();
        } else {
            TrikalaCivilEnginFragment trikalaCivilEnginFragment = new TrikalaCivilEnginFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,trikalaCivilEnginFragment);
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