package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class KarditsaDeptsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depts_details);

        if(getIntent().hasExtra("KarditsaPublicHealth")){
            KarditsaPublicHealthFragment karditsaPublicHealthFragment = new KarditsaPublicHealthFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,karditsaPublicHealthFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("KarditsaVet")){
            KarditsaVetFragment karditsaVetFragment = new KarditsaVetFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,karditsaVetFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("KarditsaForestryWood")){
            KarditsaForestryWoodFragment karditsaForestryWoodFragment = new KarditsaForestryWoodFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,karditsaForestryWoodFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("KarditsaFoodScience")){
            KarditsaFoodScienceFragment karditsaFoodScienceFragment = new KarditsaFoodScienceFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,karditsaFoodScienceFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("KarditsaIntegBForestry")){
            KarditsaIntegBForestryFragment karditsaIntegBForestryFragment = new KarditsaIntegBForestryFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,karditsaIntegBForestryFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("KarditsaIntegBDiet")){
            KarditsaIntegBDietFragment karditsaIntegBDietFragment = new KarditsaIntegBDietFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,karditsaIntegBDietFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("KarditsaIntegBWood")){
            KarditsaIntegBwoodDesignFragment karditsaIntegBwoodDesignFragment = new KarditsaIntegBwoodDesignFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,karditsaIntegBwoodDesignFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("KarditsaIntegBFoodScience")){
            KarditsaIntegBFoodScienceFragment karditsaIntegBFoodScienceFragment = new KarditsaIntegBFoodScienceFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,karditsaIntegBFoodScienceFragment);
            transaction.commit();
        }
    }

    public void updateStatusBarColor(String color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor(color));
        }
    }
}