package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class LamiaDeptsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depts_details);

        if(getIntent().hasExtra("CSLamia")){
            LamiaCsFragment lamiaCsFragment = new LamiaCsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,lamiaCsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("CSBiomedicineLamia")){
            LamiaCsBiomedicineFragment lamiaCsBiomedicineFragment = new LamiaCsBiomedicineFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,lamiaCsBiomedicineFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("PhysicalTherapyLamia")){
            LamiaPhysicalTherapyFragment lamiaPhysicalTherapyFragment = new LamiaPhysicalTherapyFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,lamiaPhysicalTherapyFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("MathsLamia")){
            LamiaMathsFragment lamiaMathsFragment = new LamiaMathsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,lamiaMathsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("PhysicsLamia")){
            LamiaPhysicsFragment lamiaPhysicsFragment = new LamiaPhysicsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,lamiaPhysicsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("ComputerEngineIntegBLamia")){
            LamiaIntegBcomputerEnginFragment lamiaIntegBcomputerEnginFragment = new LamiaIntegBcomputerEnginFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,lamiaIntegBcomputerEnginFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("PhysicalTherapyIntegBLamia")) {
            LamiaIntegΒphysicalTherapyFragment lamiaIntegbPhysicalTherapyFragment = new LamiaIntegΒphysicalTherapyFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder, lamiaIntegbPhysicalTherapyFragment);
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