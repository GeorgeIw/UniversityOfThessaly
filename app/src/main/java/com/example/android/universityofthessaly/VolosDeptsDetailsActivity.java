package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class VolosDeptsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depts_details);

        if(getIntent().hasExtra("ArchitectureVolos")){
            VolosAchitectureFragment volosAchitectureFragment = new VolosAchitectureFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosAchitectureFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("ElectricalCsVolos")){
            VolosArchitectureCsFragment volosAchitectureFragment = new VolosArchitectureCsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosAchitectureFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("SpatialEnginVolos")){
            VolosSpacialEnginFragment volosSpacialEnginFragment = new VolosSpacialEnginFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosSpacialEnginFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("MechEngineVolos")){
            VolosMechEnginFragment volosMechEnginFragment = new VolosMechEnginFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosMechEnginFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("CivilEngineVolos")){
            VolosCivilEnginFragment volosCivilEnginFragment = new VolosCivilEnginFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosCivilEnginFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("PrimaryEducationVolos")){
            VolosPrimaryEducationFragment volosPrimaryEducationFragment = new VolosPrimaryEducationFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosPrimaryEducationFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("SpecialEducationVolos")){
            VolosSpecialEducationFragment volosSpecialEducationFragment = new VolosSpecialEducationFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosSpecialEducationFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("PreschoolEducationVolos")){
            VolosPreschoolEducationFragment volosPreschoolEducationFragment = new VolosPreschoolEducationFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosPreschoolEducationFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("LinguInterculturalVolos")){
            VolosLinguInterculturalFragment volosLinguInterculturalFragment = new VolosLinguInterculturalFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosLinguInterculturalFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("ArcheologyAnthropologyVolos")){
            VolosArcheologyAnthrFragment volosArcheologyAnthrFragment = new VolosArcheologyAnthrFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosArcheologyAnthrFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("PolitismIndustryVolos")){
            VolosPolitismIndustryFragment volosPolitismIndustryFragment = new VolosPolitismIndustryFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosPolitismIndustryFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("EconomicalScienceVolos")){
            VolosEconomicalScienceFragment volosEconomicalScienceFragment = new VolosEconomicalScienceFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosEconomicalScienceFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("AgronomyIchthyologyVolos")){
            VolosAgronomyIchthyology volosAgronomyIchthyology = new VolosAgronomyIchthyology();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosAgronomyIchthyology);
            transaction.commit();
        } else {
            VolosAgricultureFragment volosAgricultureFragment = new VolosAgricultureFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,volosAgricultureFragment);
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