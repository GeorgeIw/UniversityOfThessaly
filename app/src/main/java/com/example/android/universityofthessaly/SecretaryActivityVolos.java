package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SecretaryActivityVolos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secretary);

        if(getIntent().hasExtra("VarchitectureSecretary") || getIntent().hasExtra("VelectricalCsSecretary") || getIntent().hasExtra("VspatianEnginSecretary")
        || getIntent().hasExtra("VmechEnginSecretary") || getIntent().hasExtra("VcivilEnginSecretary") || getIntent().hasExtra("VprimaryEduSecretary")
        || getIntent().hasExtra("VspecialEduSecretary") || getIntent().hasExtra("VpreschoolEduSecretary") ||getIntent().hasExtra("VlingualSecretary")
        || getIntent().hasExtra("VarcheologySecretary") || getIntent().hasExtra("VpolitismIndustrySecretary") || getIntent().hasExtra("VeconomicalScienceSecretary")
        || getIntent().hasExtra("VagroIchtyologySecretary") || getIntent().hasExtra("VagricultureSecretary")){

            SecretaryVolosFragment secretaryVolosFragment = new SecretaryVolosFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.secretary_fragment_holder,secretaryVolosFragment);
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