package com.example.android.universityofthessaly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SecretaryActivityLarisa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secretary);



        if(getIntent().hasExtra("LbiochemistrySecratary") || getIntent().hasExtra("LmedicineSecretary") || getIntent().hasExtra("LnurserySecretary")
        || getIntent().hasExtra("LBusinessAdminSecretary") || getIntent().hasExtra("LaccFinanceSecretary") || getIntent().hasExtra("LenviromentSecretary")
        || getIntent().hasExtra("LenergySysSecretary") || getIntent().hasExtra("LdigitalSysSecretary") || getIntent().hasExtra("LagrotechnologySecretary")
        || getIntent().hasExtra("LanimalProdSecretary")){

            SecretaryLarisaFragment secLarisaFragment = new SecretaryLarisaFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.secretary_fragment_holder,secLarisaFragment);
            transaction.commit();


        } else if( getIntent().hasExtra("LintegbBusinessAdminSecretary") || getIntent().hasExtra("LintegbElecEnginSecretary") || getIntent().hasExtra("LintegbMedicalLabsSecretary")
                || getIntent().hasExtra("LintegbLogisticsSecretary") || getIntent().hasExtra("LintegbCsSecretary") || getIntent().hasExtra("LintegbMechEnginSecretary")
                || getIntent().hasExtra("LintegbNurserySecretary") || getIntent().hasExtra("LintegbCivilEnginSecretary") || getIntent().hasExtra("LintegbAgricultureSecretary")){

           SecretaryLarisaSecondFragment secretaryLarisaSecondFragment = new SecretaryLarisaSecondFragment();
           FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
           transaction.replace(R.id.secretary_fragment_holder,secretaryLarisaSecondFragment);
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