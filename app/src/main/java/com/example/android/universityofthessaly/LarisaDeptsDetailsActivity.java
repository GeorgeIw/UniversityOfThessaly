package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class LarisaDeptsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depts_details);

        if (getIntent().hasExtra("Biochemistry")) {
            LarisaBiochemistryFragment larisaBiochemistryFragment = new LarisaBiochemistryFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder, larisaBiochemistryFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("Medicine")){
            LarisaMedicineFragment larisaMedicineFragment = new LarisaMedicineFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder, larisaMedicineFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("Nursery")){
            LarisaNurseryFragment larisaNurseryFragment = new LarisaNurseryFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder, larisaNurseryFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("BusinessAdmin")){
            LarisaBusinessAdminFragment larisaBusinessAdminFragment = new LarisaBusinessAdminFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder, larisaBusinessAdminFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("AccFinance")){
            LarisaAccFinanceFragment larisaAccFinanceFragment = new LarisaAccFinanceFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaAccFinanceFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("Environment")){
            LarisaEnviromentFragment larisaEnviromentFragment = new LarisaEnviromentFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaEnviromentFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("HealthSystems")){
            LarisaEnergySystemsFragment larisaHealthSystemsFragment = new LarisaEnergySystemsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaHealthSystemsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("DigitalSystems")){
            LarisaDigitalSysFragment larisaDigitalSysFragment = new LarisaDigitalSysFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaDigitalSysFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("Agriculture")){
            LarisaAgricultureFragment larisaAgricultureFragment = new LarisaAgricultureFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaAgricultureFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("AnimalScience")){
            LarisaAnimalScienceFragment larisaAnimalScienceFragment = new LarisaAnimalScienceFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaAnimalScienceFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("BusinessAdministrationIntegB")){
            LarisaIntegBbusinessAdminFragment larisaIntegBbusinessAdminFragment = new LarisaIntegBbusinessAdminFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBbusinessAdminFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("ElectricalEnginIntegB")){
            LarisaIntegBElectricalEnginFragment larisaIntegBElectricalEnginFragment = new LarisaIntegBElectricalEnginFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBElectricalEnginFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("MedicalLabsIntegB")){
            LarisaIntegBmedicalLabsFragment larisaIntegBmedicalLabsFragment = new LarisaIntegBmedicalLabsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBmedicalLabsFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("AccFinanceIntegB")){
            LarisaIntegBlogisticsFragment larisaIntegBaccFinanceFragment = new LarisaIntegBlogisticsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBaccFinanceFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("ComputerScienceIntegB")){
            LarisaIntegBcomputerScienceFragment larisaIntegBcomputerScienceFragment = new LarisaIntegBcomputerScienceFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBcomputerScienceFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("MechEngineIntegB")){
            LarisaIntegBmechEnginFragment larisaIntegBmechEnginFragment = new LarisaIntegBmechEnginFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBmechEnginFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("NurseryIntegB")){
            LarisaIntegBnurseryFragment larisaIntegBnurseryFragment = new LarisaIntegBnurseryFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBnurseryFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("CivilEnginIntegB")){
            LarisaIntegBcivilEnginFragment larisaIntegBcivilEnginFragment = new LarisaIntegBcivilEnginFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBcivilEnginFragment);
            transaction.commit();
        } else if(getIntent().hasExtra("AgriculturalIntegB")){
            LarisaIntegBagriculturalFragment larisaIntegBagriculturalFragment = new LarisaIntegBagriculturalFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.details_fragment_holder,larisaIntegBagriculturalFragment);
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